package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptDTO;
import utils.DBUtil;

public class DEPTDAO {
	// step01 ****************
	// Driver 로딩
	// 표준 (형식정해져있음) - Class.forName("com.mysql.cj.jdbc.Driver");
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 정보를 얻을때는 void타입은 X
	// 하나만 반환할때는 DeptDTO라고 정의해도 되지만 여러개를 할땐 ArrayList사용
	// 모든 부서 모든 정보 검색 메소드
	// Query : "select * from dept"
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {
		ArrayList<DeptDTO> allData = null;
		Connection conn = null; // conn이 없을때는 생성되지 않도록 하려고 미리 선언
		Statement stmt = null;
		ResultSet rset = null;

		try {
			// step02 ****************
			// DB연결
			// ip주소, DB 이름, 계정 이름/비밀번호, ....
			conn = DBUtil.getConn();

			// step03
			// SQL 문장 객체
			// Statement - java.sql패키지
			stmt = conn.createStatement();

			// step04
			// SQL 문장 객체 실행
			rset = stmt.executeQuery("select * from dept");

			// step05
			// Data 활용
			allData = new ArrayList<DeptDTO>();
			while (rset.next()) {
				allData.add(new DeptDTO(rset.getInt("DEPTNO"), rset.getString("DNAME"), rset.getString("LOC")));
			}

//      conn.commit();

			// step06
			// DB 종료 ****************
		} finally {
			DBUtil.getClose(rset, stmt, conn);
//			stmt.close();
//			conn.close(); // 자원을 가져다가 썼으니깐 close해줘야 함
		}
		return allData;
	}

	// 실습! 부서이름으로 특정 부서 검색
	public static DeptDTO getDept(String DNAME) throws SQLException {
//      DeptDTO dto = null;
//      ArrayList<DeptDTO> allDTO = getAllDept();
//      for(int i = 0; i < allDTO.size(); i++) {
//         if(allDTO.get(i).getDNAME() != null && allDTO.get(i).getDNAME().equals(DNAME)) {
//            dto = allDTO.get(i);
//            return dto;
//         }
//      }
//      
//      return null;

		// 강사님 코드
		Connection conn = null;
		// ver1
//      Statement stmt = null;

		// ver2
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DeptDTO data = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			// ver1
//         stmt = conn.createStatement();
//         rset = stmt.executeQuery("select * from dept where dname = '" + DNAME + "'");

			// ver2
			// 1 -> ?가 들어가는 위치 x -> DNAME
			pstmt = conn.prepareStatement("select * from dept where dname = ?");
			pstmt.setString(1, DNAME);

			rset = pstmt.executeQuery();

			data = new DeptDTO();
			while (rset.next()) {
				data = new DeptDTO(rset.getInt("DEPTNO"), rset.getString("DNAME"), rset.getString("LOC"));

			}
		} finally {
			DBUtil.getClose(rset, pstmt, conn);
		}
		return data;

	}

	// 부서 생성 메소드
	// Query : insert into dept values(deptno, dname, loc); ->psmt
	public static boolean insertDept(DeptDTO newdept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement("insert into dept values(?,?,?)");
			pstmt.setInt(1, newdept.getDeptno());
			pstmt.setString(2, newdept.getDname());
			pstmt.setString(3, newdept.getLoc());
			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}
		} finally {
			DBUtil.getClose(null, pstmt, conn);
		}
		return false;
	}

	// 부서 삭제 메소드
	// Query: DELETE FROM "테이블명"  WHERE "필드명" = "??";
	public static void deleteDept(int key) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
		pstmt = conn.prepareStatement("delete from dept where deptno= ?");
		pstmt.setInt(1, key);

		int r = pstmt.executeUpdate();
		if (r != 0) {
			System.out.println("삭제완료");
//			for (DeptDTO dept : getAllDept()) {
//				System.out.println(dept);
//			}
		}

	}

	// 부서 업데이트 메소드
	// UPDATE table_name SET name = '테스트 변경', country = '대한민국' WHERE id = 1105;

	public static void updateDept(DeptDTO newdept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement("update dept set deptno=?,dname=?,loc=? where deptno=?");
			pstmt.setInt(1, newdept.getDeptno());
			pstmt.setString(2, newdept.getDname());
			pstmt.setString(3, newdept.getLoc());
			pstmt.setInt(4, newdept.getDeptno());
			pstmt.executeUpdate();

		} finally {
			DBUtil.getClose(null, pstmt, conn);
		}

	}

	// join 탐색
	public static void joindept(String table1, String table2) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			stmt = conn.createStatement();
//			select * from 'table1' join 'table2';
			rset = stmt.executeQuery(String.format("select * from %s,%s ", table1, table2));
			while (rset.next()) {
				System.out.println("MGR: " + rset.getString("MGR"));
				System.out.println("DEPTNO: " + rset.getString("dEPTNO"));
				System.out.println("ENAME: " + rset.getString("eNAME"));
				System.out.println("-----------");
			}

		} finally {
			DBUtil.getClose(rset, stmt, conn);
//			stmt.close();
//			conn.close();
		}
	}

	public static void test() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "scott", "tiger");
			stmt = conn.createStatement();
//			select * from 'table1' join 'table2';
			rset = stmt.executeQuery(String.format("select * from actor"));
			System.out.println("2222222");
			while (rset.next()) {
				System.out.println(rset.getString(1));
				System.out.println(rset.getString(2));
				System.out.println(rset.getString(3));
				System.out.println(rset.getString(4));
//				System.out.println(rset.getString(5));
//				System.out.println("MGR: " + rset.getString("MGR"));
//				System.out.println("DEPTNO: " + rset.getString("dEPTNO"));
//				System.out.println("ENAME: " + rset.getString("eNAME"));
//				System.out.println("-----------");
			}

		} finally {
			DBUtil.getClose(rset, stmt, conn);
//			stmt.close();
//			conn.close();
		}
	}

	public static void main(String[] args) {
		try {
			// 모든 부서 검색
//			for (DeptDTO dept : getAllDept()) {
////				System.out.println(dept);
//			}

			// (부서 이름으로) 특정 부서를 검색
//			 getDept(String dname);
//			System.out.println(getDept("SALES"));
//			insertDept(new DeptDTO(50, "Programming", "Busan"));
//			updateDept(new DeptDTO(50, "Programming", "Busaasdasdasn"));
//			updateDept(new DeptDTO(10, "10", "10"));
//			for (DeptDTO dept : getAllDept()) {
//				System.out.println(dept);
//			}
//			joindept("dept", "emp");

//			deleteDept(50);
			test();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}