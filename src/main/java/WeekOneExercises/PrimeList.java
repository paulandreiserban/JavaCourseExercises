package WeekOneExercises;
public class PrimeList
{
	private static boolean isPrime(int number)
	{
		for(int i = 2; i <= number/2; ++i)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void listPrimeNumberLowerThan(int maxNumber)
	{
		System.out.print("All the prime numbers smaller than " + maxNumber + " are: ");
		for(int i = 1; i <= maxNumber; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i + " ");
			}
		}
	}
}
