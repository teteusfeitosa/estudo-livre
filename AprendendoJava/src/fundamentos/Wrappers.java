package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// byte
		Byte a = 100;
		Short b = 200;
		Integer i = 1000; //int
				//Integer.parseInt(scanner.next()); "1000" no lugar do scanner.nextLine();
		Long l = 2000L;
		
		System.out.println(a.byteValue());
		System.out.println(b.toString());
		System.out.println(i * 3);
		System.out.println(l / 3.0);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		
		Float f = 123F;
		System.out.println(f);

		Double d = 12234D;
		System.out.println(d);
		
		scanner.close();
	}

}
