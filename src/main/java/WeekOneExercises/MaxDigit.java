package WeekOneExercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MaxDigit
{

	public void maxDigitOfNumber(int number)
	{
		List array = new ArrayList(String.valueOf(number).length());
		for (int i = 0; i < String.valueOf(number).length(); i++) {
			array.add(String.valueOf(number).substring(i,i+1));
		}

		System.out.println("Max digit of number " + number + " is = " + Collections.max(array));
	}
}
