package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;


public class E04_1성적2_배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3명의 국어점수를 입력하세요( 10/20/30 )
		
		int kor[] = new int[3];
		
		System.out.println(kor.length + "명의 국어 점수를 입력하세요");
		String inputDate = sc.nextLine();
		StringTokenizer st = new StringTokenizer(inputDate, "/");
		//StringTokenizer 무엇 무엇 기준으로 나눠라
		
		
		//hasMoreTokens - StringTokenizer에 사용할수있는 토큰이 더있는지확인
		for(int i = 0 ; st.hasMoreTokens(); i++) {
			String str = st.nextToken();// StringTokenizer에서
			//나온 토큰들을 불러오는 메서드임
			kor[i] = Integer.parseInt(str);
		}
	
	}

}
