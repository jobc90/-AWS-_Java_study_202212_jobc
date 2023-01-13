package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor //기본 생성자
//@RequiredArgsConstructor
//@AllArgsConstructor // 전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor
@Data //는  //@Getter, @Setter, @EqualsAndHashCode, @ToString를 모아놓은 어노테이션 패키지

public class Student {
	private String name; // 이름
	private int year; // 학년
//	private final String address;

}
