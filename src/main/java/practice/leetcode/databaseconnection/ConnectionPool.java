package practice.leetcode.databaseconnection;

import org.apache.commons.dbcp2.*;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPool {
	private static final String URL = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Apple@123";

	private GenericObjectPool<PoolableConnection> connectionPool = null;

	public DataSource setUp() {
		// Creates a connection factory object which will be use by
		// the pool to create the connection object. We passes the
		// JDBC url info, username and password.
		ConnectionFactory cf = new DriverManagerConnectionFactory(ConnectionPool.URL, ConnectionPool.USERNAME,
				ConnectionPool.PASSWORD);

		// Creates a PoolableConnectionFactory that will wraps the
		// connection object created by the ConnectionFactory to add
		// object pooling functionality.
		PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, null);
		pcf.setValidationQuery("SELECT 1");

		// Creates an instance of GenericObjectPool that holds our
		// pool of connections object.
		GenericObjectPoolConfig<PoolableConnection> config = new GenericObjectPoolConfig<PoolableConnection>();
		config.setTestOnBorrow(true);
		config.setMaxTotal(10);
		connectionPool = new GenericObjectPool<PoolableConnection>(pcf, config);
		pcf.setPool(connectionPool);

		return new PoolingDataSource<PoolableConnection>(connectionPool);
	}

	private GenericObjectPool<PoolableConnection> getConnectionPool() {
		return connectionPool;
	}

	public static void main(String[] args) throws Exception {
		ConnectionPool demo = new ConnectionPool();
		DataSource dataSource = demo.setUp();
		// demo.printStatus();

		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Employee WHERE EmployeeID = '1001'");
			demo.printStatus();

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.printf("FirstName: %2s || LastName: %2s \n", rs.getString("FirstName"),
						rs.getString("LastName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		demo.printStatus();
	}

	/**
	 * Prints connection pool status.
	 */
	private void printStatus() {
		System.out.println("Max   : " + getConnectionPool().getNumActive() + "; " + "Active: "
				+ getConnectionPool().getNumActive() + "; " + "Idle  : " + getConnectionPool().getNumIdle());
	}
}