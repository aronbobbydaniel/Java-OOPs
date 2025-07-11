import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int origin=number;
		int reverse=0,remainder;
		while (number>0) {
			remainder=number%10;
			reverse=reverse*10 + remainder;
			number=number/10;
			
		}
		if(origin==reverse) {
			System.out.println("The Number is palindrome.");
		
		}else {
			System.out.println("The Number is not palindrome.");
		}
	}

}
