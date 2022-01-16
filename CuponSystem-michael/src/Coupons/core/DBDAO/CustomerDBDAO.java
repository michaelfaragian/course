package Coupons.core.DBDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Coupons.core.DAO.ConnectionPool;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public class CustomerDBDAO implements CustomerDAO{

	@Override
	public boolean isCustomerExists(String email, String Password) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from customer where email = ? and password = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, email);
			pstmt.setString(2, Password);
			ResultSet rs = pstmt.executeQuery();
			return rs.next();

		} catch (SQLException e) {
			throw new CouponSystemException("Customer not exists", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public int addCustomer(Customer customer) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "insert into customer values (0, ?, ?, ?, ?);";
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			pstmt.setString(1, customer.getFirstName());
			pstmt.setString(2, customer.getLastName());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getPassword());
			pstmt.executeUpdate();
			ResultSet rsId = pstmt.getGeneratedKeys();
			rsId.next();
			int id = rsId.getInt(1);
			return id;
		} catch (SQLException e) {
			throw new CouponSystemException("add customer failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public void updateCustomer(Customer customer) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "update  customer set  `first name` = ?, `last name` = ?, email = ?, password= ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, customer.getFirstName());
			pstmt.setString(2, customer.getLastName());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getPassword());
			pstmt.setInt(5, customer.getId());
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update customer failed - company " + customer.getId() + "not found");
			}
		} catch (SQLException e) {

			throw new CouponSystemException("update customer failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public void deleteCustomer(int CustomerID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from Customer where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, CustomerID);
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update Company failed - company " + CustomerID + " not found");
			}
		} catch (SQLException e) {
			throw new CouponSystemException("delete Customer failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
	}

	@Override
	public List<Customer> getAllCustomers() throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from customer";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			List<Customer> customers = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();
			if (rs.next() == false) {
				throw new CouponSystemException("not exist any customer");
			}
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setFirstName(rs.getString("first name"));
				customer.setLastName(rs.getString("last name"));
				customer.setEmail(rs.getString("email"));
				customer.setPassword(rs.getString("password"));
				customers.add(customer);
			}
			return customers;
		} catch (SQLException e) {
			throw new CouponSystemException("getAllcustomers failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public Customer getOneCustomer(int CustomerID) throws CouponSystemException {
		Customer customer = new Customer();
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from customer where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, CustomerID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				customer.setId(CustomerID);
				customer.setFirstName(rs.getString("first name"));
				customer.setLastName(rs.getString("last name"));
				customer.setEmail(rs.getString("email"));
				customer.setPassword(rs.getNString("password"));
			}else {
				throw new CouponSystemException("the comapny " + CustomerID + " not exist");
			}
			
			return customer;
		} catch (SQLException e) {
			throw new CouponSystemException("getOneCompany failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	
		
		
	}

	@Override
	public boolean isCustomerExistsByEmail(Customer customer) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from customer where email = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setString(1, customer.getEmail());
		ResultSet rs = pstmt.executeQuery();
		return rs.next();
		} catch (SQLException e) {
			throw new CouponSystemException("isCustomerExistsByEmail failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

}
