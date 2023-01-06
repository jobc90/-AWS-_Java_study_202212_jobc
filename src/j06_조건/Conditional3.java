package j06_조건;

import java.util.Scanner;

public class Conditional3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.println("점수 입력: ");
		score = scanner.nextInt();
//		
//		if(score > 89) {
//		}else if(score % 10 > 4) {
//				grade = "A+";
//		}else {
//			grade = "A";
//			}
//		if(score > 79) {
//		}else if(score % 10 > 4) {
//			grade = "B+";
//	}else {
//		grade = "B";}
//		
//		if(score > 69) {
//		}else if(score % 10 > 4) {
//			grade = "C+";
//	}else {
//		grade = "C";
//		}
//		if(score > 59) {
//		}else if(score % 10 > 4) {
//			grade = "D+";
//		}else {
//			grade = "D";
//			}else {grade = "F";}
		
		if (score < 0 || score > 100) {
			grade = null;
		}else if (score > 89) {
			grade = "A";
		}else if (score > 79) {
			grade = "B";
		}else if (score > 69) {
			grade = "C";
		}else if (score > 59) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		
		if (score > 59 && score < 101 && (score % 10 > 4 || score == 100)) {
			grade += "+";
		}
		
		
		if(grade == null) {
			System.out.println("계산 불가");
		}else {
			System.out.println("점수(" + score + "): " + grade + "학점");	
		}
		
		
	}

	
}