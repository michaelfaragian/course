package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public interface CompanyDAO {

	boolean isCompanyExists(String email, String Password) throws CouponSystemException;

	boolean isCompanyExistsByNameOrEmail(String name, String email) throws CouponSystemException;

	boolean isCompanyExistsByIdOrName(int id, String name) throws CouponSystemException;

	boolean isCompanyExistsById(int id) throws CouponSystemException;

	int addCompany(Company company) throws CouponSystemException;

	void updateCompany(Company company) throws CouponSystemException;

	void updateCompanyWithoutName(Company company) throws CouponSystemException;

	void deleteCompany(int CompanyID) throws CouponSystemException;

	List<Company> getAllCompanies() throws CouponSystemException;

	Company getOneCompany(int companyID) throws CouponSystemException;

	int getCompanyID(String email, String password) throws CouponSystemException;

	Company getCompanyDetailes(int companyID) throws CouponSystemException;

}
