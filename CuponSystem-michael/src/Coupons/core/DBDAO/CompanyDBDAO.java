package Coupons.core.DBDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.ConnectionPool;
import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public class CompanyDBDAO implements CompanyDAO {

	// private ConnectionPool connectionPool = new ConnectionPool();

	@Override
	public boolean isCompanyExists(String email, String Password) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from company where email = ? and password = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, email);
			pstmt.setString(2, Password);
			ResultSet rs = pstmt.executeQuery();
			return rs.next();

		} catch (SQLException e) {
			throw new CouponSystemException("company not exists", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}

	}

	@Override
	public int addCompany(Company company) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "insert into company values (0, ?, ?, ?);";
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			pstmt.setString(1, company.getName());
			pstmt.setString(2, company.getEmail());
			pstmt.setString(3, company.getPassword());
			pstmt.executeUpdate();
			ResultSet rsId = pstmt.getGeneratedKeys();
			rsId.next();
			int id = rsId.getInt(1);
			return id;
		} catch (SQLException e) {
			throw new CouponSystemException("add company failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}

	}

	@Override
	public void updateCompany(Company company) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "update company set name = ? email = ? password= ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, company.getName());
			pstmt.setString(2, company.getEmail());
			pstmt.setString(3, company.getPassword());
			pstmt.setInt(4, company.getId());
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update Company failed - company " + company.getId() + "not found");
			}
		} catch (SQLException e) {

			throw new CouponSystemException("update company failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}

	}

	@Override
	public void deleteCompany(int CompanyID) throws CouponSystemException {

		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from company where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, CompanyID);
		} catch (SQLException e) {
			throw new CouponSystemException("delete company failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public List<Company> getAllCompanies() throws CouponSystemException {

		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from company";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			List<Company> companies = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Company company = new Company();
				company.setId(rs.getInt("id"));
				company.setName(rs.getString("name"));
				company.setEmail(rs.getString("email"));
				company.setPassword(rs.getString("password"));
				companies.add(company);
			}
			return companies;
		} catch (SQLException e) {
			throw new CouponSystemException("getAllCompanies failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public Company getOneCompany(int companyID) throws CouponSystemException {
		Company company = new Company();
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select from company where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, companyID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				company.setId(companyID);
				company.setName(rs.getString("name"));
				company.setEmail(rs.getString("email"));
				company.setPassword(rs.getNString("password"));
			}
			
			return company;
		} catch (SQLException e) {
			throw new CouponSystemException("getOneCompany failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

}
