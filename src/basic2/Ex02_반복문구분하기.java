package basic2;

import java.util.Scanner;

//for - 반복횟수가 정해진 경우

//while - 반복횟수를 모르는 경우

//do ~ while - 반복횟수를 모르는 경우 (조건을 나중에비교)

public class Ex02_반복문구분하기 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*//1. for문을 이용해봄
		 * 
		 * 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		System.out.println("몇번 반복할까요?");
		int a = input.nextInt();


		for(int k =0;k<a ;k++) { 
			System.out.println("원하는 단을 입력하세요");
			int i = input.nextInt();

			for(int j =1;  j<10; j++) {
				System.out.println(i + " x " +j + " = " + i*j);
				//System.out.printf("%d * %d = %d\n" , i , j, i*j);
			}
		}

		 */


		/*2. while 문으로!
		 *


		while(true) { //반복이 몇번인지 모르니까
			System.out.println("원하는 단을 입력하세요");
			int i = input.nextInt();

			for(int j =1;  j<10; j++) {
				System.out.println(i + " x " +j + " = " + i*j);
			}


			System.out.println("반복종료는 (Y)");

			input.nextLine(); //이거하나해줘야 반복종료 엔터 먹어줌
			//이걸 안해주면 반복종료는 아래에 바로 몇단출력하심? 이게 떠버림
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Y")) { //Y 나 y 가능
			break;
			}
		} */

		//근데 이경우라면 do while이 더 깔끔함

		//do - while


		do {
			System.out.println("원하는 단을 입력하세요");
			int i = input.nextInt();

			for(int j =1;  j<10; j++) {
				System.out.println(i + " x " +j + " = " + i*j);

			}
			System.out.println("계속하시겠습니까?");
			input.nextLine();
			String answer = input.nextLine();

			if(answer.equalsIgnoreCase("S")) {
				continue;
			}else if(answer.equalsIgnoreCase("n")) {
				break;
			}
		}while(true);


		/*do {
   			System.out.println("단 입력");
   			dan=scan.nextInt();
  		} while(true);
				System.out.println(dan + "단");
  			for(int j=1;j<=9;j++) {
   			System.out.println(dan + "*" + j + "=" + dan*j);*/

	}
}
