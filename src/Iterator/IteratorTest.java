package Iterator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteratorTest {

	@Test
	void testBookGetName() {
		Book book = new Book("dummyName");
		assertEquals("dummyName", book.getName());
	}
}
