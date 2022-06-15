package getDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.DBUtil;

public class ControlDept {
	// 부서 삭제 메소드
	// Query: DELETE FROM "테이블명"  WHERE "필드명" = "??";
	public static void deleteDept(int key) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConn();
		pstmt = conn.prepareStatement("delete from dept where deptno= ?");
		pstmt.setInt(1, key);

		int r = pstmt.executeUpdate();
		if (r != 0) {
			System.out.println("삭제완료");
		}
	}
}
