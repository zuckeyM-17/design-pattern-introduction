package Iterator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteratorTest {

	@Test
	void testBookGetName() {
		Book book = new Book("dummyName");
		assertEquals("dummyName", book.getName());
	}
	
	@Test
	void testBookShelfCreatesIterator() {
		BookShelf bookShelf = new BookShelf(10); 
		assertTrue(bookShelf.iterator() instanceof Iterator);
	}
	
	@Test
	void testBookShelfMaxSize() {
		BookShelf bookShelf = new BookShelf(10);
		assertEquals(10, bookShelf.getLength());
	}
}
