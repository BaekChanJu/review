package zfinal;

class Parent{
	final String filed = "부모님꺼";
	final public void jib() {
		System.out.println("부모님이만든거");
	}
	
}

class Child extends Parent{
	Child(){
		
	}
	
	public void jib() { //부모가 파이널 붙혀놔서 오버라이딩을 못하게됨
		System.out.println("탕진");
	}
	
}

public class zfinal {
	public static void main(String[] args) {
		Parent p = new Child(); //자식을 부모타입으로 만들었으니 접근 가능
		System.out.println(p.filed);
		p.jib();
	}
	
	
	
	//필드에 파이널 붇어있으면 값을 변경하지 못한다

}
