package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public interface CustomerDAO {

	boolean isCustomerExists(String email, String Password) throws CouponSystemException;

	boolean isCustomerExistsByEmail(Customer customer) throws CouponSystemException;

	int addCustomer(Customer customer) throws CouponSystemException;

	void updateCustomer(Customer customer) throws CouponSystemException;

	void deleteCustomer(int CustomerID) throws CouponSystemException;

	List<Customer> getAllCustomers() throws CouponSystemException;

	Customer getOneCustomer(int CustomerID) throws CouponSystemException;

	int getCustomerID(String email, String password) throws CouponSystemException;

	Customer getCustomerDetails(int customerID) throws CouponSystemException;

}
