package j13_상속.casting2;

public class Main {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
//		Transportation transportation = new Transportation();
//		transportation = Taxi t1 //택시를 transportation로 업캐스팅		
//		Taxi t1 = (Taxi) transportation; //다운캐스팅 가능
//		Subway sb1 = (Subway) transportation; // 다운캐스팅 불가능
//		
//		Transportation transportation1 = taxi;
//		Transportation transportation2 = subway;
		
		Transportation[] transportations = new Transportation[6];
		
		transportations[0] = taxi;
		transportations[1] = subway;
		transportations[2] = taxi;
		transportations[3] = subway;
		transportations[4] = taxi;
		transportations[5] = subway;
		//instance of는 포함관계를 보는것
		//getClass()는 명확하게 같은 클래스, instance of보다 엄격하다.
		for(int i = 0; i < transportations.length; i++) {
			if(transportations[i] instanceof Taxi) {
				Taxi tx = (Taxi) transportations[i];
				tx.checkTaxiNumber();

			}else if(transportations[i] instanceof Subway) {
				Subway sw = (Subway) transportations[i];
				sw.checkRoute();
			}
			
			transportations[i].go();
		}
		
		for(Transportation t : transportations) {
			t.stop();
		}

		
		
	}

}
