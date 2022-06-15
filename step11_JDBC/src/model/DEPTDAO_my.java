package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.Connection_DB;
import model.domain.DeptDTO;

public class DEPTDAO_my {

	// step
	// Driver 로딩
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// step 02
	// DB 연결
	// ip주소, DB 이름, 계정명/pw
	// 모든 부서 검색 메소드
	// Query : "select * from dept
	public static ArrayList<DeptDTO> getALLDept() throws SQLException {
		ArrayList<DeptDTO> allData = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");

			// step03
			// SQL 문장 객체
			stmt = conn.createStatement();

			// step04
			// SQL 문장 객체 실행
			rset = stmt.executeQuery("select * from DEPT");

			// step05
			// Data활용
			allData = new ArrayList<DeptDTO>();
			while (rset.next()) {
//				System.out.println(rset.getCursorName());
				allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));

			}
			conn.setAutoCommit(false);
			conn.commit();
		} finally {
			// step06
			// DB종료
			conn.close();
		}

		return allData;
	}

	// 부서 이름으로 특정 부서 검색
	public static ArrayList<DeptDTO> getDEPT(String DeptName) throws SQLException {
		ArrayList<DeptDTO> allData = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from DEPT");
			allData = new ArrayList<DeptDTO>();
			while (rset.next()) {
				if (rset.getNString("dname").equals(DeptName)) {
					allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
				}

			}
			conn.setAutoCommit(false);
			conn.commit();
		} finally {
			stmt.close();

			conn.close();
		}

		return allData;
	}

	public static void insertDept(DeptDTO newdept) {

	}

	public static void main(String[] args) {
		try {
			Connection_DB.conn_db("ACCOUNTING");
//			ArrayList<DeptDTO> results = getDEPT("ACCOUNTING");
//			for (DeptDTO result : results) {
//				System.out.println(result);
//			}
//			insertDept(new DeptDTO(50, "Programming", "Busan"));
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("에러");
		}

	}

}