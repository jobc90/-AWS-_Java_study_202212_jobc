package j17_스태틱.싱글톤;

public class KIA {
	
	private static KIA instance = null;
	
	private KIA() {}
	
	public static KIA getInstance() {
		if(instance == null) {			//null값일때만 실행이 되게한다.
			instance = new KIA();		//최초의 호출때만 값이 들어간다.
		}
		return instance;
	}
	//여기까지 싱글톤의 형태. 변함이 없다
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}

}
