package j17_스태틱.싱글톤;

public class KiaMain {

	public static void main(String[] args) {
		KIA kia = KIA.getInstance();
//		KIA kia2 = new KIA(); 는 실행할 수 없다 KIA는 private이기때문에
//		getInstance를 통해 외부에서 유일값을 가진 KIA를 생성가능하다
		
		kia.printCompanyName();

	}

}
