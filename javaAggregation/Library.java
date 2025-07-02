package practice;

public class Library {
	String name;
	int year;
	Book [] books;
	
	Library(String name, int year, Book [] books){
		this.name = name;
		this.year=year;
		this.books = books;
	}
	void showDetails() {
		System.out.println(this.name+" founded in the year "+this.year);
		System.out.println("Available books at the  moment: ");
		for(Book book:books) {
			book.showDetails();
		}
	}

}
