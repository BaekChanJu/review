package basic2;

public class E05_로또 {

	public static void main(String[] args) {
		
int[] lotto = new int[6];
		
		//값 랜덤지정
		for(int i =0; i<lotto.length; i++) {
			lotto[i] =(int) (Math.random()*45) +1;
		}
		
		
	
		for(int i = lotto.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				
				
				
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		
		
		//번호출력
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
}
		
}		
	
//if(lotto[j]>lotto[j+1]) { 그니까 여기서 +1은 더하기를 의미하는게아니라
//다음방이라는거임

// 5번방과 5+1번방 증6번방을 비교 하라는거임
//그래서 만약에 5번방의값>6번방의값  5번방의 값이 6번방보다 크면
//아래를 이용해서 값을 바꿔라 라는뜻

//5번방의값이 = 7 6번방의값이 5면
//템프선언하고 템프에 첫번째값 7을넣고 첫번쨰녀석은비어있고
//두번째 5를 첫번째 7자리에 들어가고 탬프에 있던 7을 두번쨰5있던 자리에 넣어라
//변수에서 = 기준으로 뒤에있는값을 앞에넣어라 라는뜻이니까..


/*버블
 * a = 5 b = 10
 * 이걸이동하려면 
 	중간에 뭐가 하나 있어야함
 * 
 * tenp = a
 * 
 * a=b; b를 a에 넣는다 그럼 a는10 5는 템프에있고 b는비어있고
 * 
 * b= temp; 이느낌 temp5를 b에넣는다
 * 
 * 이렇게 3각관계로만 값이동이 가능하다
 * */
 









//Math.random
////lotto[i]에 임의의수를 지정하는데
//램덤은 실수형임
//램덤을 사용해서 만들어줌 실수를 int로 형변환까지


//Math.random() 0.0부터 (실수) 1.0까지 아무숫자가나옴

//0.1234 가 나오면 *10 한다고 하면 1.234 겠지? 그럼
//(int)( Mate.random*10) 이렇게 1.234를 형변환하면 소숫점 없어지고 1나오는거임
///+1는 0나오는걸 방지












/*버블
 * a = 5 b = 10
 * 이걸이동하려면 
 	중간에 뭐가 하나 있어야함
 * 
 * tenp = a
 * 
 * a=b; b를 a에 넣는다 그럼 a는10 5는 템프에있고 b는비어있고
 * 
 * b= temp; 이느낌 temp5를 b에넣는다
 * 
 * 이렇게 3각관계로만 값이동이 가능하다
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 