package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// DB 연결 기능 메소드
	public static Connection getConn() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
		return conn;
	}

	// DB 자원반환(종료) 메소드
	public static void getClose(ResultSet rset, Statement stmt, Connection conn) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}
			if (stmt != null) {

				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
