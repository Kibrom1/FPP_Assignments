package week1lesson4;

public class RecursiveCountDown {

	public static void countDown(int n){
		if(n < 0)
			System.out.println();
		else{
			System.out.println(n);
			countDown(n-1);
		}
			
	}
	
	public static int lengthString(String str){
		
		if(str.equals(null) || str == " ")
			return 0;
		else{
			return 1 + lengthString(str.substring(1));
		}
	}
	public static void main(String[] args){
		
		//countDown(4);
		
		System.out.println(lengthString("Hello"));
	}
}
