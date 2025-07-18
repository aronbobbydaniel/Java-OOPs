package s3;


class Book{
	 String Title;
	 String Author;
	 double price;
	
	
	Book(){
		Title="Unknown";
		Author="Not Assigned";
		price=0.0;
	}
	
	public void displayDetails() {
		System.out.println("Title:\t"+Title);
		System.out.println("Author:\t"+Author);
		System.out.println("Price:\t"+price);
		
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		Book Bookc=new Book();
		Bookc.displayDetails();
			
			
		}
	}
 

