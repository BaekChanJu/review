package basic2;

public class EX03_2구글입사문제 {

	public static void main(String[] args) {
		//1~10,000까지 8 몇번? (ex.8808 = 3번)
		//결과: 4000
		int sum = 0;

		for(int i = 1; i <= 10000; i++) {
		String s = String.valueOf(i);

		for (int j = 0; j < s.length();j++) {
		if(s.charAt(j) == '8') {
		sum+=1;
		}//if

		}//for
		}//for
		System.out.println(sum);

		}//main
		// TODO Auto-generated method stub

	


/
