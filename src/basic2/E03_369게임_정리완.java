package basic2;
//<정리완료>

public class E03_369게임_정리완 {

	public static void main(String[] args) {
		
		//문제) 1부터50까지의 숫자중에서 그 숫자중
		//3,6,9 숫자가 포함되어있다면 (23,16도 3,6이 포함된경우임)
		//짝 33 36 같은경으는 짝짝 이렇게 기본 369게임 처럼 나오도록 만드시오
		
		for(int i =1; i<50; i++) {
			int num = i;
			boolean num369 = false;
			
			while(num!=0) {
				
				int clap = num % 10;
				
				if(clap==3||clap==6||clap==9) {
					System.out.print("짝");
					num369=true;
				}
				num = num/10;
			}
			
			if(num369) {
				System.out.println();
			}else {
				System.out.println(i);
			}
		}
	}
}
	

	/*일단 1부터 50까지의 숫자중 이니 for문으로 1~50번 까지 돌도록
	 * for문을 먼저 선언을 해준다
	 * 그다음 for문 안을 채워 넣어줘야하는데 int num = i 라고 만들어준다
	 * 그럼 num은 i가 1들어오고 2 들어오고 3들어고 이렇게 도는 값들이 저장되는
	 * 공간을 의미한다 
	 * boolean num369 = false; 라는 변수도 아래에 선언을 해주는데
	 * 나중에 if문에서 사용하게되고 if문의 () <- 매개변수로 num369 을 넣게되면
	 * false로 선언을했기때문에 통과가 안된다 만약 어딘가에서 true로 바꿔준다면
	 * 그 if문을 통과하게 된다 즉 369같은 짝 들에 안걸린 숫자들을 판단하기위해 선언한거다
	 * 
	 * 그후 while(num!=0) 이렇게 while문을 선언을 해주는데
	 * num 즉 (i) 돌면서 들어오는 숫자들이 0이 아니라면 while문을 계속써라 이뜻이다
	 * 
	 * 선언후 아래 int clap = num % 10; 를 선언하게 되는데 풀어보면
	 * num을 10으로 나눴을때의 나머지 값을 clap 안에 넣은것이다
	 * 뭐 예를 들어 num이 5면 5를 10으로 나눈값의 나머지를 clap에 넣은것이고
	 * if문 설정해놓은거보면 그래서 그 나머지가 3,6,9 라면 짝을 호출해라 라고
	 * 시스템 호출입력을 해놓고 num369=true; 이렇게 num369를 true로 변경해준다
	 * 나머지가 3,6,9 일때만!! 그래야 나중에 if문에서 369가 아닐때 else 에서 i인
	 * 기본 숫자들을 출력할수 있게된다
	 * 
	 * 
	 * 
	 * 근데 아래 num = num/10; 이걸 선언하게 되는데 왜 선언하냐 하면
	 * 예를들어 num에 26이 들어왔다고 치면 26은 당연히 0이 아니니 while문으로 들어가고
	 * 26을 10으로 나눈것의 나머지는 6이다! 나머지가 6이니 if문을 통과하고
	 * 원래같이 짝만 표현하려면 break 구문을 while문을 탈출하면 그만이지만
	 * 우리는 지금 33 이나 36 같은 짝짝 즉 2개가들어간 10의 자리까지도 판단을 해줘야하니
	 * 10의 자리것까지 판단하기위해 su = su/10;  를 해줘서 26을 10으로 나눈값의
	 * 몫 즉 2나온다 2가나오면 while문이니까 또 num매개변수로 들어가게되고
	 * 2를 2%10하면 2를10으로 나눈것의 나머지 즉 0이다 0이 다시돌면 
	 * num!=0 를 만나 while문을 빠져나가게 되는것이다
	 * 
	 * 
	 * 아래 if문은 3이라고 가정하면 3은 짝을 출력하고 true로 바뀌었으니
	 * 빈공백 을 출력하고 4로 다시돌아가는것
	 * 4는 맨위 if문을 통과하고 나오지 못하니 false상태니 i를 출력하는것이고
	 * */
	 