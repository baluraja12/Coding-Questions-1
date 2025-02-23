package string;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String userInput = input.nextLine();

		String[] words = userInput.split(" ");

		StringBuilder reverse = new StringBuilder();

		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			reverse.append(sb.reverse()).append(" ");
		}
		System.out.println(userInput);
		System.out.println(reverse.toString().trim());
	}
	
}
