package j24_람다;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda2 {
	
	public static void main(String[] args) {
		
		// 1. Runnable - run()
		// 명령이 2개 이상이면 중괄호로 묶어준다.
		Runnable a = () -> System.out.println("실행");
		System.out.println();
		Runnable b = () -> {
			System.out.println("여");
			System.out.println("러");
			System.out.println("명");
			System.out.println("령");
			System.out.println("실");
			System.out.println("행");
			System.out.println();
		};
		
		a.run();
		b.run();
		
		// 2. Supplier<T> - get()
		Supplier<LocalDate> c = () -> LocalDate.now();
		Supplier<String> d = () -> {
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		};
		System.out.println(c.get());
		System.out.println(d.get());
		System.out.println();
		
		// 3. Consumer<T> - void accept(T t)
		Consumer<String> e = name -> {
			System.out.println("이름: " + name);
			System.out.println("오늘날짜: " + d.get());
		};
		
		e.accept("손흥민");
		System.out.println();
		
		//메소드 참조 표현식 ([인스턴스]::[메소드명 또는 new])
		Consumer<String> f = System.out :: println;
		f.accept("출력");
		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("손흥민");
		names.add("김민재");
		names.add("이강인");
		names.add("황희찬");
		
		names.forEach(name -> System.out.println("이름: " + name + "님"));
		System.out.println();
//		는 아래의 명령과 같다.
		Consumer<String> g = name -> System.out.println("이름: " + name + "님");
		names.forEach(g);
		System.out.println();
		
	
//	    default void forEach(Consumer<? super T> action) {
//	        Objects.requireNonNull(action);
//	        for (T t : this) {
//	            action.accept(t);
//	        }
//	    }
//		this = names가 되고
//		action = Consume가 된다.
		
		
		

		
		names.forEach(name -> {
			System.out.println("이름을 출력합니다.");
			System.out.println("이름: " + name);
			System.out.println();
		});
		
		Map<String, String> userMap = new HashMap<>();
		userMap.put("username", "aaa");
		userMap.put("password", "1234");
		
		userMap.forEach((key, value) -> {
			System.out.println("key: " + key);
			System.out.println("value: " + value);
			System.out.println();
		});
		
		

		
		
	}

}
