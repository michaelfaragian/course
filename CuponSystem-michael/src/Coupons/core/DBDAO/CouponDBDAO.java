package Coupons.core.DBDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
			pstmt.setObject(2, coupon.getCategory());
			pstmt.setString(3, coupon.getTitle());
			pstmt.setString(4, coupon.getDescription());
			pstmt.setObject(5, coupon.getStartDate());
			pstmt.setObject(6, coupon.getEndDate());
			pstmt.setInt(7, coupon.getAmount());
			pstmt.setDouble(8, coupon.getPrice());
			pstmt.setString(9, coupon.getImage());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
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
		String sql ="update coupon set  companyID = ?  category = ?  title = ? description = ?"
				+ "startDate = ?  endDate = ? amount = ? price = ? image =? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, coupon.getCompanyID());
			pstmt.setObject(2, coupon.getCategory());
			pstmt.setString(3, coupon.getTitle());
			pstmt.setString(4, coupon.getDescription());
			pstmt.setObject(5, coupon.getStartDate());
			pstmt.setObject(6, coupon.getEndDate());
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
			while (rs.next()) {
				Coupon coupon = new Coupon();
				coupon.setId(rs.getInt(1));
				coupon.setCompanyID(rs.getInt(2));
				coupon.setCategory((Category) rs.getObject(3));
				coupon.setTitle(rs.getString(4));
				coupon.setDescription(rs.getString(5));
				coupon.setStartDate((LocalDate) rs.getObject(6));
				coupon.setEndDate((LocalDate) rs.getObject(7));
				coupon.setAmount(rs.getInt(8));
				coupon.setPrice(rs.getDouble(9));
				coupon.setImage(rs.getString(10));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//		this.id = id;
//		this.companyID = companyID;
//		this.category = category;
//		this.title = title;
//		this.description = description;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.amount = amount;
//		this.price = price;
//		this.image = image;
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Coupon getOneCoupon(int couponID) throws CouponSystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCouponPurchase(int customerID, int couponID) throws CouponSystemException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCouponPurchase(int customerID, int couponID) throws CouponSystemException {
		// TODO Auto-generated method stub
		
	}

}
