package streamMethods;

import java.util.Arrays;

public class One{
	public static void main(String[] args)
	{
		String s="annsa";
		String s2="nana";
		char[] one=s.toCharArray();
		char[] two=s2.toCharArray();
		Arrays.sort(one);
		Arrays.sort(two);
		System.out.println(Arrays.equals(one, two));
		
		
		
	}
}