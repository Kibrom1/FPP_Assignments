package quizreview;

import java.util.Random;

public class Quiz {
	 static int y = 10;
	public static void main(String args[]){
		
		//System.out.print(args[0]);
		//System.out.print("Starting the first class");
		int a = 10;
		int b = 0;
		//System.out.println(a/b);
		
		double c = 10.0;
		double d = 0.0;
		System.out.println(c/d);
		
		int k = 3;
		System.out.println(++k);//4
		System.out.println(k++);//4
		System.out.println(++k);//6
		/*int income = 10000;
		String group = (income > 5000)? "High": "Low";
		System.out.println(group);
		Random random = new Random();
		int num = random.nextInt(11);
		
		
		int[] numbers = {1,2,3,4,5,};
		for(int k: numbers)
		{
			System.out.println(k	);
		}*/
		//Quiz qq = new Quiz();
		//Quiz qq2 = new Quiz();
		//qq.y = 20;
		//System.out.println(qq2.y);
		
		String s = "Hello";
		if(s instanceof java.lang.String)
			System.out.println("It is true!");
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
