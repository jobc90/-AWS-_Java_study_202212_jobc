package j00_개인연습;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		
//		Training training = new Training() {
//			
//			@Override
//			public String training(String training) {
//			
//				return training + "을(를) 훈련합니다.";
//			}
//		};
//		System.out.println(training.training("슈팅"));
//		System.out.println();
		
		Training training2 = (String training) -> {
			return training + "을(를) 훈련합니다.";
		};
		System.out.println(training2.training("슈팅"));
		System.out.println();
		
		Training training3 = (training) -> {
			return training + "을(를) 훈련합니다.";
		};
		System.out.println(training3.training("프리킥"));
		System.out.println();
		
		Training training4 = training -> {
			return training + "을(를) 훈련합니다.";
		};
		System.out.println(training4.training("코너킥"));
		System.out.println();
		
		Training training5 = training -> training + "을(를) 훈련합니다.";
		System.out.println(training5.training("패스"));
		System.out.println();
		
		Training training6 = training -> training + "을 한번 더";
		
		
		
	}

}
