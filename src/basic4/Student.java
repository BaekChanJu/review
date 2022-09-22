package basic4;

public class Student {
	//이렇게 서로 다른애들을 덩어리로 만드는게 클래스지 클래스 안에있으니까
	//배열은 같은자료형을 덩어리로 만드는 것
	private String hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
//main 메모리에 할당해야 동작이가능
	
	
	
	//동작구문까지 다만들어줬음
	

	//겟세터로 변수선언한것들 선언해주기
	//안해주면 오류나
	
	//1번 문제 주석풀면 갑자기 잘되던게 오류남 
		//하나라도 생성자를 만들어버리면 컴파일러가 기본생성자를 안만듬
		//아까1번 같은경우에는 생성자가 하나도없는경우에서 실행했으니
		//컴파일러가 기본생성자를 만들어서 오류가 안났는데
		//2번예시풀면서 생성자를 1개 만들었기때문에 
		//이제는 기본생성자를 내가 집접 입력을 해줘야한다
		//습관적으로 하나 만들어라
		public Student() {
			//this.name = "홍홍이";
			//this.kor = 50; //점수할당이유는 들어오는 매개변수가없으니지정해야함
			//this.eng = 60;
			//this.math = 70;
			
			this("이름없음",50,50,50); //아래 매겨변수 있는 함수를 호출해준거임
			//굳이 안에다 위처럼 선언이아니라 인자받은녀석의 함수를 일로 불러와준다
			//앞에 this를 붙혀서
			//this 함수는 무저건 첫번째 줄에와야함 그래야 아래 내용을 가따가 옴
			System.out.println("기본생성자");
			
		}
		
	
	
	//생성자 리턴값없고 클래스랑 이름 같아야하고 매개변수가 같아야함
	public Student(String name, int kor, int eng ,int math) {
		//매개변수로 받은 값을 저위 멤버변수에 지정을 해줘야겠네 ? this로
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는생성자");
	
	}
	//이렇게 생상자 함수로 초기화 느낌으로 원큐에 가거나
	//셋게터로 2번으로 나눠서 사용해도 된다
	
	
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	

	public void calTotal() {
		total = kor + eng + math;
	}
	

	public void calAvg() {
		avg = total / 3;
	}
	
	public void output() {
		System.out.println(name + "님 성적 : " + total + "/" + avg);
	}
}


/*
 * 
 * 누가 근데 수정을 해버릴 수도있자나? main에서 s.total = 0;이렇게
 * 
 * 캡슐화
 * 	- 멤버변수 : private  변수수정못하게 붙혀버리기
 * 	- 멤버메소드 : public  이건 누구나 접근가능하게
 * 
 * 
 * 
 * 
 * 네이버 클래스 다지기문제
 * 
 * 1번은 
 * 1번이답
 * 
 * 2번의 4번문제는 프라이빗이라 다른클래스에서 접근못하는데 v.i로 접근해서 안됨
 * 
 * 
 * 
 * 3번
 *  2번,4번!! - 3번은 에러 3번은 생성자함수를 부르고있는거임 생성자에서만 쓰는것임
 * 
 * 
 * 4번은
 * new myclass 라는객체 생성이 안되잇음
 * 
 * 5번은 오버로딩이 아님 매개변수가 동일함 바꿀라면 구지 함수명을 바꾸셈
 * 
 * 
 * 6번은 this가 첫줄이 아님
 * 
 * 
 * 
 * 
 * */
 