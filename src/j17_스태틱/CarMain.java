package j17_스태틱;

public class CarMain {

	public static void main(String[] args) {
		Car[] cars = new Car[5];
		
		cars[0] = new Car("스포티지");
		cars[1] = new Car("EV-6");
		cars[2] = new Car("K8");
		cars[3] = new Car("모하비");
		cars[4] = new Car("카니발");
		
		
		
		for(Car c : cars) {
			System.out.println(c);
		}

	}

}
