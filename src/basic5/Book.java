package basic5;
public class Book {
	
	static int count; //무언갈 공유햐고싶으니 스태틱
	

	public Book() {
		count++;
	}
	
	public static int getCount() { 
		return count; // private의 카운트를 따로 일로 가져옴
		//이제 이걸 사용해서 써줘야함
	}
}


/*
 *  static 
 *  
 *  -객체의 공유임
 *  -객체 생성보다 먼저 실행하기 떄문에 클래스명 접근이 가능
 * 
 * //스태틱으로 변수 선언하면  클래스명으로 불러올수잇음 Book.count
 * 객체 생성후 항상 불러오던 느낌이랑은 다름
 * 
 *
 * 
 * 스태틱 하면 메모리 구조가 바껴서 그냥 공유가된다라 이해하자
 * 
 *함수는 무저건 객체 뒤에붙는거다 원래
 *Math.random(); >>  Math m = new Math(); 
 *						m.random();
 *static 형 객체 생성없이 클래스명.함수 이렇게 할수있는거임
 *
 *
 *
 *
 * 필드에서 static은 서로 공유가 가능하게 해줌 (객체의 공유임)
 * 메소드에서 static을 붙히면
 */
 
