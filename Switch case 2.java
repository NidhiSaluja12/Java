
import java.util.Scanner;

public class switch_case2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String status="";
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		switch(num){
		
		case 25:  status = "Right";
				break;
		case 50:  status = "Right";
				break;
		case 75:  status = "Right";
				break;
		case 100:  status = "Right";
				break;
		default : System.out.println("Invalid choice..");
		
		
		}
		
		System.out.println(status);
			
	}
	
}
