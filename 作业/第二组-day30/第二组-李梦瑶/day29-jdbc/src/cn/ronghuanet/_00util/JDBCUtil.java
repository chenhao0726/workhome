package cn.ronghuanet._00util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	private static String url;
	private static String username;
	private static String password;
	private static String driver;
	static {
		Properties properties = new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(is);
			driver = properties.getProperty("jdbc.driver");
			username = properties.getProperty("jdbc.username");
			password = properties.getProperty("jdbc.password");
			url = properties.getProperty("jdbc.url");
			Class.forName(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(ResultSet rs,Connection conn,Statement st) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
