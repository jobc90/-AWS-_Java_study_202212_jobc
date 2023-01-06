package j12_배열;

public class Array5 {
	
	
	// 길이가 늘어난 새로운 배열에 기존 배열의 값을 넣는 코드
	public static void transferArray(int[] oldArray, int [] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}
	//배열의 길이를 +1 하는 코드
	public static int[] addArrayLength(int[] array) {
		int[] newArray = new int[array.length + 1];
		transferArray(array, newArray);
		return newArray;
	}
	
	//배열에 새로운 값을 넣는 코드
	public static int [] addData(int[] array, int data) {
		int[] newArray = addArrayLength(array);
		newArray[array.length] = data;
		return newArray;
	}

	public static void main(String[] args) {
		
		int[] nums = new int[0];
		
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		nums = addData(nums, 4);
		nums = addData(nums, 5);
		
		for(int i =0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
	}

}
