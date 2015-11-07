package domain;

public class Book {
	
	public static final int BORROWED = 1;
	public static final int AVAILABLE = 0;
	
	Integer bookId;
	String name;
	int state;
	
	public Book(Integer bookId, String name, int state) {
		setBookId(bookId);
		setName(name);
		setState(state);
	}
	
	private void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	private void setName(String name) {
		this.name = name;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public Integer getBookId() {
		return bookId;
	}
	public String getName() {
		return name;
	}
	public int getState() {
		return state;
	}
}
