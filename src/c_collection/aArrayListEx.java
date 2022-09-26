
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] resuilt = dataSet();
		//받은내용을 오브젝트 변수명에 저장을 해주고 for문으로 출력을 해준다	
		
		for(int i = 0; i<resuilt.length; i++) {
			System.out.println(resuilt[i]);
		}
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		//여기값을 위로 올리는 방법은 리턴뿐임 근데 리턴은 하나만 가져갈수있음
		//그래서 묶어야함 이경우는 서로다른 데이터타입들이니까 클래스를 만들어서 덩어리로 넘겨버리기
		//데이터 하나보낼라고 클래스 하나를 더만드는건 사실 근데 좋은건 아님 ㅇㅇ
		//그렇다고 배열은 동일한 데이터타입만 가능한데 ,, 뭘해줄까??
		
		//근데 자바의 클래스는 원래 오브젝트 클래스임(최상의 부모클래스)
		
		Object[] obj = new Object[3]; 
		//최상의 부모클래스로 객체를 생성해주면 이렇게 담을수있고
		//담은것들을 리턴으로 올려준다 그러니 위에 스테틱 보이드에서 보이드를 배열로 바꿔주고
		
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;
		
		return obj;
		
		// Object[3];  이아닌  Object[2]; 로하면 에러가나고
		//이렇게 갯수가 정해진게 아니고 갯수가 동적일때는 어레이 리스트 를사용한다
		//어레이 리스트는 ArrayList list = new ArrayList(2); 해도 지가 
		//알아서 동적으로 늘려준다 그래서 ArrayList list = new ArrayList(); 
		//() 안에 값이 의미가 없으니 안써준다
		

	}
}
