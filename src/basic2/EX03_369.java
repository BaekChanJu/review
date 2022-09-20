package basic2;

//문제 1부터 50까지 숫자중에서 3,6,9  숫자가 포함되있으면
//그 갯수만큼 짝 이라는 글자를 출력할것이다
//그렇지 않으면 그 숫자를 출력할것이다 1 2 짝 4 5 짝 7 8 짝
//33이면 짝짝 34 짝 35면 짝

//어쩃든 1에서 50까지 반복하라고 반복횟수가 있네?? 그럼 for문 구조를 잡자

//	ex) 26 이라면
// 2 ->
// 6 -> 하나씩 쪼개서 판단해야함

// 123 이면 1이 ㅅ369인지 2가 369인지 

public class EX03_369 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=50; i++) { //
			
			int su = i; 
			boolean su369 = false; //369에 안걸린 애들 판단하려고
			
			
			
			while(su!=0) {
				int na = su % 10;
				if(na==3||na==6||na==9) {
				su369 = true; //true면 위에가 짝이 잘찍혔구나? 알수있음
				}
				su = su/10; //10을 나누는 이유는 한자리씩 1의자리10의 자리판단위해
				//아까 6했으니 나누기 10해서 26의 앞인 2를 판단하는거다
			}
			
			
			if(su369) {
				System.out.println("짝");
			}else { //false의 경우 1은 false니찍힌다 3은 위에서 true니 짝으로나오고
				System.out.println(i);
			}
			
		
			
		}
		

	}

}
