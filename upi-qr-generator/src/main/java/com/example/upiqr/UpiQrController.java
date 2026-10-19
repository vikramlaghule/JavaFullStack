package com.example.upiqr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.util.EnumMap;
import java.util.Map;

@RestController
@RequestMapping("/api/qr")
public class UpiQrController {

    // Change these values if needed.
    private static final String UPI_ID = "9021492414@kotakbank";
    private static final String PAYEE_NAME = "Recipient";

    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQr(
            @RequestParam double amount) throws Exception {

        if (!Double.isFinite(amount) || amount <= 0 || amount > 10000000) {
            return ResponseEntity.badRequest().build();
        }

        String upiUri = String.format(
                java.util.Locale.US,
                "upi://pay?pa=%s&pn=%s&am=%.2f&cu=INR",
                urlEncode(UPI_ID),
                urlEncode(PAYEE_NAME),
                amount
        );

        byte[] png = createQrPng(upiUri, 600, 600);

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(png);
    }

    @GetMapping("/data")
    public Map<String, String> getUpiData(@RequestParam double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        String uri = String.format(
                java.util.Locale.US,
                "upi://pay?pa=%s&pn=%s&am=%.2f&cu=INR",
                urlEncode(UPI_ID),
                urlEncode(PAYEE_NAME),
                amount
        );

        return Map.of(
                "upiId", UPI_ID,
                "payeeName", PAYEE_NAME,
                "amount", String.format(java.util.Locale.US, "%.2f", amount),
                "upiUri", uri
        );
    }

    private byte[] createQrPng(String data, int width, int height)
            throws WriterException, java.io.IOException {

        Map<EncodeHintType, Object> hints = new EnumMap<>(EncodeHintType.class);
        hints.put(EncodeHintType.MARGIN, 2);
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        BitMatrix matrix = new MultiFormatWriter().encode(
                data,
                BarcodeFormat.QR_CODE,
                width,
                height,
                hints
        );

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(matrix, "PNG", output);
        return output.toByteArray();
    }

    private String urlEncode(String value) {
        return java.net.URLEncoder.encode(
                value,
                java.nio.charset.StandardCharsets.UTF_8
        );
    }
}
