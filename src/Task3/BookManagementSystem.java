package Task3;

import java.util.Scanner;

public class BookManagementSystem {
	
	
	public static void main(String[] args) {
		Library library=new Library(5);
//		Book books1=new Book();
		Scanner sc= new Scanner(System.in);
		while(true){
			System.out.println("Book Management System Menu:");
	        System.out.println("1. Add Book");
	        System.out.println("2. Remove Book");
	        System.out.println("3. Search Book");
	        System.out.println("4. Display Books");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        if(choice==1) {
	        	System.out.print("Enter Book ID: ");
	            int bookId = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            System.out.print("Enter Title: ");
	            String title = sc.nextLine();
	            System.out.print("Enter Author: ");
	            String author = sc.nextLine();
	            System.out.print("Enter availablity: ");
	            boolean isAvailable =sc.nextBoolean();
	            Book newBook = new Book(bookId, title, author, isAvailable);
	            library.addBook(newBook);
	            

	        	
	        } else if(choice==2) {
	        	System.out.print("Enter Book ID to remove: ");
	            int removeID = sc.nextInt();
	            library.removeBook(removeID);
	            
	        	
	        } else if (choice==3) {
	        	System.out.print("Enter Book ID to search: ");
	            int searchID = sc.nextInt();
	            Book BookSearched=library.searchBook(searchID);
	            if(BookSearched !=null ) {
	            	System.out.println(BookSearched.getTitle() + "   "+ BookSearched.getAuthor() + "   "+ BookSearched.getBookId());
	            } else {
	            	System.out.println("Unavailable");
	            }
	            
	        	
	        } else if(choice==4) {
	        	library.displaceBooks();
	        
	        	
	        } else if(choice==5) {
	        	System.out.print("Exit");
	        	break;
	        } else {
	        	System.out.println("Invalid choice, please enter a number from 1 to 5!!");
	        	
	        }
		} 
	}

}
