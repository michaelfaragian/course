package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Company;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public interface CustomerDAO {

	boolean isCustomerExists(String email, String Password) throws CouponSystemException;

	int addCustomer(Customer customer) throws CouponSystemException;

	void updateCustomer(Customer customer) throws CouponSystemException;

	void deleteCustomer(int CustomerID) throws CouponSystemException;

	List<Customer> getAllCustomers() throws CouponSystemException;

	Customer getOneCustomer(int CustomerID) throws CouponSystemException;



}
