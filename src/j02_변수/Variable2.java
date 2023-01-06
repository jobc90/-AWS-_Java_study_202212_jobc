package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '병';
		char firstName2 = '철';
		
		char alphabetA = 'A';
		
		System.out.println("조" + firstName1 + firstName2);
		System.out.println("알파벳A: " + alphabetA);
		
		System.out.println(alphabetA + 'B');
		System.out.println(alphabetA);
		System.out.println("\uAC00");
		System.out.println(firstName1 + 0);
		System.out.println(firstName1);
	}

}
