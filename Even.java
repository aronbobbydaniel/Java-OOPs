import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();
		for(int i=2;i<=limit;i+=2) {
			System.out.println("Even Numbers are " + i);
			
			
		}
		
	}

}
