package basic2;

public class EX03_2구글입사문제 {

	public static void main(String[] args) {
		//1~10,000까지 8 몇번? (ex.8808 = 3번)
		//결과: 4000
		
		int cnt = 0;
		
		for(int i = 1; i<=10000; i++) {
			int temp = i;
			
			while(temp !=0) {
				int a = temp%10;
				
				if(a == 8) {
					cnt++;
				}
				temp/=10;
				
			}
			
		}
		System.out.println(cnt);
	}
}