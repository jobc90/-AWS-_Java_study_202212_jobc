package j17_스태틱;

public class TestA {
	
	private static int num;
		
	public static int setNum(int num) {
		return TestA.num = num;
	
	}
	
	public static int getNum() {
		return num;
	}

}
