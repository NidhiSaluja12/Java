

public class nestedLoop2_doWhile {
public static void main(String args[]) {
	int m,n;
	m = 1;
	do {
		n = 1;
		do {
			System.out.print(n+ "");
			n ++;
			
		}while (n <= m);
		System.out.println();
		m++;
		
		
	}while(m<=10);
}
}
