package singleton;

public class DBConnect {
	
	DBConnect() {
		System.out.println(" 실제 디비 연결 ");
	}
	
	
	private static DBConnect con; // 맨처음 널값임 //아래가 얘한태 접근하기위해 스태틱붙혀짐
	
	
	public static DBConnect getInstanxe() { //객체생성없이 불러야하니까
		
		if(con == null) {
		con = new DBConnect(); //여기서만 new를 사용할수있음
		}
		return con; //리턴값의 자료형인 DBConnect 로 바꿔줘야함
		//몇번을 불러도 con이라는 것은 주소값이미 1개받아서 1개뿐임
		// 제일 첫번째에 con이라는 곳에 주소가 올라갔으니
		//계속 그1개값만 리턴을 해주는거임 나머지부터 con은 null이 아니니까
	}
}
