package basic1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해서 (if 등등)
 * 	1) if
 * 	2)switch 여러개중 하나 골라잡기
 *  3)for
 *  4)while / do ~ while
 * 
 * 5)break , continue
 * 
 * */


public class Ex02_control {

	public static void main(String[] args) {
		//String id="980825-1157928"
		
		
		 String id =null;
		 Scanner input = new Scanner(System.in);
		 System.out.println("주민번호 입력해라==>");
		 
		id = input.nextLine(); //앤터를 뺸 나머지까지 내가 확인해줄께  123엔터 총4개가아닌
		 //123 까지 3개인걸로 
		 
		 
		 //String id = "980825-1111111"; 
		 //인덱스를 웬만해서 0부터 읽음  9는 0번째 자리
		 //여기서 7번째 자리를 가져와서 성별을 알아보자
		 
		char sung =  id.charAt(7); //필요한 7번째 녀석을 가져와줌
		 //리턴 값은 char
		
		System.out.println(sung);
		//~ 라면 if
		// 그렇지 않고 else if 
		//그렇지 않으면 else
		//이거나 or , ~고 ~고 and
		
		
		//sung 이라는 변수에 문자가 1이거나 3이거나 9이라면 남자라고 출력하기
		 //  않으면 else
		//그렇지 않고 문자가 2 이거나 4 이거나 0이라면 여자를 출력  / 않고면 else if
		
		
		if(sung == '1' ||sung == '3' || sung == '9') { //숫자1과 문자1은 다르니 char로 넣어줘야함
			System.out.println("남자입니다");
		}else if(sung == '2' || sung == '4' || sung == '0') {
			System.out.println("여자입니다");
		}
		
		
		
		System.out.println("=========================");
		//8번째 문자 하나를 받아서 츌 이라는 명에 저장하세요
		
		char chul = id.charAt(8);
		System.out.println(chul);
		
		//chul 변수가 0이라면 '서울'
		//chul 변수가 1이라면 '인천/부산'
		//chul 변수가 2이라면 '경기'
		//chul 변수가 9 라면 제주
		
		
		String home = null;
		
		if(chul == '0') {
			home = "서울";
		}else if(chul == '1') {
			home = "인천/부산";
		}else if(chul == '2') {
			home = "경기";
		}
	 //이걸 스위치로 만들면 아래다
		
		
		switch(chul) {
		case '0' : 	//문자 '0'이라고 잘써줘야함 정수가 아니라 문자니까
			home = "서울";
			break;
		case '1' :
			home = "인/부산";
			break; //나는 1이 걸려서 출력하고 브레이크로 나옴
		case '2' :
			home = "경기";
			break;
		case '9' : 
			home = "제주";
		default : 
			System.out.println("x");
		}
		System.out.println(home + "출신");
		
		 
//else if 를 많이쓸때 switch를 쓰면 더 빠르다고 한다
		
		
		
		
		
		System.out.println("=====================");
		//치명적 문제
				//근데 1900을 무작정 더하면안되고 1,2일경우 엔 1900이지만
				//3,4일떄는 2000 년대생이니 2000 해줘야함
				//그리고 내년되면 이건 못씀 2022라 지정했으니까
		
		
		
		//String id = new String("980825-1234567");
		//일단 문자열 98을 얻어와야함 98은한글자가 아니라 문자열임
		//chartAt은 하나만 가져옴
		
		String nai = id.substring(0,2);
		//// 문자열은 이걸로 가져와야함 0에서 시작해서 2앞에꺼까지임
		System.out.println(nai); //98잘나옴
		
		//근데 98은 결국 "98"임 문자열임 
		//문자열 > 정수형 으로 변환해야함
		
		//기본형은 기본형끼리 캐스팅 , 문자열은 상속될때 끼리 캐스팅이여서
		//결국 자료형변환은  Integer.parseInt 사용해야함
		
		int sunai = Integer.parseInt(nai); // 문자열98을 정수형9
		
		int age =0 ;
		
		//추가해본거임
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		age =year - (2000 + sunai) + 1; //한국식 나이
	
		System.out.println(age);

		
		
		
		
		
		
				
	}

}
