import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the grade");
	int grade=sc.nextInt();
	int mark=85;
	if(mark >=90) {
	 System.out.println("Grade A");
	 } else if (mark <= 75) {
		 System.out.println("Grade B");
	 } else {
		 System.out.println("Grade c");
	 }
	sc.close();
	
	 }
	

}
