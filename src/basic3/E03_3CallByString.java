package basic3;

public class E03_3CallByString {

	public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("하이");
		
		add(a,b);
		System.out.println("A = " + a + " B = " + b);

	}
	
	static void add(String a, String b) {
		a = a+b; //일반스트링은 더하기가 가능 
		
		System.out.println("A = " + a + " B = " + b);
		
}
}
