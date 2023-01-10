package j13_상속;

public class KiaCar extends Car {
	
	public KiaCar() {
		super(); //부모(상위객체를 의미)를 호출 - this는 자신을 호출
		         //super는 항상 상위에 있어야한다
		System.out.println("자식");
	}

	@Override
	public int discountPrice(int percentage) {
		return super.discountPrice(percentage);
	}

}
