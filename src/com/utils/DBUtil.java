package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
	private static String username = "root";
	private static String pass = "123456";

	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, pass);
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void closeAll(ResultSet rs, PreparedStatement psta, Connection con) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (psta != null) {
					psta.close();
					psta = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if (con != null) {
						con.close();
						con = null;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}
}
