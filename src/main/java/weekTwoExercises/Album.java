package weekTwoExercises;
public class Album extends Book
{
	String paperQuality;

	Album(String bookName, Integer noOfPages, String paperQuality)
	{
		super(bookName,noOfPages);
		this.paperQuality = paperQuality;
	}

	@Override
	public String toString()
	{
		return "Book=" + bookName +
				"has " + noOfPages + " pages and it is a"
				+ paperQuality + " paperquality";
	}
}
