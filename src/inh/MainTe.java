package inh;

public class MainTe {

	public static void main(String[] args) {
		
		//Mother u = new Mother();
		//u.job();
		//u.gene();
		
		//Son d = new Son();
		//d.study();
		//d.job(); //오버라이딩시키면 ? 딸꺼나옴
		//d.gene(); //오버라이딩 시켯으니 자식나옴
	//}
	
	
	//생성자함수 불렀다 자식으로만 객체를 생성해서 불렀는데
	//근데 엄마 생성자도 나온다 왜냐 엄마를 상속받고있으니
	//순서는 엄마부터 나온다 
	
	//오버라이딩된거면 무저선 자식껄 불러줌
		
		//자식변수d 에 부모객체생성이 불가
	//Son d = new Mother(); //이거안되네?
		//읽을때 엄마객체를 아들타입으로 만들라인데
		//엄마는 최상의개념이라 무언가 상속을 안받으니 엄마만 포함하고있다
		//그래서 못만든다
		
		//부모변수u 에 자식객체생성 가능하다
		//u는 엄마만 접근이 가능하다임
		//근데 오버라이딩된건 나옴
		Mother u = new Son(); //이건 되네?
		//아들이라는 객체를 엄마타입으로 부른다 아들은 엄마아들 둘다포함이니
		//생성이 가능하다
		u.gene();
		u.job();
		//u.study(); 못찾음 엄마만 접근가능하니까
		
		//지금 u는 타입이 엄마만건드려라 니까 엄마것만 가져올수있고
		//대신 오버라이딩된건 나온다 오버라이딩이 안되면안나온다
		
		//반대로 아들타입으로 만들었다면 아들은 엄마 아들 다포함하고있으니
		//다접근이 가능했던것
		
		//엄마생성자 딸생성자가 같이 나오는건 어쩃든 son();생성자를 부르니까
		// new Son();
		
		
		
		
		
		
		
		
	}
}
