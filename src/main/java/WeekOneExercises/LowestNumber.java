package WeekOneExercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class LowestNumber
{

	public static void lowestElementOfRandomArray(int numberOfElements)
	{
		Random element = new Random();
		List array = new ArrayList(numberOfElements);
		System.out.print("Array with random numbers: ");
		for (int i = 0; i < numberOfElements; i++) {
			array.add(element.nextInt());
			System.out.print(array.get(i) + " ");
		}

		System.out.println("\n" + "Lowest element is =" + Collections.min(array));
	}
}
