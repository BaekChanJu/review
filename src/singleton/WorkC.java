package singleton;

public class WorkC {
	
	DBConnect con;
	
	public WorkC() {
		//con = new DBConnect();
		con = DBConnect.getInstanxe();
	}
	
	public void use() {
		System.out.println("C 작업");
	}

}
