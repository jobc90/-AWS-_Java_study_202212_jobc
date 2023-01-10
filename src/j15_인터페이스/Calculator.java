package j15_인터페이스;

public interface Calculator {
	//인터페이스의 특징 1. abstract를 적지 않아도 기본적으로 적용
	// 					2. 인터페이스는 구현하는 객체가 아니다.
	//					3. 일반 객체를 구현하려면 default를 적어줘야 한다.(일반변수(멤버변수)를 가질 수 없다, 상수는 가능)
	
	public int ERROR = -999999; // 인터페이스는 변수를 가질 수 없기 때문에 상수로 입력된다.
	
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	
	public default double multiplication(double x, double y) {
		
		return x * y;
		
	}
	
	public double division(double x, double y);

}
