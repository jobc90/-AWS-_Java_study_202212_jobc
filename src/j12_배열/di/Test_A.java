package j12_배열.di;

public class Test_A{
	
//	private Test_B tb = new Test_B();
//	
//	private Test_B tb;
//	
//	Test_A가 생성이 되어야 Test_B가 생성이 된다.
//	public Test_A() {
//		tb = new Test_B();
//	}
	
	
	//프로그램 중간에 값이 바뀌면 안되는놈한테는 final을 걸어준다.
	private final Test_B tb;
	//required argument constructor
	public Test_A(Test_B tb) {
		this.tb = tb;
		
	}
//	
//	public void setTB(Test_B tb) {
//		this.tb = tb;
//	}
	
	
	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.testB1();
		
	}
	
	public void testA2() {
		System.out.println("테스트A2 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.testB1();
		
	}

}
