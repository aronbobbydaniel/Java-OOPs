package package8;

class book{
	String title;
	String author;
	double price;
book(String title,String author,double price) {
	this.title=title;
	this.author=author;
	this.price=price;
	
}
public void displaydetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		
}


}
class Ebook extends book{
	double fileSizeMB;
	Ebook(String title,String author,double price,double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
		
	}
public void displaydetails() {
	super.displaydetails();
	System.out.println("FileSIze:"+fileSizeMB);
}
	
	
}
class PrintedBook extends book{
	int numberOfPages;
	PrintedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
		
	}
	public void displaydetails() {
		super.displaydetails();
	System.out.println("Number of Pages:"+numberOfPages);
	}
}






public class Inheritance {

	public static void main(String[] args) {
		book book1=new book("Harry","Pace",78.00);
		book1.displaydetails();
		Ebook book2=new Ebook("jjj","eff",56.0,67.0);
		book2.displaydetails();
		PrintedBook book3=new PrintedBook("ffr","rttr",78.0,45);
		book3.displaydetails();

	}

}
