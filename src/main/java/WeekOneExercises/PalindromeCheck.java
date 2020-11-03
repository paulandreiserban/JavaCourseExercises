package WeekOneExercises;
public class PalindromeCheck
{
	String word;

	PalindromeCheck(String word){
		this.word = word;
	}

	public boolean isPalindrome (String word)
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
}

