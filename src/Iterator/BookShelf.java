package Iterator;

public class BookShelf {
	private Book[] books;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public int getLength() {
		return this.books.length;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator();
	}
}
