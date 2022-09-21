package basic3;

public class E09_기술시험문제1 { //Factorial

	public static void main(String[] args) {
		
		//5! =  5*4*3*2*1 이게 Factorial

		
		int fact = factorial(5);
		
		System.out.println("! = " + fact);
	}
	
	static int factorial(int i) {
		if(i==1) return 1;
		
		return i * factorial(i-1);
	}
	

}
