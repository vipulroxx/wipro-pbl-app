import java.io.*;
class Author
{
	public String name;
	public String email;
	public char gender;

	Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}
class Book
{
	public String name;
	public Author author;
	public double price;
	public int qtyInStock;

	Book(String name, Author author, double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public Author getAuthor()
	{
		return this.author;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return this.price;
	}

	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}

	public int getQtyInStock()
	{
		return this.qtyInStock;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter book details :- ");
		System.out.print("Enter book name : ");
		String bookName = in.readLine();
		System.out.print("Enter price of the book : ");
		double priceBook = Double.parseDouble(in.readLine());
		System.out.print("Enter quantity of books in stock : ");
		int quantityBook = Integer.parseInt(in.readLine());
		System.out.println("Enter author details :- ");
		System.out.print("Enter name of the author : ");
		String authorName = in.readLine();
		System.out.print("Enter email address of the author : ");
		String authorEmail = in.readLine();
		System.out.print("Enter gender (M/F) of the author : ");
		char authorGender = (char)in.read();
		Author author = new Author(authorName, authorEmail, authorGender);
		Book book = new Book(bookName, author, priceBook, quantityBook);
		book.setName(bookName);
		book.setPrice(priceBook);
		book.setAuthor(author);
		book.setQtyInStock(quantityBook);
		System.out.print("Name of the book : " + book.getName());
		System.out.println();
		System.out.print("Name of the author : " + author.name);
		System.out.println();
		System.out.print("Email of the author : " + author.email);
		System.out.println();
		System.out.print("Gender of the author : " + author.gender);
		System.out.println();
		System.out.print("Price of the book : " + book.getPrice());
		System.out.println();
		System.out.print("Books in stock : " + book.getQtyInStock());
		System.out.println();
	}
}

