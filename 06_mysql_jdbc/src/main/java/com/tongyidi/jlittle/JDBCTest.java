package com.tongyidi.jlittle;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCTest {

	public JDBCTest() {
		getCon();
	}

	private Connection conn = null;

	private Connection getCon() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String userName = "root";
		String userpwd = "1314";
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, userName, userpwd);
		} catch (Exception e) {// 不建议此写法，写出具体的异常
			e.printStackTrace();
		}
		return conn;
	}

	public int insert(User user) {
		conn = getCon();
		int i = 0;
		String sql = "insert into user (name,age,salary) values(?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setInt(2, user.getAge());
			pstmt.setBigDecimal(3, user.getSalary());
			i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public  int update(User user) {
		conn = getCon();
	    int i = 0;
	    String sql = "update user set age='" + user.getAge() + "' where Name='" + user.getName() + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return i;
	}
	
	public  Integer getAll() {
		conn = getCon();
	    String sql = "select * from user";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
}
