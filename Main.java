import java.util.Scanner;

class Book
{
    String name;
    String author;
    double price;
    int num_pages;
    
    Book(String n, String a, double pr, int pg)
    {
	name=n;
	author=a;
	price=pr;
	num_pages=pg;
    }
    
    public String toString()
    {
	String s= "Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of pages: "+num_pages;
	return s;
    }
    
}

class Main
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	Scanner sc4 = new Scanner(System.in);
	Scanner sc5 = new Scanner(System.in);

	System.out.println("Enter the number of objects: ");
	int n=sc.nextInt();
	Book ob[] = new Book[n];

	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter the name of the book: ");
	    String name=sc2.nextLine();
	    System.out.println("Enter the author of the book: ");
	    String author=sc3.nextLine();
	    System.out.println("Enter the price of the book: ");
	    double price=sc4.nextDouble();
	    System.out.println("Enter the number of pages in the book: ");
	    int num=sc5.nextInt();
	    ob[i]=new Book(name,author,price,num);	
	}
	
	for(int i=0;i<n;i++)
 	System.out.println(ob[i]);
	
    }
}


















