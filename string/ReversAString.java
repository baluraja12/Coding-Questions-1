package string;

import java.util.*;

public class ReversAString {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a string : ");
     String userInput = input.nextLine();
     String reverse = new StringBuilder(userInput).reverse().toString();
     
     System.err.println("Revser string is :" +reverse);
	}
	

}
