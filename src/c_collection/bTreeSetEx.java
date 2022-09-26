package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet(); //자동정렬해서 나오게해줌
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s")); //d부터 s앞까지
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));
	

	}
}
