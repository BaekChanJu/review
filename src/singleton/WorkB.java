package singleton;

public class WorkB {
	
	DBConnect con;
	
	public WorkB() {
		//con = new DBConnect();
		con = DBConnect.getInstanxe();
	}
	
	public void use() {
		System.out.println("B 작업");
	}

}
