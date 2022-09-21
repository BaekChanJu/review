package basic3;

public class E04_함수이론다지기문제 {
	
	static void method(String i, String j){
		i = i+j;
		System.out.println("i = " + i + " , j = " + j);
	}
	
	public static void main(String[] args) {
		String i = "안녕", j = "자바";
		
		method(i,j);
		System.out.println("i = " + i + " , j = " + j);
		
	}
}

/*1번 설명
 * 
 * main 함수부터읽기시작
 * 
 * 메소드로 i, j값 올림
 * 답은 4임
 * 
 * 
 * 
 * 2번설명
 * 시그니쳐가 달라야함
 * 메소드이름은 같아야하고 매개변수의 갯수가 다르거나 타입이 달라야함
 * 
 * 오버로딩 관련 일단 메소드이름 같음 
 * 앞 보이드 랑 롱은 신경안쓰면됨
 * 2번하고4번이 답
 * 
 * 
 * 3번
 * 
 * 6 2
 * 4 2
 * 이렇게 나와야함
 * 
 * 4번
 * 
 * 안녕자바  자바
 * 안녕 자바
 * String은 CallbyValue 처럼 원본수정이 안되서 올라간 메소드만 계산되 변한다
 * 
 * 
 * 5번
 * 6이랑
 * 0 나와야함
 * 
 * 리턴값은 있지만 아래 메인에 메소드에 리턴값을 넣지만 못받음 그래서 아래는 0나옴
 * 
 * */
 