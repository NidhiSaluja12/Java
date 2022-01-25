
public class nestedLoop1 {
	
	public static void main(String args[]) {
		
	int n = 15;
	do {
		int i =1;
		do {
			System.out.print(n*i+" ");
			i++;
			
			}while(i<=10);
	System.out.println();
		
	n ++;
	}while(n<=3);
	System.out.println("Bye!");
		
	}
}
