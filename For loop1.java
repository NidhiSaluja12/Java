
public class forLoop1 {
	
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			
			System.out.print(i);
		}
		System.out.println();
		
		
//		int i=1;
//		
//		for(;;) {
//			
//			System.out.print(i);
//			i+=2;
//			
//			if (i>10) 
//				break;
//		}
		
		for(int i=1,j=20,k=100;i<=10;i++,j--,k+=10) { //condition(break) koi ek lagayega 
			
			System.out.println(i+" "+j+" "+k);
		}


	}

}
