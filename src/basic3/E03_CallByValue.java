package basic3;

public class E03_CallByValue {

	public static void main(String[] args) {
		
		int a =10, b =20;
		
		add(a,b);
		 
		 System.out.println("A = " + a + "B = " + b);//2번으로

	}

	static void add(int a, int b) {
		 a = a+b;
		 
		 System.out.println("A = " + a + " B = " + b); //1번으로
		 //a =10 b=20
	}

	
	//기본형을 함수에 인자로 보내는것은 _CallByValue 라고함
	//복사해서 보내준거니까 복사본이지? 복사본은 원본에 영향을 안미침
	//add로 보내준 녀석은 보내지긴해도 이미 main함수에 정해진값이 있기에
	//영향을 안미침
	
	//즉 add 에서 합해진 a는 add에서만 처리가 되고 함수add를 마추고 돌아갔을때는
	//영향을 안미친다 이걸  CallByValue(기본자료형에서만)
	//예외로 String도 이렇다
	
	//복사본을 아래 내려주고 받은 복사본은 즉 원본에 지장을 안준다
}


