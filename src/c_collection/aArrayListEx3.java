package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result =	method(); //이렇게 받아올 준비해주게 앞에 리설트붙혀짐
		//여기서 학생정보 출력하고싶넹?
		
		for(Student s: result) {
			System.out.println(s);
		}
		
		//참고 전체요소를 출력이 아니라 검색할때
		Iterator<Student> it = result.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}//이게 빠르다고함
		
	}
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		// Student ? = new Student(); 1개의 경우일때 축약가능
		list.add(new Student("홍길자",25)); //변수 한번만 이렇게 쓰게되면 생략가능 2개이상시에는 만들어줘야함
		list.add(new Student("홍홍",25));
		list.add(new Student("홍2자",25));
		//리턴해야함 
		
		return list;
		}

}

//----------------------------------------------------------
class Student{ //아무것도 안써도 extends Object는 있다 단군할배가
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() { //그래서 이친구는 Object 를 오버라이딩한 녀석이다 투스트링
		return name +"학생은 " +  age + "세 입니다.";
	}
}
