package j12_배열.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
	private String username;
	private String password;
}

public class Array2 {

	public static void main(String[] args) {
		User user1 = new User("aaa", "1234");
		User user2 = new User("bbb", "2222");
		User user3 = new User("ccc", "3333");
		
		
		
		User[] users = new User[3];
		users[0] = new User("aaa", "1234");
		users[1] = new User("bbb", "2222");
		users[2] = new User("ccc", "3333");
		// =
		User[] users2 = new User[] {
				new User("aaa", "1234"),
				new User("bbb", "2222"),
				new User("ccc", "3333")
		};
		
		for(int i = 0; i < users2.length; i++) {
			System.out.println(users[i].getUsername());
			}
		
		for(User u : users) {
			System.out.println(u.getUsername());
		}
		List<User> userList = Arrays.asList(users);
		userList.set(2,  new User("ddd","4444"));
//		List<User> userList2 = new ArrayList<>(userList);
//		userList2.add(3, new User("ddd", "4444"));
		System.out.println(userList);
//		userList.toArray(); 리스트를 배열로 만드는 방법
		// 리스트를 배열로 만들면 업캐스팅되어 오브젝트로 자료형이 다 바뀐다.
		// 같은 크기의 새로운 배열을 만들어 값을 넣어줘야(하나씩 다운캐스팅해서 값을 넣어준다) 한다.
	}

}
