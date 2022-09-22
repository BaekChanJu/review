package singleton;

public class WorkA {
	
	
	DBConnect con;
	
	public WorkA() {
	//	con = new DBConnect();
		con = DBConnect.getInstanxe();
		
	}
	
	public void use() {
		System.out.println("A 작업");
	}

}
