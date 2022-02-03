import java.util.Scanner;

public class triangle_pattern1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int c=1,r,n;
		System.out.println("Number of lines: ");
		n = sc.nextInt();
		// using while
//		while(c<=n) {
//			
//			r=c;
//			while(r<n) {
//				System.out.print(" ");											
//				r++;	
//			}
//			
//			r=1;
//			while(r<=c) {
//				System.out.print("* ");
//				
//				r++;
//			}
//			
//			System.out.println();
//				c++;
//		}
		
		
//		using do while
		
		 do{
			
			r=c;
			do {
				System.out.print(" ");											
				r++;	
			}while(r<=n);
			
			r=1;
			do {
				System.out.print("* ");
				
				r++;
			}while(r<=c);
			
			System.out.println();
				c++;
		}while(c<=n);

		
		
	}

}
