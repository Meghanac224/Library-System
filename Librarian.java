import java.util.Scanner;
class Librarian
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("[1] Book List \n [2] Search \n [3] Category \n [4] Taken Books\n [5] Add Books\n [6] Delete Books\n");
		System.out.println("Choose option:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:
				//BookList();
				System.out.println("Book list");
				break;
			case 2:
				//Search();
				System.out.println("Search");
				break;
			case 3:
				//Category();
				System.out.println("Category");
				break;
			case 4:
				//TakenBooks();
				System.out.println("ISSUED BOOKS");
				break;
			case 5:
				//AddBook();
				System.out.println("Add Book");
				break;
			case 6:
				//DeleteBook();
				System.out.println("Delete Book");
			default:
				System.out.println("Choose valid option :");
				break;
				
		}
		displaybookdetails();
		
	}
	public static void displaybookdetails()
	{
		BookList obj=new BookList(1234,"hello","Meghana");
		System.out.println("Isbn="+obj.isbn+"\nTitle="+obj.title+"\nAuthor="+obj.author);
	}
}
class BookList
{
	int isbn;
	String title;
	String author;
	BookList(int isbn,String title,String author)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
	}
}

		
	