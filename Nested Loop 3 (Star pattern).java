/*
Enter the number of lines: 10
Output: 
*
**
***
****
*****
******
*******
********
*********
**********


*/
import java.util.Scanner;
public class nestedLoop3_doWhile2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m,n,l;
		
		System.out.println("Enter the number of lines: ")
		int l = sc.nextInt();
		
		
		m = 1;
		do {
			n = 1;
			do {
				System.out.print("*");
				n ++;
				
			}while (n <= m);
			
			System.out.println();
			m++;
			
			
		}while(m<=l);
		
	}

}
