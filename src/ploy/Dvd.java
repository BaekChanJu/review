package ploy;

public class Dvd extends Item {
	
	String actor; //배우
	String director; //감독
	
	
	Dvd(){
		
	}
	
	Dvd(String actor, String director,String num, String title){
		super.num = num;
		super.title = title;
		this.actor = actor;;
		this.director =director;
	}
	
	
	public void output() { //퍼블릭 까지 다 같아야 오버라이딩
		System.out.println(num);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
