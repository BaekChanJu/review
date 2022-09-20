package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		
		for(char ch = 'A'; ch<'Z' ; ch++) {
			System.out.print(ch);
		}
		
		
		System.out.println("");
		
		//이걸 26줄 만들어보셈 for 중첩문 인거다
		for(int i =0; i<26; i++) {
			for(char ch = 'A'; ch<'Z' ; ch++) {
				System.out.println(ch);
			}
		}
		
		
	}

}
