
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList<String> result = dataSet();
		//받은내용을 오브젝트 변수명에 저장을 해주고 for문으로 출력을 해준다	
		
		for(int i = 0; i<result.size(); i++) { //어레이 리스트는.size 사용
			System.out.println(result.get(i)); //.get으로 불러옴
		}
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static ArrayList<String> dataSet() //자료형은 어레이리스트로 바꿔줘야함
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;


		
		ArrayList<String> list = new ArrayList<String>();
		//배열 갯수 모를때는 어레이 리스트로 저장해서 보내준다
		//동적인 배열인것이다
		//지가 알아서 늘려주는에
		
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
		

	}
	
	// Object[3];  이아닌  Object[2]; 로하면 에러가나고
			//이렇게 갯수가 정해진게 아니고 갯수가 동적일때는 어레이 리스트 를사용한다
			//어레이 리스트는 ArrayList list = new ArrayList(2); 해도 지가 
			//알아서 동적으로 늘려준다 그래서 ArrayList list = new ArrayList(); 
			//() 안에 값이 의미가 없으니 안써준다
	//그러니까 배열을 쓸라면 정확히 갯수를 알고 해야하는데 어레이리스트는 몰라도 되니
	//어레이 리스트 즉 동적인 배열을 가장 많이 이용한다
}
