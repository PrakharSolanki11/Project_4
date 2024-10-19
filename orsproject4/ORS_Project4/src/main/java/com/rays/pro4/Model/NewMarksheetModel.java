package com.rays.pro4.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rays.pro4.Bean.NewMarksheetBean;
import com.rays.pro4.Exception.ApplicationException;
import com.rays.pro4.Exception.DatabaseException;
import com.rays.pro4.Exception.DuplicateRecordException;
import com.rays.pro4.Util.JDBCDataSource;

public class NewMarksheetModel {

	public Integer nextPk() throws DatabaseException{ 
		
		Connection conn = null;
		
		int pk = 0; 
		
		try {
			conn = JDBCDataSource.getConnection(); 
			
			String sql ="SELECT MAX(ID) FROM ST_MARKHSEET"; 
			
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			
			ResultSet rs = pstmt.executeQuery(); 
			
			while(rs.next()) {
				pk = rs.getInt(1);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new DatabaseException("Exception in Marksheet getting PK");
		} finally {
			
			JDBCDataSource.closeConnection(conn);
		}
		
		
		
		return pk + 1;
	} 
	
	public long add(NewMarksheetBean bean) throws ApplicationException , DuplicateRecordException{ 
		
	
		
		Connection conn = null; 
		
		
		
		String sql = "INSERT INTO ST_MARKSHEET VALUES(?,?,?,?,?,?,?)"; 
		
		try {
			
			int pk = nextPk();
			
			conn = JDBCDataSource.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			
			pstmt.setInt(1, pk );
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
