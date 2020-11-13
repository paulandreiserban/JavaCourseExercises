package weekOneExercises;
public class PalindromeCheck
{
	private static boolean isPalindrome (String word)
	{
		for(int i=0;  i <= (word.length() / 2); i = i +1)
		{
			if(!word.substring(i,i+1).equals(word.substring(word.length() - 1 - i, word.length() - i)))
			{
				return false;
			}
			else
			{
				i = i + 1;
			}
		}
		return  true;
	}

	public static void checkPalindrome(String word)
	{
		if (isPalindrome(word))
		{
			System.out.println(word + " is a palindrome");
		}
		else
		{
			System.out.println(word + " is not a palindrome");
		}
	}
}

