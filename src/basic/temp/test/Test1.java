package basic.temp.test;

//다른사람 소스 분석하기 이론

import java.awt.*;

public class Test1 {
	
	Frame f; // -> null 객체를 생성해줘야함 //기존에 만들어놓은 프레임
	
	Test1(){//기본생성자
		f= new Frame("안녕");
		
	}
	//기본생성자 끝나면 18라인으로 다시돌아감
	
	void addLayout() { //결국 여긴 실행이 안됨 호출을 안해서 호출해보장
		f.setBounds(100,100,300,260); //픽생크기정하기
		f.setVisible(true); //출력을 할꺼냐? true
	}

	public static void main(String[] args) { //메인부터시작
		
		Test1 t1 = new Test1(); //new 로 만들었으니 생성자 기본위 생성
		//여길 만나면 기본생성자로 점프
		
		t1.addLayout(); 

	}

}






