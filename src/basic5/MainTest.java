package basic5;

public class MainTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("총 갯수 : " + b1.getCount());
		
		Book b2 = new Book();
		System.out.println("총 갯수 : " + b2.count);
		
		Book b3 = new Book();
		System.out.println("총 갯수 : " + b3.getCount());

		//System.out.println("총 갯수" + Book.count);
		//객체가 없어도 스태틱이라는 새로운 공간이 만들어져있는것이라 실행은됨 0나옴
		//Book.getCount 는 안된다 
	}

}



