package basic3;

public class E9_메소드만들기카페문제3_3미완 {


	static void multiple (int a, int b, char c) {
		char[][] arr = new char[a][b]; //2중배열선언

		for(int i = 0; i<a; i++) {
			for(int j = 0; i<b; j++) {
				arr[i][j] = c;//들어온문자값을 배열에넣어줌
				//정수n,m2개와 문자1개를 받으면 정수*정수 만큼
				//2차원 배열을 생성해 주는것이다
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}

