package basic1;

/* for /while/do - while
 * 
 * 1) for(초기값; 조건문; 증가값){
 * 반복구문
 * }
 * 
 * 
 * */

public class Ex03_for개념 {

	public static void main(String[] args) {
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		for(int i =1; i<=10; i++) {
			sum+=i;
		}
		System.out.print("합계 : " +  sum);
		
		
		System.out.println();
		
		
		//증가값으로 홀수 더하기
		for(int i =1; i<=10; i+=2) {
			sum1+=i;
		}
		System.out.print("홀수 합 : " +  sum1);
		
		
		System.out.println();
		
		
		//if문으로 홀수더하기
		for(int i =1; i<=10; i++) {
			if(i%2 ==1) {
				sum2+=i;
			}
		}
		System.out.println("홀수if 로 합 : " + sum2);
		
		
		
		
		
		
		//for(char ch ='A'; ch<'Z'; ch++) {
			//System.out.print(ch);
		//}
		
		//System.out.println();

		//for(char ch ='A'; cfh<'Z'; ch+=2) {
			//System.out.print(ch);
		//}
		
		//System.out.println();
	
	
		//z부터 a까지 출력
		//for(char i = 'Z'; i>='A'; i--) {
			//System.out.print(i);
		//}ffff
		
		
	
	}
}
