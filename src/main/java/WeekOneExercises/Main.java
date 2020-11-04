package WeekOneExercises;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Sum of the first 100 numbers is = " + (100*101)/2);

		//Check if a number is a palindrome
		PalindromeCheck.checkPalindrome("123454321");
		PalindromeCheck.checkPalindrome("12133232");

		/*Based of the input number of elements an array with random numbers will be created
		and lowest one will be displayed*/
		LowestNumber.lowestElementOfRandomArray(10);

		//Find ouf max digit of following number
		MaxDigit md = new MaxDigit();
		md.maxDigitOfNumber(438434673);

		//Print a list of all prime numbers smaller than input maxNumber
		PrimeList.listPrimeNumberLowerThan(20);
	}
}
