package basic3;

public class E09_AusmTest {

	public static void main(String[] args) {
		
		int sum = sumFunc(4); //sum값을 저장하는변수에 바로함수대입

		System.out.println("합 : " + sum);
		//sumFunc(3) 넘겨받은 숫자만큼 계산해주는 함수를 만든거임
		}
	
	static int sumFunc(int i) {
		//1+2+3 더한걸 sum에 저장한다 
		//sum = 1+2+3 원래는 for로 계산해주면된당
		if(i==1)return 1; //마지막 10+9+8+7 ..1이되면 나를 호출한곳으로
		//함수로 올려준다 그럼 sum에 저장되고 그게합이되느넛이다
		
		return i + sumFunc(i-1);
		//제기함수 함수가 자기 자신의 함수를 부르는걸 의미
		//이거는 기계어라 그냥 지가반복하는건데 인간머리로는 이해가 안가니 외워라
	}

}


//return i + sumFunc(i-1); 이거는
//처음에 3 들어가면 1이 리턴될때까지니까
//3 하고 남아있고
//그다음꺼라면 
//-1 이니 2가남아있는거고
//그다음은 1이 남아있는거고
//그럼 남은 3 2 1 더하면 6

//return i * sumFunc(i-2); 라면 i에 5가들어온다치면
//계산은 늘 마지막에만된다

//5 들어오고 2뺸 3들어오고 마지막 1 들어오면 다곱하라니까 15