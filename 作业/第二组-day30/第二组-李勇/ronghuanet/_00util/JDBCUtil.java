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
	/** 静态代码块 加载驱动和读取配置文件
	 * 
	 */
	static {
		Properties p = new Properties();
		InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
		try {
			p.load(stream);
			// 获取数据
			url = p.getProperty("jdbc.url");
			username = p.getProperty("jdbc.username");
			password = p.getProperty("jdbc.password");
			driver = p.getProperty("jdbc.driver");
			// 加载驱动
//			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	/**
	 *  获取连接
	 */
	public static Connection getConn() {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 *  释放资源
	 */
	public static void close(ResultSet rs,Statement st,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
