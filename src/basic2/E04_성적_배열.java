package basic2;

import java.util.Scanner;

public class E04_성적_배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor[] =  new int[3];
		
		int sum = 0;
		int count = 0;

		for(int i =0; i<kor.length; i++) {
			System.out.println(i + "번의 학생의 국어점수 입력");
			kor[i] = sc.nextInt();
			sum+=kor[i];
			count++;
		}
		
		
		
		for(int i =0; i<kor.length; i++){
		System.out.println(i + "번 학생의 점수 : " + kor[i]);
		}
		
		System.out.println("학생의 점수 합 : " +sum);
		System.out.println("학생의 평균 : " +sum/(double)count);
	}

}
