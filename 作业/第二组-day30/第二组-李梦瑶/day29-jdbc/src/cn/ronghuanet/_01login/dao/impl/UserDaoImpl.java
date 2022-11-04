package cn.ronghuanet._01login.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.ronghuanet._00util.JDBCUtil;
import cn.ronghuanet._01login.dao.IUserDao;
import cn.ronghuanet._01login.domain.User;

public class UserDaoImpl implements IUserDao{

	@Override
	public User getUserByNameAndPwd(User u) {
		Connection conn = JDBCUtil.getConn();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conn.createStatement();
			String sql = "select * from t_user where name = '"+u.getName()+"' and pwd = "+u.getPassword()+"";
			rs = st.executeQuery(sql);
			if (rs == null) {
				return null;
			}
			while (rs.next()) {
				long id = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				return new User(id, name, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, conn, st);
		}
		return null;
	}

	@Override
	public User getUserByName(User u) {
		Connection conn = JDBCUtil.getConn();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conn.createStatement();
			String sql = "select * from t_user where name = '"+u.getName()+"'";
			rs = st.executeQuery(sql);
			if (rs == null) {
				return null;
			}
			while (rs.next()) {
				long id = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				return new User(id, name, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, conn, st);
		}
		return null;
	}


	@Override
	public User getUserByPst(User u) {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement("select * from t_user where name = ? and pwd = ?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getPassword());
			rs = ps.executeQuery();
			while (rs.next()) {
				long id = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				return new User(id,name, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, conn, ps);
		}
		return null;
	}

}
