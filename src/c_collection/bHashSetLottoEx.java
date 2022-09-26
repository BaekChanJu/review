package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>(); //난 인티져로 넣을꺼야~
		
		
		for(int i = 0 ; i<6; i++) { //이렇게 확실한거말고 모를때는 while문으로
			//while(lottos.size()<6)
			int num =(int) (Math.random()*45)+1;
			lottos.add(num); //값 넘길때 add
		}

		System.out.println(lottos);
		//중복된 값은 절대안나와! 
		//해쉬셋은 중복된값은 안나오니  5 5 이렇게 나와버리면 없애버리는거지
		//동일한값을 못들어가게 해버림
		//순번을 저장하는게 아니기때문
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(lottos); //이렇게 어레이리스트로 만들어주고
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		//Collections.sort(lottos); // 소트를 쓸라했더만 sort 는 ArrayList만 받음 그러니
		}
}
