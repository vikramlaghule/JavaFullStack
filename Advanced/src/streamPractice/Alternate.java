package streamPractice;

import java.util.stream.IntStream;

public class Alternate {
    public static void main(String[] args) {
	IntStream.rangeClosed(1, 100).
	filter(s->s%2==0).
	forEach(System.out::println);
	
    }
}
