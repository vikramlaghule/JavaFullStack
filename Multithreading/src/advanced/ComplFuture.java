package advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComplFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> greetings=CompletableFuture.supplyAsync(()->{
			int i=0;
			while(i<100) {
				System.out.println("Hello World");
				i++;
			}
			return "Hello this is Completable Future";
		});
		
		greetings.get();
		
		System.out.println("*******END*******");
		
		
		
	}
}
