package basic4;



//2번째 위와 다른내용임
//이론

//배열은 동일한 자료형인 경우

//구조체 : 서로 다른 자료형인 경우 + 메소드 함수 까지 되있으면 이걸 클래스

//서로다른 자료형들을 묶으면 클래스로 만들수있음


//지금 Student 라는 다른클래스를 하나 다른창에 만들었음

public class MainTest {

	public static void main(String[] args) {
		//Student s; //클래스가 지금 변수만 선언된거지 지금 메모리에 안올라왔음
		
		
		//값지정 1 - 세터로 지정 가장많이씀
	Student s = new Student(); //이렇게 해야 메모리가 올라온거임이걸(객체)라함
		//클래스는 그냥 덩어리인 코딩뿐이고 객체화 시켜줘야 객체로 된다
		//s.setName("홍길동"); //캡슐화 한녀석은 셋네임으로 불러와야함
		//s.setKor(100);
		//s.setEng(30);
		//s.setMath(55);
		
		//여기서 총점 평균을 낼라니 너무 복잡해짐 main 칸이라
		//그래서 스튜던트 클래스에서 구동구문을 만들어준다
		
		//값지정2 - 생성자
		 	// 클래스의 멤버변수 초기화 (맨아래 주석으로 설명다해놓음)
		
	//	Student s = new Student("홍길자",99,88,66);
		//이건 객체를 생성하면서 바로 값을 넣었지? 이걸 생성자함수
		//위에는 객체만들고 셋게터로 받아오고 2단계를 걸치는것이고
		
		
		
		//호출만 해주면된다
		s.calTotal();
		s.calAvg(); //계산구문들까지 다 호출해주고 아래 아웃풋 해줘야 값이나옴
		
		s.output();
		
	}

}


/*클래스 멤버변수에 값으 지정하는 방식
 * 1 셋터 많이사용
 * 2 생성자 함수사용(constructor)
 * 
 * 	초기화
 *  int a ;  //메모리 먼저 확보후   
 *  a=10; //값을 지정
 *  
 *  int b =20 ; //변수 선언과 동시에 값대입 이걸 초기화 위 두를 합친것이지 이걸 초기화
 *  
 *  셋터 와 그걸 출력하는건 총 2단계인데
 *  한번에 선언하는걸 생성자함수로 하는것이다 초기화처럼
 * 
 * 
 * 일반함수랑 생성자함수 구별법은
 * 생성자함수는 리턴형이 없음 앞에
 * 그냥 A(){} 이렇게 선언하는거임
 * 함수A였으면 void A(){] 처럼 리턴값이 있겠지 
 * 
 *  그리고 반드시 이름이 클래스명과 동일해야한다!
 * 
 * */
