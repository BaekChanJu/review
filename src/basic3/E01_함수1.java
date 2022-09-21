package basic3;

public class E01_함수1 {

	public static void main(String[] args) {
		int a =10,  b = 20;
		
		add(a,b);

	}
	
	static void add(int a , int b) {
		int sum = a+b;
		System.out.println(sum);
	}

}
