
import java.util.*;

public class switch_case {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=20,b=30,ans = 0;
		
		System.out.println("Enter 2 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter your choice:  ");
		char choice = sc.next().charAt(0);
		
//		switch(choice) {
//		case 1: ans = a+b;
//			break;
//		case 2: ans = a-b;
//			break;
//		case 3: ans = a*b;
//			break;
//		case 4: ans = a/b;
//			break;
//		default : System.out.println("Invalid choice..");
//		
//		}
		
		switch(choice) {
		case '+': ans = a+b;
			break;
		case '-': ans = a-b;
			break;
		case '*': ans = a*b;
			break;
		case '/': ans = a/b;
			break;
		default : System.out.println("Invalid choice..");
		
		}
		
		System.out.println(ans);
		
		
	}

}
