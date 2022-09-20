package basic1;

public class Ex02_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		
		if(a>3 && ++a>3) { //숏서킹 당해서 뒤에껀 작동을안함 
			System.out.println("조건 만족"); //출력안됨
		}
		System.out.println(" a = " + a); //3나옴
		
		if(a>1 || ++a >3) { //이미 크자나 결과가 나와서 숏서킹되서 뒤엣거 a증가안함
			System.out.println("조건만족2");
		}
		System.out.println(" a = " + a); //3ㄴ

		
		
		System.out.println("==========================");
		//근데 숏서킷 때문에 의도치 않은 에러나 뭐가 많아서 요즘은 하나씩만쓰고
		// 하나로 쓰면 숏서킷 안되서 값증가 등등 잘된다
		
		if(a>3 & ++a>3) { 
			System.out.println("조건 만족");  //앤드라 둘다 맞아야 출력구문이나옴
		}
		System.out.println(" a = " + a);  //하지만 하나써서 값은 증가됨 4
		
		if(a>1 | ++a >3) { //a가 4가 되있음
			System.out.println("조건만족2");
		}
		System.out.println(" a = " + a); //5
	}

}
