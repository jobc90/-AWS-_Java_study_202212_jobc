package j16_Object;

//Class에 하나의 public class가 있어야 외부에서 
class Test { 
	private int num;
	
	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "객체 생성");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
	}
	
	
}

public class ObjectFinalize {

	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 10; i++) {
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			test = new Test(i);
			
			test = null;
			
			System.gc(); //gc = garbage collector <- garbage collector를 실행해라
		}
		

	}

}
