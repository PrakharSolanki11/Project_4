package com.rays.pro4.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.rays.pro4.Exception.ApplicationException;

/**
 * JDBC DataSource is a Data Connection Pool.
 * 
 * @author Prakhar Solanki
 *
 */ 

//MAKE CLASS FINAL SO THAT CHILD CANT BE CREATED.
public final class JDBCDataSource {

	/**
	 * JDBC Database connection pool ( DCP )
	 */
    // MAKE DEFAULT CONSTRUCTOR PRIVATE SO THAT NO ONE OTHER CLASS CAN INSTANTIATE SINGLETONE CLASS.
	private JDBCDataSource() {
	}
    
	// MAKE A PRIVATE STATIC VARIABLE OF SELFTYPE SO THAT WILL HAVE ONLY ONE COPY IN THEIR LIFETIME.
	private static JDBCDataSource datasource ;

	private ComboPooledDataSource cpds = null;

	/**
	 * Create instance of Connection Pool
	 *
	 * @return
	 */ 
	
	// MAKE GETINSTANCE STATIC METHOD SO THAT WILL RETURN INSTANCE OF SAME SINGLETONE CLASS.
	public static JDBCDataSource getInstance() {
		if (datasource == null) {

			ResourceBundle rb = ResourceBundle.getBundle("com.rays.proj4.resourcesB.System");

			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();
			try {
				datasource.cpds.setDriverClass(rb.getString("driver"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			datasource.cpds.setJdbcUrl(rb.getString("url"));
			datasource.cpds.setUser(rb.getString("username"));
			datasource.cpds.setPassword(rb.getString("password"));
			datasource.cpds.setInitialPoolSize(new Integer((String) rb.getString("initialPoolSize")));
			datasource.cpds.setAcquireIncrement(new Integer((String) rb.getString("acquireIncrement")));
			datasource.cpds.setMaxPoolSize(new Integer((String) rb.getString("maxPoolSize")));
			datasource.cpds.setMaxIdleTime(DataUtility.getInt(rb.getString("timeout")));
			datasource.cpds.setMinPoolSize(new Integer((String) rb.getString("minPoolSize")));

		}
		return datasource;
	}

	/**
	 * Gets the connection from ComboPooledDataSource
	 *
	 * @return connection
	 */
	public static Connection getConnection() throws Exception {
		return getInstance().cpds.getConnection();
	}

	/**
	 * Closes a connection
	 *
	 * @param connection
	 * @throws Exception
	 */
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	public static void trnRollback(Connection connection) throws ApplicationException {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				throw new ApplicationException(ex.toString());
			}
		}
	}

}
