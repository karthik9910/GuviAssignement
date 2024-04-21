package Task3;

public class Library {
	
	private Book books[];
	int numBooks;

	public Library(int count) {
		this.books = new Book[count];
		numBooks=0;
	}
	
	
	void addBook(Book book) {
		if(numBooks<books.length) {
			books[numBooks]=book;
			numBooks++;
			System.out.print("Books added successfully!!");
		}else 
			System.out.print("Books can't be added!!");
		
	}
		
	 public Book searchBook(int bookID) {
		 int i=0;
	     while(i < numBooks){
	            if (books[i].getBookId() == bookID) {
	                return books[i];
	            }
	            i++;
	     }
	        return null;
	 }

	
	void removeBook(int bookID) {
		int i=0;
		while(i<numBooks) {
			if(books[i].getBookId()==bookID) {
				 numBooks--;
	                System.out.println("Removed Book successfully!!");
			}
			i++;
		}
		 System.out.println("Book not found in the library!!");
		
	}
	
	
	void displaceBooks() {
		
		  
	        
	       while(true) {
	        	if(numBooks>0) {
	        		 System.out.println("Books available in the library:");
	        		 int i = 0; 
	        		 while(i < numBooks){
	        			 System.out.println(books[i].getTitle() + " by " + books[i].getAuthor());
	        			 i++;
	        			 
	        		 }
	        		 break;
	        	} else {
	        		System.out.println("No Book available");
	        		break;
	        	}
	            
	        }
	}
	

}
