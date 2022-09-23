package access;

import accother.Access;

public class MainTest extends Access {

	public static void main(String[] args) {
		
		MainTest acc = new MainTest();
		acc.a = "프라이빗 변경"; //다른클래스라 접근이안됨
		acc.b = "퍼블릭 변경"; //다른패키지도 쌉가능
		acc.c = "프로텍티드 변경";  //이것도안됨
		acc.d = "디폴트 변경";// 다른 패키지도  폴더로 보냈더니
		//안됨
		
		acc.output();
		
		
		//여기서 Access를 부모로 만든다면?
		//이렇게 자식될 녀석 옆에 부모를 생성
		//MainTest extends Acces
		//상속됬으니 객체를 MainTest acc = new MainTest();
		//부모껄로 만들어야함

	}

}
