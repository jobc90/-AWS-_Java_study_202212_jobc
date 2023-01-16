package j21_예외;

public class ArrayException {

	public static void main(String[] args) {

		Integer[] nums = {1, 2, 3, 4, 5};
		
		try {
			throw new NullPointerException(); //강제로 예외로 만들기
		
//		for(int i = 0; i < 6; i++) {
//			System.out.println(nums[i]);
//		}
	} catch (IndexOutOfBoundsException e) {//IndexOutOfBoundsException는 인덱스를 초과한 경우
		 System.out.println("예외 처리함");// 예상되는 예외를 먼저 처리
	} catch (NullPointerException e) {
		System.out.println("빈값 처리함");
	} catch (Exception e) {
		System.out.println("예상 못한 예외 처리함");// 예상하지 못하는 예외를 나중에 처리
	}
	
		System.out.println("프로그램 정상 종료");

	}

}

