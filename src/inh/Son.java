package inh;

public class Son extends Mother{
	
	public Son() {
		System.out.println("딸 생성자");
	}
	
	public void study() {
		System.out.println("딸은 공부중");
	}
	
	public void job() { //부모의 것을 지금가져온거임 오버라이딩
		System.out.println(" 무직자 ");
	}
	
	

}
