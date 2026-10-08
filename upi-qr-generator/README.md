# UPI QR Generator

A simple Spring Boot application that lets a user enter an amount and generates
a fixed-amount UPI payment QR code.

## Configuration

Open:

`src/main/java/com/example/upiqr/UpiQrController.java`

Change:

```java
private static final String UPI_ID = "hrlaghule-axix";
private static final String PAYEE_NAME = "Recipient";
```

Set `PAYEE_NAME` to the name you want displayed in the UPI payment request.

## Requirements

- Java 17+
- Maven 3.9+

## Run

From the project directory:

```bash
mvn spring-boot:run
```

Then open:

`http://localhost:8080`

## Build a JAR

```bash
mvn clean package
```

Then:

```bash
java -jar target/upi-qr-generator-1.0.0.jar
```

## How it works

If the user enters 500, the server creates a UPI URI equivalent to:

```text
upi://pay?pa=hrlaghule-axix&pn=Recipient&am=500.00&cu=INR
```

and converts that URI into a PNG QR code using ZXing.

## Important

This project only creates a UPI payment QR. It does not receive, verify,
settle, or track payments. A successful payment must be confirmed through
your bank/UPI provider.

Do not put UPI PINs, OTPs, card PINs, or banking passwords into this app.
