package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoleInsert {
	
	private DBConnectionMgr pool; 
	
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();//DBConnectionMgr(튜브대여소는 유일해야 접속자 관리가 된다)는 싱글톤이며 vector(접속개체 컨트롤)가 포함되어있다.
											// pool은 DB에 접속하는 양을 제한한다(트래픽을 걸어준다)
	}
	
	public int saveRole(String roleName) {
		int successCount = 0;
		
		String sql = null;
		Connection con = null;//데이터베이스 연결
		PreparedStatement pstmt = null;//쿼리 실행
		ResultSet rs = null;
		
		try {
			con = pool.getConnection(); // DB연결
			sql = "insert into role_mst values (0, ?)";//0을 넣어서 오토 인크리즈먼트로 자동으로 들어가게 한다.
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//우리가 넣는 값이 몇번째에 들어가는지 모르기 때문에 generated_keys를 쓴다.
			pstmt.setString(1, roleName); // sql 첫번째 물음표에 roleName을 넣는다.
										//set은 값을 넣는 행위, get은 값을 가져오는 행위.
			
			successCount = pstmt.executeUpdate();//쿼리 실행 명령문
			
			int newKey = 0;
			
			rs = pstmt.getGeneratedKeys();//getGeneratedKeys는 오토 인크리즈먼트에 따라 key값을 생성해 준다.
			if(rs.next()) {				//1개의 값을 넣어서 if를 썼다.//키값은 테이블의 모양을 가진다
				newKey = rs.getInt(1);	//1을 넣는 이유는 열의 위치이다.(여러 열이 있더라도 1번열이 key값이므로)
										//rs.next()는 다음 값을 꺼내는데 다음 값이 없으면 false가 된다. 반복문(while 또는 for)이 가능한 이유
			}
			
			System.out.println(newKey !=0 ? "새로운 키값: " + newKey : "키가 생성되지 않음");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //finally는 이전에 exception이 터지더라도 무조건 실행된다.
			pool.freeConnection(con, pstmt, rs);
		}
		
		return successCount;
	}
	public static void main(String[] args) {
		
		RoleInsert roleInsert = new RoleInsert();
		
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수: " + successCount);
		
	}

}
