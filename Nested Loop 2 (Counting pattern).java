/*

Output:

1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

*/

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
