package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		CalculatorExpr ca = new CalculatorExpr();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1번 입력하셈");
			int num1 = sc.nextInt();
			System.out.println("2번 입력하셈");
			int num2 = sc.nextInt();
			
			ca.setNum1(num1);
			ca.setNum2(num2);
			
			System.out.println("덧셈 : "+ca.getAddition());
			System.out.println("뺄셈 : "+ca.getSubtraction());
			System.out.println("곱셈 : "+ca.getMultiplication());
			System.out.println("나눗셈 : "+ca.getDivision());
			
			System.out.println("계속하시겠음?? Y/N");
			
			String answer = sc.next();
			
			if(answer.equalsIgnoreCase("N")) {
				System.out.println("종료");
				break;
			}
		}
		
		sc.close();
	}

}
