package j12_배열;

public class J12_UserMain {

	public static void main(String[] args) {
		J12_UserService service = new J12_UserService();
		
		service.run();
		service.stop();
		
		System.out.println("나도 코드 수정");

	}

}
