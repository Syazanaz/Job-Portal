/**
 * Admin Java class: connects to the database to store and retrieve information for all pages. 
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Admin method
 */
public class Admin {
public static final String sessionMap = "email";
private Connection conn=null;
	
	// method for create connection
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_portal?useTimezone=true&serverTimezone=UTC", "root", "");
			} catch (ClassNotFoundException e) {
				System.out.println("Connection Refusded" + e.getMessage());
			} catch (SQLException e) {
				//TODO Auto-generated catch block
			e.printStackTrace();
			}
	return conn;	
	}//end of getConnect() method
	
	/**
	 * Register User
	 * @param person_id
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param password
	 * @param company_name
	 * @param city
	 * @param country
	 * @param type
	 * @return
	 * @throws Exception
	 */
	// method for save user data in database (Registration)
	public int registerUser(int person_id, String firstname, String lastname, String email, String password, String company_name, String city, String country, int type) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO PERSON VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, person_id);
			ps.setString(2, firstname);
			ps.setString(3, lastname);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setString(6, company_name);
			ps.setString(7, city);
			ps.setString(8, country);
			ps.setInt(9, type);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	/**
	 * View report
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	// method for fetch saved user data (Listing for Administrators)
	public ResultSet report() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT FIRSTNAME,LASTNAME,EMAIL,PASSWORD,COMPANY_NAME,CITY,COUNTRY FROM PERSON WHERE TYPE=1";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	/**
	 * Fetch User Details
	 * @param email
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	// method for fetch old data to be update (update profile page for update)
	public ResultSet fetchUserDetails(String email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT FIRSTNAME,LASTNAME,EMAIL,COMPANY_NAME,CITY,COUNTRY FROM PERSON WHERE EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	/**
	 * Update profile
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param company_Name
	 * @param city
	 * @param country
	 * @param emailhidden
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	// method for update new data in database (update profile)
	public int updateUserDetails(String firstName, String lastName, String email, String company_Name, String city, String country, String emailhidden)
			throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE PERSON SET FIRSTNAME=?,LASTNAME=?,EMAIL=?,COMPANY_NAME=?,CITY=?,COUNTRY=? WHERE EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			ps.setString(4, company_Name);
			ps.setString(5, city);
			ps.setString(6, country);
			ps.setString(7, emailhidden);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	/**
	 * Delete record
	 * @param email
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	// method for delete the record
	public int deleteUserDetails(String email) throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "DELETE FROM PERSON WHERE EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, email);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	/**
	 * Search profile
	 * @param searchTerm
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	// method for Search Profile
	public ResultSet searchProfile(String searchTerm) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT FirstName, LastName, City, Country, Company_Name "
					+ "FROM person "
					+ "WHERE FirstName LIKE '%" + searchTerm + "%' OR LastName LIKE '%" + searchTerm
					+ "%' OR City LIKE '%" + searchTerm + "%' OR Country LIKE '%" + searchTerm
					+ "%' OR Company_Name LIKE '%" + searchTerm + "%';";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	/**
	 * View profile
	 * @param email
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public ResultSet viewProfile(String email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT FIRSTNAME,LASTNAME,EMAIL,COMPANY_NAME,CITY,COUNTRY FROM PERSON WHERE EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	} 
}	
	
	 