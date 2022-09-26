package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4); //4개만든다하고 6개를 넣음 의미없다는 의미
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		//즉 내가 넣고 싶은 정확한 자료형을 지정해주면된다 어레이 리스트를 선언할때
		//ArrayList<String>  list = new ArrayList<String>(4);
		// 들어가는 자료형이 명확하게 됬군! String으로!
		
		
		
		list.set(3, "rat");
		System.out.println(list); // 0 1 2 3 번째 즉 fox를 바꿔줌
		
		list.remove(1);
		System.out.println(list); // 0 1 번째 지브라 없어짐
		
		Collections.sort(list); //컬렉션즈 객체 생성안해되는게 찾아보면 스태틱임 스태딕이라 객체생성업이 ㄱㄴ
		System.out.println(list);
		//순서대로 정렬
	
		
		//System.out.println(list); 전체보는거고 원래는 for로 해줘야함 배열은
		
		for(int i=0; i<list.size(); i++) { //총6개니까 6번돌겠네?
			String data = (String)list.get(i);
			//하나들어온게 스트링인데 그다음은 다른 자료형일수도있자나 계속 자료형달라지면 어뜨캐..<< 
			//그럼 겟은 어떤타입으로 출력해야해??...
			//그냥 난 오브젝트타입으로 출력 할태니까 너가 나오면 알아서 형변환해
			//그래서list.get(i); 그냥쓰는게 아니라
			//String data = (String)list.get(i); 이렇게 형변환을 해서 사용해줘야함
		}
		
		for(String data : list) { //오른쪽에는 집합 왼쪽엔 자료형과 내마음대로 변수이름
			System.out.println(data);
		} //향상된 for 문을 요즘 많이이용하고 generics 로 타입을지정한
		//이렇게 향상된 for문을 잘 이용할 수 있는 장점
		//향상된 for문을 쓰려면 generics을 꼭 지정해주면 되겠구나 !
		

		
		
		
		//갯수가 픽스되있으면 그냐 배열쓰고 갯수 많거나 모르면 어레이즈투 쓰면됨
		
		
		
		
		
		
		
		//콜렉션 : 자료구조 관련 클래스들의 모임
			//List - 인덱스 사용 가능 (순서를 저장) -- 뭐 여긴 순서대로니까 중복값이 상관없지 사과 사과 토끼 토끼
			//set- 순서를 저장하지 않음 - 해쉬셋은 중복단어는 안나옴 (순서가없어서 중복되면 뭐가뭔지모름)
			//Map - 키와 값 저장
			//      키는 중복불가
			//		키로 값을 찾는 구조
		
		//참고 - 스택과 큐
		// 큐는 선착순임 먼저들어간에가 먼저나옴
		
		//스택개념 바구니에 a b c 담았다가 꺼내면 c가먼저나오지? 그거임
		
	}
}
