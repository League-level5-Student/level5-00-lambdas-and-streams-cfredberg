package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse().toString());
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(s.toUpperCase().charAt(i));
				}else {
					System.out.print(s.toLowerCase().charAt(i));
				}
			}
		}, "repeat");
		
		System.out.println();
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				if (i < s.length()-1) {
					System.out.print(".");
				}
			}
		}, "repeat");
		System.out.println();
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
			for (int i = 0; i < s.length(); i++) {
				boolean isVowel = false;
				for (char ch : vowels) {
					if (s.charAt(i) == ch) {
						isVowel = true;
					}
				}
				if (!isVowel) {
					System.out.print(s.charAt(i));
				}
			}
		}, "repeat");
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
