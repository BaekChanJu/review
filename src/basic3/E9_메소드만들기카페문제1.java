package basic3;


public class E9_메소드만들기카페문제1 {
	//1번 소문자가 들어오면 true 대문자가 들어오면 false를 반환하게하라
	static boolean checkLower(char a){
		return Character.isLowerCase(a);
		//isLowerCase 여기에 들어온 값이 소문자면 true(로우얼이니까)
		//아니면 false
	}

	public static void main(String[] args) {
		boolean c1 = checkLower('a');
		boolean c2 = checkLower('A');
		System.out.println(c1);
		System.out.println(c2);
	}
}



