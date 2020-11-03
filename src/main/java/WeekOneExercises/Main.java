package WeekOneExercises;
public class Main
{
	public static void main(String[] args)
	{

		PalindromeCheck palindrome = new PalindromeCheck("123454321");
		if (palindrome.isPalindrome(palindrome.word))
		{
			System.out.println("The word " + palindrome.word + " is a palindrome");
		}
		else
		{
			System.out.println("The word " + palindrome.word + " is not a palindrome");
		}
	}
}
