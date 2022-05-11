package basic;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {

		System.out.println("장".equals("장동건"));
		System.out.println("장.*".equals("장동건"));

		System.out.println(Pattern.matches("장", "장동건"));
		System.out.println(Pattern.matches("장.", "장동건"));
		System.out.println(Pattern.matches("장.", "장독"));
		
		System.out.println(Pattern.matches("장.*", "장동건"));
		System.out.println(Pattern.matches("장.*", "장독"));
	}

}
