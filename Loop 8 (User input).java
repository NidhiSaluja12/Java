
import java.util.Scanner;

public class loop7_userInput {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		char choice;
		int n, count = 0 ;
		
		do {
			System.out.println("Enter a number: ");
			n = sc.nextInt();
			count ++;
			System.out.println("The number is: "+n);
			System.out.println("Do you want to add more numbers?");
			choice = sc.next().charAt(0);
			
			}while(choice=='Y'||choice=='y');
	
		System.out.println("Your have entered "+count+" values");	
		
	}
	

}
