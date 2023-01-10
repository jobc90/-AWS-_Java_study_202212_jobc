package j13_상속.casting2;

public class Taxi extends Transportation {

	@Override	// @로 시작하는 문법을 어노테이션이라 한다.
				//어노테이션은 표기용이며, 재정의 되었다고 알려주는 역할
	public void go() {
		System.out.println("택시를 타고 출발");
	}

	@Override
	public void stop() {
		System.out.println("택시를 타고 도착");
	}
	
	public void checkTaxiNumber() {
		System.out.println("택시 번호 확인");
	}
	


}
