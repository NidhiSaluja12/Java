import java.util.Scanner;

public class forloop4_trianglePattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int c,r,n;
		System.out.println("Number of lines: ");
		n = sc.nextInt();
		
		for(c=1;c<=n;c++) {
			
			for(r=c;r<n;r++) {
				System.out.print(" ");
			}
			
			for(r=1;r<=c;r++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
