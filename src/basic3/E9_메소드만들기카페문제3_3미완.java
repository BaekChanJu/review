package basic3;

public class E9_메소드만들기카페문제3_3미완{

	static void multiple(int a, int b, char c) {
		char[][] arr = new char[a][b]; //숫자 2개를 받는 이중배열을 만듬

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = c; //받은 c 를 2차원배열돌때마다 차곡차곡 넣는다
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		multiple(2,3,'ㅋ');

		//첫번쨰 행 2 두번쨰 열3 이니 2,3 넣는 거임 2차원배열
	}
}