package com.dao.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BaseDao {

	private static String url = "jdbc:mysql://localhost:3306/dbsdb?useUnicode=true&characterEncoding=UTF-8";
	private static String username = "root";
	private static String pass = "root";
	
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
	// 闁稿繑濞婂Λ瀛樻交閻愭潙澶�
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
	
	
	public static <T> List<T> query(String sql,Class<T> cla,Object... params) throws Exception{
		System.out.println("query...");
		Connection con = getCon();
		
		PreparedStatement psta = con.prepareStatement(sql);
		for (int i = 0; i < params.length; i++) {
			psta.setObject(i+1, params[i]);
		}
		ResultSet rs = psta.executeQuery();
		

		List<T> list = new ArrayList<T>();
		/*
		 * ResultSetMetaData rsmt=rs.getMetaData();
			得到结果集(rs)的结构，比如字段数、字段名等。
			使用rs.getMetaData().getTableName(1))就可以返回表名
			rs.getMetaData().getColumnCount()
			取得列数
			例子:
			ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");//得到查询结果,一个数据集 
			ResultSetMetaData rsmd = rs.getMetaData(); 
			int numberOfColumns = rsmd.getColumnCount(); //得到数据集的列数
		 */
		ResultSetMetaData md = rs.getMetaData();
		while(rs.next()){
			T t = cla.newInstance();
			for (int i = 0; i < md.getColumnCount(); i++) {
				String colName = md.getColumnName(i+1);
				Object colVal = rs.getObject(colName);
				setProperty(t,colName,colVal);
			}
			list.add(t);
		}
		closeAll(rs,psta, con);
		return list;
	}
	
	public static  int update(String sql,Object... params) throws Exception{
		System.out.println("update...");
		Connection con = getCon();
		PreparedStatement psta = con.prepareStatement(sql);
		int update = 0;
		for (int i = 0; i < params.length; i++) {
			System.out.println(i+"::"+params[i]);
			psta.setObject(i+1, params[i]);
		}
		update = psta.executeUpdate();
		return update;
	}
	
	
	
	
	public static void setProperty(Object obj,String name,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class <?> cla = obj.getClass();
		Field f = cla.getDeclaredField(name);
		f.setAccessible(true);
		f.set(obj, value);
	}
}
