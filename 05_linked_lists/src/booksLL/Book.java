package booksLL;

public class Book {

	static int bookIdCount;
	private int bookId;
	private String title;
	protected double price;
	
	public Book() {
		bookIdCount++;
		bookId = bookIdCount;
	}

	public Book(String title, double p) {
		bookIdCount++;
		bookId = bookIdCount;
		this.title = title;
		price = p;
	}

	public String getTitle() {
		return title;
	}

	public void displayBook() {
		System.out.println("Book Title:" + title + "--> Book ID:" + bookId + " --> Price: " + price);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
}
