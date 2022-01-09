package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public interface CompanyDAO {

	boolean isCompanyExists(String email, String Password) throws CouponSystemException;

	int addCompany(Company company) throws CouponSystemException;

	void updateCompany(Company company) throws CouponSystemException;

	void deleteCompany(int CompanyID) throws CouponSystemException;

	List<Company> getAllCompanies() throws CouponSystemException;

	Company getOneCompany(int companyID) throws CouponSystemException;

}
