class BookExecutor{
	
	public static void main(String args[]){
	 
	 Book books[] = new Book[15];
		
		Book book1 = new Book();
		book1.bookId = 1;
		book1.bookName = "Head First Java";
		book1.bookType = "Beginner";
		book1.bookPrice = 800.0;
		book1.bookAuthor = "Kathy Sierra";
		books[0] = book1;

		
		Book book2 = new Book();
		book2.bookId = 2;
		book2.bookName = "Effective Java";
		book2.bookType = "Advanced";
		book2.bookPrice = 1200.0;
		book2.bookAuthor = "Joshua Bloch";
		books[1] = book2;

		
		Book book3 = new Book();
		book3.bookId = 3;
		book3.bookName = "Java Complete Reference";
		book3.bookType = "Comprehensive";
		book3.bookPrice = 1300.0;
		book3.bookAuthor = "Herbert Schildt";
		books[2] = book3;

		
		Book book4 = new Book();
		book4.bookId = 4;
		book4.bookName = "Core Java Volume I";
		book4.bookType = "Fundamentals";
		book4.bookPrice = 1400.0;
		book4.bookAuthor = "Cay Horstmann";
		books[3] = book4;

		
		Book book5 = new Book();
		book5.bookId = 5;
		book5.bookName = "Thinking in Java";
		book5.bookType = "Advanced";
		book5.bookPrice = 1000.0;
		book5.bookAuthor = "Bruce Eckel";
		books[4] = book5;

		
		Book book6 = new Book();
		book6.bookId = 6;
		book6.bookName = "Java Beginner Guide";
		book6.bookType = "Beginner";
		book6.bookPrice = 900.0;
		book6.bookAuthor = "Herbert Schildt";
		books[5] = book6;

		
		Book book7 = new Book();
		book7.bookId = 7;
		book7.bookName = "Java for Dummies";
		book7.bookType = "Beginner";
		book7.bookPrice = 1100.0;
		book7.bookAuthor = "Barry Burd";
		books[6] = book7;

		
		Book book8 = new Book();
		book8.bookId = 8;
		book8.bookName = "Programming with Java";
		book8.bookType = "Academic";
		book8.bookPrice = 700.0;
		book8.bookAuthor = "Balagurusamy";
		books[7] = book8;

		
		Book book9 = new Book();
		book9.bookId = 9;
		book9.bookName = "Let Us Java";
		book9.bookType = "Beginner";
		book9.bookPrice = 600.0;
		book9.bookAuthor = "Yashavant Kanetkar";
		books[8] = book9;

		Book book10 = new Book();
		book10.bookId = 10;
		book10.bookName = "Java Programming Language";
		book10.bookType = "Reference";
		book10.bookPrice = 1500.0;
		book10.bookAuthor = "James Gosling";
		books[9] = book10;

		
		Book book11 = new Book();
		book11.bookId = 11;
		book11.bookName = "Java Concurrency in Practice";
		book11.bookType = "Advanced";
		book11.bookPrice = 1600.0;
		book11.bookAuthor = "Brian Goetz";
		books[10] = book11;

		
		Book book12 = new Book();
		book12.bookId = 12;
		book12.bookName = "Modern Java in Action";
		book12.bookType = "Intermediate";
		book12.bookPrice = 1700.0;
		book12.bookAuthor = "Raoul Urma";
		books[11] = book12;

		
		Book book13 = new Book();
		book13.bookId = 13;
		book13.bookName = "Spring in Action";
		book13.bookType = "Framework";
		book13.bookPrice = 2000.0;
		book13.bookAuthor = "Craig Walls";
		books[12] = book13;

		
		Book book14 = new Book();
		book14.bookId = 14;
		book14.bookName = "Java Puzzlers";
		book14.bookType = "Advanced";
		book14.bookPrice = 1300.0;
		book14.bookAuthor = "Joshua Bloch";
		books[13] = book14;

	
		Book book15 = new Book();
		book15.bookId = 15;
		book15.bookName = "Well Grounded Java Developer";
		book15.bookType = "Intermediate";
		book15.bookPrice = 1600.0;
		book15.bookAuthor = "Benjamin Evans";
		books[14] = book15;
			 
	 
	 for( Book ref : books){
		 
		 System.out.println("The Book id is:"+ref.bookId);
		 System.out.println("The Book Name is:"+ref.bookName);
		 System.out.println("The Book Type is:"+ref.bookType);
		 System.out.println("The Book Price is:"+ref.bookPrice);
		 System.out.println("The Book Author is:"+ref.bookAuthor);
		 System.out.println("----------------------------------");

		 
	 }
	
	}
}