package basic1;

public class EX03_네이버카페for문예제 {

	public static void main(String[] args) {
		
		System.out.println("=========문제1번=======");
		for(int i =0; i<26; i++) {
			for(char a = 'A';a<='A'+i; a++ ) {
				System.out.print(a);
			}
			System.out.println("");
		}
		
		
		
		System.out.println("=========문제2번=======");
		for(int i =0; i<26; i++) {
			for(char a = 'A';a<='Z'-i;a++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		
		
		
		System.out.println("=========문제3번=======");
		for(int i =0; i<26; i++) {
			for(char a = (char)('A'+i);a<='Z'; a++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		
		
		
		
		System.out.println("=========문제4번=======");
		for(int i =0; i<26; i++) {
			for(char a= 'Z'; a>='Z'-i; a--) {
				System.out.print(a);
			}
			System.out.println("");
		}
		
		
		
		
		
		System.out.println("=========문제5번=======");
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(char a = (char) ('A'+i); a <= 'Z'; a++) {
				System.out.print(a);
			}
				System.out.println();
			}
		
	}
}
 

