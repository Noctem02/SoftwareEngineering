package co.edu.poli.prototype3.model;

public class Book extends Item {

	private String ISBN;
	
	private String author;
	
	private int year;
	
	private String publisher;
	
	private String title;
	
	private int[] numPages;

	
	public Book(String iSBN, String author, int year, String pubisher, String title, int[] numPages) {
		super();
		ISBN = iSBN;
		this.author = author;
		this.year = year;
		this.publisher = pubisher;
		this.title = title;
		this.numPages = numPages;
	}
	
	private Book (Book b) {
		this.ISBN=b.ISBN;
		this.author=b.author;
		this.year=b.year;
		this.publisher=b.publisher;
		this.title=b.title;
		this.numPages=b.numPages;
	}
	

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String pubisher) {
		this.publisher = pubisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int[] getNumPages() {
		return numPages;
	}

	public void setNumPages(int[] numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", author=" + author + ", year=" + year + ", publisher=" + publisher
				+ ", title=" + title + ", numPages=" + numPages.length + "]";
	}
	
	@Override 
	public Object cloneObj() {
		return new Book(this);
	}

	@Override
	public int goTo(int location) {
		return numPages[location];
	}

}
