package basic3;

public class E01_함수2 {

	public static void main(String[] args) {
		
		int sum = add(); //sum이라고 넘어온걸 sum이라고 해줄께 ~ 햇살리지않게
		//합을 여기서 출력해야하는 상황
		System.out.println("합 " + sum);
	}
	
	static int add() {
		
		int a = 10;
		int b =20;
		
		int sum = a+b;
		return sum; //에러 이유는 아무 리턴타입 없이 메소드를 선언했기에
		//void 가 아닌 int로 선언해줘야함
	} 
}

