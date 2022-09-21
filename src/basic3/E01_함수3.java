package basic3;

public class E01_함수3 {

	public static void main(String[] args) {
		
		int[] result = add(); //int[]이 들어오니까 받는에도 int[] 이여야함
		//a와 b의 값을 받아서 합한 결과를 여기서 출력
		int sum = result[0] + result[1];
		
		System.out.println(sum);
	}
	
	static int[] add() {
		int a =10;
		int b =20;
		
		int[] arr = {a,b}; 
		return arr;
		//리턴은 하나바께 못보내니까 배열로 만들어서 올려줘야함
	}

}
