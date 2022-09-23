package ploy;

public class Book extends Item {
	
	private String writer; //저자 /  나만건드릴수있게 해줬음
	private String company; //출판사
	
	
	
	Book(){
		this("d","d","d","d");
		System.out.println("zzz"); //2번째로 찍힘
		
		//이건왜했냐면
		//일일이 타이핑하기가 귀찮자나? 그래서 매개변수4개인 메소드를
		//여기로 끌어와서 쓴거임 
		//this는 아래 매개변수4개인 생성자대려온거임
	}
	
	
	
	Book(String writer, String company, String num, String title ){
		super(num,title); //이렇게 부모꺼를 가져올 수 있음
		//super.num = num; //부모꺼 가져올때 슈퍼
		//super.title = title;
		this.writer = writer;;
		this.company =company;
		System.out.println("zz");//1번으로 찍힘
	}
	
	public void output() {
		
		System.out.println(num);
		System.out.println(title);
		System.out.println(writer);
		System.out.println(company);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
