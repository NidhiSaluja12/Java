package class_3;
import java.util.Scanner;

public class loop7_max_min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers :");
		int n = 0;
		int max = 0;
		int min = 0;
		
		
		do {
			
			n = sc.nextInt();
			
			if (n >= max && n != -1) {
				max = n;				
			
			}
			
			else if (n <= max && n != -1) {
				
				min = n;
			}	
			
		}while (n != -1);
		
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
	
	

}
