package model.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_DB {
	public static void conn_db(String dname) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(String.format("select * from DEPT where DNAME =\'%s\' ", dname));
//			System.out.println(new DeptDTO(rset.getInt("deptno"),);

		} catch (Exception e) {
		}
	}

}
