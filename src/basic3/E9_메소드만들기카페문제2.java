package basic3;

public class E9_메소드만들기카페문제2 {
	
	static char checkUpper(char ch) {
		return Character.toUpperCase(ch);
		}

	public static void main(String[] args) {

		char a1 = checkUpper('a');
		char a2 = checkUpper('A');
		
		System.out.println(a1);
		System.out.println(a2);
	}

}
