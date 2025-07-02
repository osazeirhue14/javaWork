package practice;

//import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
	
		
		Book book1 = new Book("Pirates of the Caribbean",100);
		Book book2 = new Book("Diary of a Wimpy Kid",200);
		Book book3 = new Book("The Holy Bible",300);
		
		Book [] books = {book1, book2, book3};
		
		Library library = new Library("The NYC Library", 1996, books);
		
		//book1.showDetails();
		//book2.showDetails();
		//book3.showDetails();
		
		library.showDetails();
		
		
		
	}
}
