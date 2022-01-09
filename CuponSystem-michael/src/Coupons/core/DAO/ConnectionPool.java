package Coupons.core.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Coupons.core.exception.CouponSystemException;

/**
 * @author michael a singleton object that is a pool of open connection
 */
public class ConnectionPool {

	public static final int SIZE = 5;
	private boolean open; // by default to false
	private String dburl = "jdbc:mysql://localhost:3306/coupon_system";
	private String user = "root";
	private String password = "1234";
	private Set<Connection> connections = new HashSet<>();

	// singleton step 1 - define the single instance
	private static ConnectionPool instance;

	// singleton step 2 - private CTOR prevents more creations
	private ConnectionPool() throws SQLException {
		// create connections and put in the set
		for (int i = 0; i < SIZE; i++) {
			Connection con = DriverManager.getConnection(dburl, user, password);
			connections.add(con);
		}
		open = true;
	}

	// singleton step 3 - getter for the instance
	public static ConnectionPool getInstance() throws CouponSystemException {
		if (instance == null) {
			try {
				instance = new ConnectionPool();
			} catch (SQLException e) {
				throw new CouponSystemException("connection pool failed to start", e);
			}
		}
		return instance;
	}

	public boolean isOpen() {
		return open;
	}

	public synchronized Connection getConnection() throws CouponSystemException {
		if (!open) {
			throw new CouponSystemException("getConnection failed - pool is close");
		}
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public synchronized void restoreConnection(Connection connection) {
		connections.add(connection);
		notify();
	}

	public synchronized void closeAllConnections() throws CouponSystemException {
		open = false;
		while(connections.size() < SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// if we are here all connections are in pool
			
			for (Connection connection : connections) {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					throw new CouponSystemException("closeAllConnections failed", e);
				
			}
				this.connections.clear(); // 
			}
		}
		
	}

}
