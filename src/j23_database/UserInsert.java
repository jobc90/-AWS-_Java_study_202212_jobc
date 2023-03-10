package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagement.entity.User;

public class UserInsert {
	
	private DBConnectionMgr pool;
	
	public UserInsert() {
		pool = DBConnectionMgr.getInstance();
	}


	public int saveUser(User user) {
		int successCount = 0;
	
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = pool.getConnection();
			
			sql = "insert into user_mst\r\n"
					+ "values (0, ?, ?, ?, ?)";
			
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getName());
			preparedStatement.setString(4, user.getEmail());
			
			successCount = preparedStatement.executeUpdate(); // 쿼리에 insert, update, delete 명령을 실행
			
			resultSet = preparedStatement.getGeneratedKeys();
			
			if(resultSet.next()) {
				System.out.println("이번에 만들어진 user_id key값: " + resultSet.getInt(1));
				user.setUserId(resultSet.getInt(1));
			}
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return successCount;
	}
	
	
	
	public int saveRoles(Map<String, Object> map) {
		int successCount = 0;

		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		
		try {
			
			connection = pool.getConnection();
			List<Integer> roles = (List<Integer>) map.get("roles");//map을쓰면 다운캐스팅을 해도 명확하게 값을 꺼낼 수 있다.
																	//list를 썼다면 다운캐스팅했을때 user가 꺼내졌을것
			User user = (User) map.get("user");						
			
			sql = "insert into role_dtl\r\n"				//여기서부터
					+ "values ";
			
			for(int i = 0; i < roles.size(); i++) {
				sql += "(0, ?, ?)";
				if(i <roles.size() - 1) {
					sql += ",";
				}
			}												//여기까지 쿼리문 작성
			
			preparedStatement = connection.prepareStatement(sql);
			
			for(int i = 0; i < roles.size(); i++) {
				preparedStatement.setInt((i*2) + 1, roles.get(i));
				preparedStatement.setInt((i*2) + 2, user.getUserId());
				
			}
			
			successCount = preparedStatement.executeUpdate();

		
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}	
		
		return successCount;
	}
	
	public static void main(String[] args) {
		
		UserInsert userInsert = new UserInsert();
		
		User user = User.builder()
				.username("eee")
				.password("1234")
				.name("eee")
				.email("eee@gmail.com")
				.build();
		
		int successCount = userInsert.saveUser(user);
		
//		System.out.println("쿼리 실행 성공: " + successCount + "건");
//		
//		System.out.println(user);
		
/*================================================================================*/
		//list를 쓰는 경우 - 반복을 돌려서 안에 있는 값을 다 꺼낼때
		//map을 쓰는 경우 - 지정해준 key값이 있을 때, 임시 entity 객체, 반복목적으로는 잘 안쓴다. //원하는 값을 꺼낼때?
		List<Integer> roleIdList = new ArrayList<>();
		roleIdList.add(1);
		roleIdList.add(2);
		roleIdList.add(3);
		
		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("roles", roleIdList);
		
		System.out.println(map);
		
		successCount = userInsert.saveRoles(map);
		
		System.out.println("쿼리 실행 성공: " + successCount + "건");
		
//		int listSize = 3;
//		
//		String sql = "insert into test values";
//		String values = "(0, ?, ?)";
//		
//		for(int i = 0; i < listSize; i++) {
//			sql += values;
//			if(i < listSize - 1) {
//				sql += ",";
//			}
//		}
//		System.out.println(sql);
	}

}
