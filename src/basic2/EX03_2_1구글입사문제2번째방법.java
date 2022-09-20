package basic2;

public class EX03_2_1구글입사문제2번째방법 {

	public static void main(String[] args) {

		int count = 0; // 8의 갯수
		int temp = 0; // 임시변수

		for(int i = 1; i<=10000; i++) {
			temp = i; // temp에 i값 임시저장

			while(true) {
				if (temp%10==8){ // temp를 10으로 나눈 나머지의 값이 8일 경우 갯수를 셈
					count++;
					} 
				
				if (temp>10) {
					temp/=10;
					}
				// temp가 10보다 클 경우(2자리수 이상) 10으로 나눈 후 다시 갯수를 셈
				else {break;} // temp가 10보다 작을 경우 while문 종료
			}
		}
		System.out.println("1~1000사이의 8의 갯수 : " + count);

	}
	/*1부터 10000까지의 숫자중 8이라는 숫자가 총 몇번 나올까
	8이 포함되어있는 모둔 수를 카운트해야한다
	즉 8은 8이1개 , 808 은82개 , 8088은 8이4개 
	
	conut 8의 갯수들을 넣어주는 변수하나만들고
	temp 는 i를 이래저래 식에 넣어줄수있도록 임수변수로 설정을해준다
	for문으로  10000번돌리게 기본틀을 만들어 준후 돌때마다 수가 입력되어 저장되도록
	temp = i를 설정을 해준다
	 while문 true로 무한반복되게 설정을 먼저해주고
	 if(temp%10==8) 을 해주는데 temp(돌면서들어오는i들) 를 10으로 나눈 나머지의 값이
	 8일 경우 count++ 로 갯수를 세준다
	 아래 if를 한번 더해주는데 temp가 10보다 클경우 즉 11 이나 12 같이 (2자리이상) 의 수들이
	 들어올경우   <if (temp>10) temp/=10; > 10으로 나눈후 다시 갯수를세준다
	 2자리수 이상의 것들을 판단해주려고 하는것이다 빠져나가려면 else를 붙혀 break 로 나간다
	 (이건 temp가 10보다 작은 수들이 들어왔을때 while문을 종료
	 예를 들어 7이 들어오면 와일문까지 쭉통과해서 조건이 안맞으니 브레이크로 나가고 1증가된 8이 for문으로
	 반복되는것이다
	 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	


}
