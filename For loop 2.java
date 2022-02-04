
import java.util.Scanner;

public class forLoop2 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int f = 1;
//	for (int i=1; i<=n; i++) {
//		
//		f = f*i;
//	}
	
	
	
//	int i=1;
//	while(i<=n) {
//		f = f*i;
//		i++;
//		
//	}
	
	int i=1;
	do{
		f = f*i;
		i++;
		
	}while(i<=n);
		System.out.println("Factorial: "+f);	
	}

}
