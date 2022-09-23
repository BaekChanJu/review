package ploy;

public class Item {
	protected String num; //자식이 접근못하게할라면 프라이빗 하지만 프로텍티드 해주면가능
	protected	String title;
	
	Item(){
		
		
	}
	
	
	Item(String num, String title){
		this.num = num;
		this.title = title;
	}
	
	
	
	public void output() {
		System.out.println(num);
		System.out.println(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
