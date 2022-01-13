package Coupons.core.DBDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Coupons.core.DAO.ConnectionPool;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.exception.CouponSystemException;

public class CouponDBDAO implements CouponDAO{

	@Override
	public int addCoupon(Coupon coupon) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "insert into coupon values (0, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);){
			pstmt.setInt(1, coupon.getCompanyID());
			pstmt.setString(2, coupon.getCategory().toString());
			pstmt.setString(3, coupon.getTitle());
			pstmt.setString(4, coupon.getDescription());
			pstmt.setDate(5, Date.valueOf(coupon.getStartDate()));
			pstmt.setDate(6, Date.valueOf(coupon.getEndDate()));
			pstmt.setInt(7, coupon.getAmount());
			pstmt.setDouble(8, coupon.getPrice());
			pstmt.setString(9, coupon.getImage());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			int id = rs.getInt(1);
			return id;
		} catch (SQLException e) {
			throw new CouponSystemException("add coupon failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
		

		
	}

	@Override
	public void updateCoupon(Coupon coupon) throws CouponSystemException {

		Connection con = ConnectionPool.getInstance().getConnection();
		String sql ="update coupon set  companyID = ?,  category = ?,  title = ?, description = ?,"
				+ "startDate = ?,  endDate = ?, amount = ?, price = ?, image =? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, coupon.getCompanyID());
			pstmt.setString(2, coupon.getCategory().toString());
			pstmt.setString(3, coupon.getTitle());
			pstmt.setString(4, coupon.getDescription());
			pstmt.setDate(5, Date.valueOf(coupon.getStartDate()));
			pstmt.setDate(6, Date.valueOf(coupon.getEndDate()));
			pstmt.setInt(7, coupon.getAmount());
			pstmt.setDouble(8, coupon.getPrice());
			pstmt.setString(9, coupon.getImage());
			pstmt.setInt(10, coupon.getId());
			int rowCount= pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update coupon failed - coupon " + coupon.getId() + "not found");
			}
		} catch (SQLException e) {
			throw new CouponSystemException("update coupon failed", e);
			
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public void deleteCoupon(int couponID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from coupon where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, couponID);
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update Company failed - company " + couponID + " not found");
			}
		} catch (SQLException e) {
			throw new CouponSystemException("delete coupon failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public List<Coupon> getAllCoupons() throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql ="select * from coupon";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			List<Coupon> coupons = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();
			if(rs.next() == false) {
				throw new CouponSystemException("not exist any coupon");
			}
			while (rs.next()) {
				Coupon coupon = new Coupon();
				coupon.setId(rs.getInt(1));
				coupon.setCompanyID(rs.getInt(2));
				coupon.setCategory(Category.valueOf(rs.getString(3)));
				coupon.setTitle(rs.getString(4));
				coupon.setDescription(rs.getString(5));
				coupon.setStartDate(rs.getDate(6).toLocalDate());
				coupon.setEndDate(rs.getDate(7).toLocalDate());
				coupon.setAmount(rs.getInt(8));
				coupon.setPrice(rs.getDouble(9));
				coupon.setImage(rs.getString(10));
				coupons.add(coupon);
				
				
			}
			return coupons;
		} catch (SQLException e) {
			throw new CouponSystemException("get all coupons failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
		
	}

	@Override
	public Coupon getOneCoupon(int couponID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from coupon where id = ?";
		Coupon coupon = new Coupon();
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, couponID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				coupon.setId(couponID);
				coupon.setCompanyID(rs.getInt(2));
				coupon.setCategory(Category.valueOf(rs.getString(3)));
				coupon.setTitle(rs.getString(4));
				coupon.setDescription(rs.getString(5));
				coupon.setStartDate(rs.getDate(6).toLocalDate());
				coupon.setEndDate(rs.getDate(7).toLocalDate());
				coupon.setAmount(rs.getInt(8));
				coupon.setPrice(rs.getFloat(9));
				coupon.setImage(rs.getString(10));
			}else {
				throw new CouponSystemException("the comapny " + couponID + " not exist");
			}
			return coupon;
		} catch (SQLException e) {
			throw new CouponSystemException("get one coupon failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public void addCouponPurchase(int customerID, int couponID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "insert into customer_coupon values (?, ?) ";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, customerID);
			pstmt.setInt(2, couponID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new CouponSystemException("add Coupon Purchase failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
	}

	@Override
	public void deleteCouponPurchase(int customerID, int couponID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from customer_coupon where customer_id = ? and coupon_id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, customerID);
			pstmt.setInt(2, couponID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new CouponSystemException("delete Coupon Purchase failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
			
	}

	@Override
	public void deleteCouponPurchaseWithCompanyID(int companyID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from customer_coupon where coupon_id in (select id from coupon where company_id =?) ";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, companyID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new CouponSystemException("delete Coupon Purchase failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
			
	
		
		
	}

	@Override
	public void deleteCouponWithCompanyID(int companyID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from coupon where company_id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, companyID);
			if (pstmt.executeUpdate() == 0) {
				throw new CouponSystemException("delete coupon with company id " + companyID + " not found");
			}
		} catch (SQLException e) {
			throw new CouponSystemException("delete coupon with company id failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
	}

	@Override
	public void deleteCouponPurchaseWithCustomerID(int customerID) throws CouponSystemException {

		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from customer_coupon where coupon_id in (select id from coupon where customer_id =?) ";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, customerID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new CouponSystemException("delete Coupon Purchase failed", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
			
	
		
		
	
		
	}

	@Override
	public void updateCouponWithoutCompanyID(Coupon coupon) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql ="update coupon set  category = ?,  title = ?, description = ?,"
				+ "startDate = ?,  endDate = ?, amount = ?, price = ?, image =? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, coupon.getCategory().toString());
			pstmt.setString(2, coupon.getTitle());
			pstmt.setString(3, coupon.getDescription());
			pstmt.setDate(4, Date.valueOf(coupon.getStartDate()));
			pstmt.setDate(5, Date.valueOf(coupon.getEndDate()));
			pstmt.setInt(6, coupon.getAmount());
			pstmt.setDouble(7, coupon.getPrice());
			pstmt.setString(8, coupon.getImage());
			pstmt.setInt(9, coupon.getId());
			int rowCount= pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new CouponSystemException("update coupon failed - coupon " + coupon.getId() + "not found");
			}
		} catch (SQLException e) {
			throw new CouponSystemException("update coupon failed", e);
			
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public void deleteCouponPurchaseOnlyCouponID(int couponID) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "delete from customer_coupon where coupon_id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, couponID);
			pstmt.executeQuery();
		} catch (SQLException e) {
			throw new CouponSystemException("deleteCouponPurchaseOnlyCouponID", e);
		}finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
		
	}

}
