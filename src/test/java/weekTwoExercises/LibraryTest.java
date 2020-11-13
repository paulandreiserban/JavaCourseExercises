package weekTwoExercises;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
public class LibraryTest
{
	Library lib;

	@Test
	public void testAddBook(){
		populateLibrary();
		int librarySize = lib.getBooks().size();
		Book novel1 = new Novel("THE GREAT GATSBY", 670, "fantasy");
		Book album1 = new Album("National geographic", 467, "HardCover");
		lib.addBook(novel1);
		lib.addBook(album1);
		Assert.assertEquals(librarySize + 2 , lib.getBooks().size());
	}

	@Test
	public void testRemoveBook(){
		populateLibrary();
		int librarySize = lib.getBooks().size();
		Book book = lib.getBookByName("1984");
		lib.deleteBook(book);
		Assert.assertEquals(librarySize - 1 , lib.getBooks().size());
	}

	private void populateLibrary()
	{
		lib =  new Library();
		Book novel1 = new Novel("1984", 450, "mistery");
		Book novel3 = new Novel("WINESBURG", 450, "romance");
		Book album1 = new Album("National geographic", 467, "HardCover");
		Book album2 = new Album("Romanian nature", 467, "Paperback");
		lib.addBook(novel1);
		lib.addBook(novel3);
		lib.addBook(album1);
		lib.addBook(album2);
	}
}
