package j12_배열;

import java.util.Random;

public class Array3 {	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] nums = new int[45];
		
		for(int i = 0; i < nums.length; i++) {
			while(true) { 
				boolean findFlag = true;
				
				int randomNum = random.nextInt(nums.length) +1;
				
				for(int j = 0; j< nums.length; j++) {
					if(nums[j] == randomNum) {
						findFlag = false;
						break; //for문을 멈춰주는 break
			}
		}
		if(findFlag) {
			nums[i] = randomNum;
			break; //밖에 있는 while을 멈춰주는 break
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nums[i] );
		}
		
		
//		System.out.println(random.nextInt(10));
		
		
		
	}

}