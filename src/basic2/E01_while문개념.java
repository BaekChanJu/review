package basic2;

public class E01_while문개념 {

	public static void main(String[] args) {
		
		/*0. for 문
		int sum = 0;;
		
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		*/
		
		//for 문에서 사실 초기값은 정해놓고 마지막 증가값은 반복이고
		//그럼 가운데 i<10 조건문만 확인하면 되는데 이럴꺼면 while을 써주면된다
		
		/*int i =0;  //초기값
		int sum = 0;
		
		while(i<=10) { //조건문
			sum+=i;
			i++; //증가값
		}
		System.out.println(sum);
		*/
		
		
		//2
		int i =0;  //초기값
		int sum = 0;
		
		do { //조건문
			sum+=i;
			i++; //증가값
		}while(i<=10);
		System.out.println(sum);
		
		//두와일은 한번은 돌리고 조건은나중에 확인한다
		//즉 조건문을 나중에 물어보는것이다
		
		//for문을 while로 do while 로 옮기는 연습을 많이해라
	}

}
