package basic3;

public class E03_2CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		//a는 스택영역에 생기지만 new 라고 생긴 객체는 힙에 저장된다
		
		//[a](1000번지를 가르키고있음     [안녕](1000번지)
		
		add(a,b);
		System.out.println("A = " + a + " B = " + b);

	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b); //어팬드는 더한다라는 의미 (어팬트는 Buffer) 에만닜음
		
		System.out.println("A = " + a + " B = " + b);
	}

}

/* 문자열 처리 클래스
 * 
 * -String
 * 
 * -StringBuffer / StringBuilder 99퍼 유사함 (네트웍 타나안타나)
 * 
 * 
 * */


//값이 복사되는게 아니라 값은 힙에저장되어 그대로있고
//주소로 같은값을 가르키는 것인데 a+b를 해버리면 힙의 값이 바뀌고
//add를 이제 나오면 add의 값은 없어지지만 이미 힙에있던 원본은 그대로 있다
//그래서 값이 변경된채로 진행이되는것이다
//이걸 CallByRef 라 하고 참조 자료형에서 사용 String은 Value와 같다
