package basic1;

import java.util.Scanner;

public class Ex02_Naver_Cafe1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력해주세요 ==>");
		
		String id = input.nextLine();

		
		String year = id.substring(0,4);
		
		String student = id.substring(4,7);
	
		String department =null;
		
		if(student.equals("111")) {
			department = "공과대 컴퓨터학과";
		}else if(student.equals("112")) {
			department = "공과대 소프트웨어학과";
		}else if(student.equals("113")) {
			department = "공과대 모바일학과";
		}else if(student.equals("122")) {
			department = "공과대 자바학과";
		}else if(student.equals("133")) {
			department = "공과대 모바일학과";
		}else if(student.equals("211")) {
			department = "사회대사회학과";
		}else if(student.equals("212")) {
			department = "사회대경영학과";
		}else if(student.equals("213")) {
			department = "사회대 경제학과";
		}
		
		
		System.out.println(id + "는" + year +"년도에 입학한" +
		department +"학생입니다" );
		
		
	
			
		
		
		//남이한거
		
		String StudentID = null;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("=====당신의 학번을 입력하세요=====");
		StudentID =input.nextLine();
		String acn =null;
		String ann = null;
		char an= StudentID.charAt(4);
		String num = StudentID.substring(5, 7);
		String year1 = StudentID.substring(0, 4);


		if(an=='1') { ann = "공대";
		switch(num) {
		case "11" : acn = "컴퓨터학과";break;
		case "12" : acn = "소프트웨어학과";break;
		case "13" : acn = "모바일학과";break;
		case "22" : acn = "자바학과";break;
		case "33" : acn = "서버학과";break;

		}
		System.out.println(StudentID +"는 " + year1 + "년에 입학한 " + ann +" "+ acn +"학생입니다." );

		}else if(an == '2') {
		ann = "사회대";
		switch(num) {
		case "11" : acn = "사회학과";break;
		case "12" : acn = "경영학과";break;
		case "13" : acn = "경제학과";break;
		}System.out.println(StudentID +"는" + year1 + "에 입학한 " + ann +" "+ acn +"학생입니다." );
		}else {
		System.out.println("잘못입력하셨습니다.");
		}
	
		
		
		
		
		
		//남거
		Scanner input2 = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요 >>>");

		String id1 = null;
		id = input.nextLine();

		String years = id.substring(0,4);

		char college = id.charAt(4);

		String aa = null;
		if (college == '1') aa = "공대";
		else if (college == '2') aa = "사회대";


		String c;
		c = id.substring(5,7);
		int cc = Integer.parseInt(c);

		String cal = null;
		
		if (college == '1') {
			switch (cc) {
			case 11 : cal = "컴퓨터학과"; break;
			case 12 : cal = "소프트웨어학과"; break;
			case 13 : cal = "모바일학과"; break;
			case 22 : cal = "자바학과"; break;
			case 33 : cal = "서버학과"; break;
			default :
			System.out.println("잘못입력 하셨습니다.");
			}
			}
			else if(college == '2') {
			switch (cc) {
			case 11 : cal = "사회학과"; break;
			case 12 : cal = "경영학과"; break;
			case 13 : cal = "경제학과"; break;
			default :
			System.out.println("잘못입력 하셨습니다.");
			}
			}
			System.out.println(id +" 는 "+ years +"년도에 입학한 "+aa+" "+cal+" 학생입니다" );
		

	}

	
}
