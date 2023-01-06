package j07_반복;


public class Star1 {


		public static void main(String[] args) {
			
			for (int i = 0; i < 10; i++) {
				for(int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i = 0; i < 10; i++) {
				for(int j = 0; j < 10 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i = 0; i < 10; i++) {
				for(int k = 0; k < 9 - i ; k++) {
					System.out.print(" ");
					
				}
				for(int j = 0; j < i + 1 ; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			
			}
			
			for (int i = 0; i < 10; i++) {
				
				for(int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < 10 - i ; k++) {
					System.out.print("*");
				}
				
				System.out.println();
			
			}
			
			for (int i = 0; i < 10; i++) {
				
				for(int j = 0; j < 10 - i - 1; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (2*i + 1); k++) {
					System.out.print("*");
				}
				for(int l = 0; l < 10 - i - 1; l++) {
					System.out.print(" ");
				}
				
				System.out.println();
			
			}
			
			for (int i = 0; i < 10; i++) {
				
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (2*(9 - i) + 1) ; k++) {
					System.out.print("*");
				}
				for(int l = 0; l < i; l++) {
					System.out.print(" ");
				}
				
				System.out.println();
			
			}
			
			
	}

}
