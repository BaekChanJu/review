package basic1;


//기본 자료형 : boolean char int/long double 이걸 제일 많이씀

//참조자료형은 : 클래스 , 배열 > 무저건 new로 객체를 생성해줘야한다

//String 참조자료형이지만 따로 하나로 보자



import java.lang.String; // 원래자바점랭 이라는 곳에 스트링이라는 패키지가 있음
//오브젝트가 부모님이고 퍼블릭으로 선언되있어서 누구나 가져갈수 있고
//파이널이 붇어있으면 못 변경한다

// public final class String extends Object 
	//-파이널이 클래스 앞에 붙으면 부모가 될수없다 즉 오버라이딩이 안된다
	//변수앞에 붙으면 수정이 불가


//즉 다른애를 쓰려면 무저건 임포트를 해줘야하는데 java.lang.String 이것만 안써도됌 기억

public class Ex01_Var { //extends Object 가 원래있는거임 모든 클래스의 부모임(단군)
	//멤버변수  // 여긴 기본값으로 null이 들어감(자동초기화 가능)

	public static void main(String[] args) {
		//여긴 지역변수 / 지역변수는값을 할당을 꼭해줘야한다
		//문자열 변수 a 선언
		//정수 변수 b 선언
		
		//변수 b에 200대입
		//변수 a에 "Hello"를 지정
		//변수 a와b를 콘솔에 출력
		
		//이렇게 말로 쓰고 이걸 코딩으로 푸는것이 중요하다
		
		//값을 할당해야하니 초기화 하려면
		//Sting a = null;
		//int b = 0; 이렇게 값을 할당해줘야함
		
		//지역변수를 선언하면 꼭 초기화 해두는 습관을 두자
		
		String a;
		int b;
		
		a="Hello";
		// 무저건 객체는 new 붙혀서 쓰는데 String은 생략가능
		// a = new String("hello"); 
		
		//기본자료형은 스택에 값이랑 주소가 저장이되지만
		//참조자료형은 메모리 체제가 다름 스택엔 주소만 저장되고 값은 힙에저장됨
		b=200;
		
		System.out.println(a);
		System.out.println(b);
	}

}
