package ploy;

public class Cd extends Item {
	
	private String singer ; //가수

	
	Cd(){
		
	}
	
	Cd(String singer,String num, String title){
		super.num = num;
		super.title = title;
		this.singer = singer;
		
	}
	
	
	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
