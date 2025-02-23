package string;

public class SumOfdigitsInString {

	public static void main(String[] args) {
		String s = "bamg1d4skk5a";

		int sum = s.chars()
				.filter(Character::isDigit)
				.map(Character::getNumericValue).sum();

		System.out.println("Sum of didgits in a given string is: " + sum);

	}

}
