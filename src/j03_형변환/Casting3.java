package j03_형변환;

public class Casting3 {

	public static void main(String[] args) {
		double kor = 87.5;
		double eng = 95.7;
		double math = 80.5;
		
		int total1 = 0;
		double avg = 0;
		int total2 = 0;

		total2 = (int) kor + (int) eng + (int) math;
		total1 = (int)(kor + eng + math);

		avg = (double) total2 / 3.0;
		

		System.out.println("합계1: " + total1  );
		System.out.println("합계2: " + total2  );
		System.out.println("평균: " + avg );

	}

}
