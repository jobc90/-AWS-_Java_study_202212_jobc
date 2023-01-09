package j12_배열;

public class DoubleArray1 {

	public static void main(String[] args) {
		int num = 0;
		//int 뒤에 대괄호를 붙이면 배열이 된다.
		int[] nums = new int[2];
		//int배열 뒤에 대괄호를 붙이면 배열을 담을 수 있는 배열이 된다.
		int[][] d_nums = new int[3][2];
//2개짜리 배열이 3개로 묶인것이다.
		d_nums[0][0] = 1;
		d_nums[0][1] = 4;
		
		d_nums[1][0] = 2;
		d_nums[1][1] = 5;
		
		d_nums[2][0] = 3;
		d_nums[2][1] = 6;
		
		for(int i = 0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				System.out.println(d_nums[j][i]);
			}
		}
		
		int[][] d_nums2 = new int[][] {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				System.out.println(d_nums2[i][j]);
			}
		}
		
		
		System.out.println(d_nums2.length);
		System.out.println(d_nums2[0].length);
		
		for(int i = 0; i < d_nums2.length; i++) {
			for(int j = 0; j < d_nums2[i].length; j++) {
				System.out.println(d_nums2[i][j]);
			}
		}
		
		
	}

}
