package basic3;

public class EX09_예외처리카페문제 {
	static String str = "";
	
	static void method( int i ){
	     try{
	if ( i == 10 ) throw new Exception();
	str += "A";
	     } catch( Exception ex ) {
	 str += "B";
	 return;
	     } finally {
	str += "C"; 
	     } //예외든 뭐든 다나온다
	     //마지막꺼는 예외였으니까 D가 안나남
	     
	     
	str += "D";
	} //예외가 아닐때만 나오게되고
	
	//그니까 D가 마지막에 왜 안나오냐면 처음에 try문 통과되면 try는 예외가 아닌문이다
	//A찍히고 C가 파이널리니까 찍히고 D까지찍히고 
	//그다음은예외니까 B찍히는데 리턴이있네? 리턴밑에는 원래 어떤거든 출력이안됨
	//하지만 c가 파이널리라 찍히고 D는 리턴문에서 나간거니까 안찍힌다
	//예외적으로 C만 파이널리라 찍히게 된것이다!
	public static void main( String [] args ) {   
	    method( 5 );
	    method( 10);
	System.out.println(str);
	}
	}


//ACDBC

//일부로 예외를 발생시킬때는 throw
//전달할때는 throws 







//1번문제는 마지막이 답임






/*2번은답 1번 에러남
 * 
 * public class text {

static void method() {
	throw new Exception();
}



public static void main(String[] args) {
	  try{
	         method();
	} catch( Exception ex ) {
	         System.out.println("예외처리");
	     } 
}
}
 * 왜냐 public class text 부분에 throws Exception 로 예외를 넘겨주지않음
 * */

/*
 * */





//3번 답은 4번일꺼임 왜냐 파이널리는 무저건 마지막에 파이널리구문을 출력해줌
//예외가 있어도 마지막은 파이날리





//4번  System.exit(0); 시스템을 종료니 시스템이 그냥 종료되버림
//4번의 정답은 3번 그래서 실행은 성공하나 프로그램이 종료되어 아무것도 출력되지않음





//5번은 의 정답은 2번출력된다이다 try이 가 2번나온다는건데 설명하면
//트라이에서 메소드를만나 i가 위로 올라가면 if문이있는데 조건이 짝수일때 예외를 발생해라
//라는 구문임 그래서 돌리면 0 1 2 3 4 이렇게 돌아가는데 짝수는 예외인catch니
//0 2 4 일떄 3번나오고 홀수는 예외가 아니니 try 1,3 에 2번나오는것






//6번의 답은 2예상?



