package class_6;
import java.util.Scanner;

public class array1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		//int[] a = new int[5];
		//int []a = new int[5];
		//int a[][] = new int[5][3];
		//int[][] a = new int[5][3];
		//int [][]a = new int[5][3];
		//int []a[] = new int[5][3];
		//int a[] = {1,2,3,4,5,6,7,8,9,0,10};
//		a[0] = 25;
//		a[1] = 45;
//		a[2] = 60;
//		a[3] = 75;
//		a[4] = 90;
		
		System.out.println("Enter 5 numbers: ");
		
		for (int i=0;i<5; i++) {
			a[i] = sc.nextInt();
		}
		
		
		for (int i=0;i<5; i++) {
			System.out.println(a[i]);
		}
		
	}

}
