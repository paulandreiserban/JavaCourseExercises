package weekTwoExercises;
public class Novel extends Book
{
	String type;
	Novel(String bookName, Integer noOfPages, String type)
	{
		super(bookName,noOfPages);
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "Book " + bookName +
				" has " + noOfPages + " pages and it is a "
				+ type + " novel";
	}
}
