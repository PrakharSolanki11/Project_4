package com.rays.pro4.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.rays.pro4.Bean.CustomerBean;
import com.rays.pro4.Bean.UserBean;
import com.rays.pro4.Exception.ApplicationException;
import com.rays.pro4.Exception.DatabaseException;
import com.rays.pro4.Exception.DuplicateRecordException;
import com.rays.pro4.Util.JDBCDataSource;

public class CustomerModel {

	private static Logger log = Logger.getLogger(CustomerModel.class);

	public Integer nextPk() throws DatabaseException {

		int pk = 0;

		String sql = "SELECT MAX(ID) FROM ST_CUSTOMER";

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new DatabaseException("Exception : Exception in getting PK");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return pk + 1;

	}

	public long add(CustomerBean bean) throws ApplicationException, DuplicateRecordException {

		int pk = 0;

		String sql = "INSERT INTO ST_CUSTOMER VALUES(?,?,?,?,?)";

		Connection conn = null;

		try {
			pk = nextPk();

			conn = JDBCDataSource.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getClientName());
			pstmt.setString(3, bean.getLocation());
			pstmt.setLong(4, bean.getContactNumber());
			pstmt.setString(5, bean.getImportance());

			int i = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return pk;

	}

	public void delete(long pk) throws ApplicationException {

		Connection conn = null;

		String sql = "DELETE FROM ST_CUSTOMER WHERE ID=?";

		try {
			conn.setAutoCommit(false);
			conn = JDBCDataSource.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, pk);

			int i = pstmt.executeUpdate();

			conn.commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				throw new ApplicationException("Exception : Delete rollback exception ");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}

		}

	}

	public CustomerBean findByPk(Long pk) throws ApplicationException {

		CustomerBean bean = null;

		Connection conn = null;

		String sql = "SELECT * FROM ST_CUSTOMER WHERE ID=?";

		try {
			conn = JDBCDataSource.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, pk);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				bean = new CustomerBean();
				bean.setId(rs.getLong(1));
				bean.setClientName(rs.getString(2));
				bean.setLocation(rs.getString(3));
				bean.setContactNumber(rs.getLong(4));
				bean.setImportance(rs.getString(5));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ApplicationException("Exception : Exception in getting Customer by pk");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

		return bean;
	}

	public void update(CustomerBean bean) throws ApplicationException, DatabaseException {

		Connection conn = null;

		String sql = "UPDATE ST_CUSTOMER SET CLIENT_NAME=? , LOCATION=? , CONTACT_NUMBER=? , IMPORTANCE=? WHERE ID=? ";

		try {

			conn.setAutoCommit(false);
			conn = JDBCDataSource.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bean.getClientName());
			pstmt.setString(2, bean.getLocation());
			pstmt.setLong(3, bean.getContactNumber());
			pstmt.setString(4, bean.getImportance());
			pstmt.setLong(5, bean.getId());

			pstmt.executeUpdate();

			conn.commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new ApplicationException("Exception : update rollback exception " + e1.getMessage());
			}
			throw new ApplicationException("Exception in updating User ");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

	}

	public List search(CustomerBean bean , int pageNo , int pageSize ) throws ApplicationException {

		StringBuffer sql = new StringBuffer("SELECT * FROM ST_CUSTOMER WHERE 1=1 ");

		if (bean != null) {

			if (bean.getClientName() != null && bean.getClientName().length() > 0) {
				sql.append(" AND CLIENT_NAME LIKE '" + bean.getClientName() + "%'");
			}

			if (bean.getLocation() != null && bean.getLocation().length() > 0) {
				sql.append(" AND LOCATION LIKE '" + bean.getLocation() + "%'");
			}

			if (bean.getContactNumber() != 0 && bean.getContactNumber() > 0) {
				sql.append(" AND CONTACT_NUMBER = " + bean.getContactNumber() + " ");
			}

			if (bean.getImportance() != null && bean.getImportance().length() > 0) {
				sql.append(" AND IMPORTANCE LIKE '" + bean.getImportance() + "%'");
			}
		}
		
		if(pageSize > 0 ) {
			
			pageNo = (pageNo - 1)* pageSize;
			
			sql.append(" LIMIT " + pageNo + "," + pageSize );
			
		}
		
		List list = new ArrayList();
		
		Connection conn = null;
		
		try {
			conn = JDBCDataSource.getConnection(); 
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery(); 
			
			while(rs.next()) {
			      bean = new CustomerBean();
			      
			      bean.setId(rs.getLong(1));
			      bean.setClientName(rs.getString(2));
			      bean.setLocation(rs.getString(3));
			      bean.setContactNumber(rs.getLong(4));
			      bean.setImportance(rs.getString(5));
			      
			      list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCDataSource.closeConnection(conn);
		}

		return list;

	}

}