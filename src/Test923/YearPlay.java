package Test923;

import java.util.Calendar;

public class YearPlay {

	public static void main(String[] args) {
		
		int year = 1998;
		int age;
		
		int ca = Calendar.getInstance().get(Calendar.YEAR); //현재의 년도를 넣어줌
		
		age = ca-year+1;
		System.out.println("나이" + age);
		System.out.println("태어난년도" +year);
		
	}
	
}
