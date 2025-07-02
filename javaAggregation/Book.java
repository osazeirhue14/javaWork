package practice;

public class Book {
	
	int pages;
	String title;
	
	Book(String title, int pages){
		this.title=title;
		this.pages=pages;
	}
	void showDetails() {
		System.out.println(this.title+ " has "+this.pages+" pages");
	}

}
