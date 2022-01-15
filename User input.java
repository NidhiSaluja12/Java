package class_2;
import java.util.Scanner;

public class user_input {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in); //Scanner is a class in java
		
		// System.in = input
		// System.out = output
		
		System.out.println("Enter your name: ");
		String nm = sc.next();
				// = next catches the value and put it in nm
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your height: ");
	    double ht = sc.nextDouble();
	    
	    System.out.println("Are you married? ");
		boolean status = sc.nextBoolean();
		
		System.out.println("Hello "+nm);
		System.out.println("Your age is "+age);
		System.out.println("Your height is "+ht);
		System.out.println("Your are married? "+status);
		
	}

}
