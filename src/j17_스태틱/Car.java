package j17_스태틱;

import java.time.LocalDateTime;

public class Car {
	private final static int NOW_YEAR = LocalDateTime.now().getYear();
	
	private static final String CODE = "KIA-" + NOW_YEAR; 

	private static int ai = 1;
	
	private String serialCode; //KIA-2023-0000
	private String modelName;
	


	public Car(String modelName) {
		serialCode = CODE + "-" + String.format("%04d", ai); //String.format을 하면 String변수의 포맷을 정할수 있다. 
		ai++;												//%04d는 0000으로 공간 4개를 채우겠다는 의미
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Car [serialCode=" + serialCode + ", 모델명=" + modelName + "]";
	}
	
	
}
