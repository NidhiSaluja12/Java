package class_4;

public class nestedLoop3_doWhile2 {
	public static void main(String args[]) {
		int m,n;
		m = 1;
		do {
			n = 1;
			do {
				System.out.print("*");
				n ++;
				
			}while (n <= m);
			System.out.println();
			m++;
			
			
		}while(m<=10);
		
	}

}
