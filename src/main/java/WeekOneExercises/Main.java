package WeekOneExercises;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Sum of the first 100 numbers is = " + (100*101)/2);

		//Check if a number is a palindrome
		PalindromeCheck palindrome = new PalindromeCheck("123454321");
		if (palindrome.isPalindrome(palindrome.word))
		{
			System.out.println("The word " + palindrome.word + " is a palindrome");
		}
		else
		{
			System.out.println("The word " + palindrome.word + " is not a palindrome");
		}

		/*Based of the input number of elements an array with random numbers will be created
		and lowest one will be displayed*/
		LowestNumber ln =  new LowestNumber(10);
		ln.lowestElementOfAnArray(ln.numberOfElements);

		//Find ouf max digit of following number
		MaxDigit md = new MaxDigit(442367653);
		md.maxDigitOfNumber(md.number);

		//Print a list of all prime numbers smaller than input maxNumber
		PrimeList primes = new PrimeList(20);
		primes.listPrimeNumber(primes.maxNumber);
	}
}
