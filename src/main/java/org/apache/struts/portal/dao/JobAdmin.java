package org.apache.struts.portal.dao;

/**
 * JobAdmin Java class: connects to the database to store and retrieve information for Job related features and pages.
 * 
 * @author Syazana
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JobAdmin Method
 */
public class JobAdmin {
//public static final String sessionMap = "jobID";	
	// method for create connection
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/community_portal?useTimezone=true&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
/**
 * Create Job
 * @param jobID
 * @param jobTitle
 * @param companyName
 * @param salary
 * @param jobDescription
 * @return
 * @throws Exception
 */
	// method for save job data in database
	public int createJob(int jobID, String jobTitle, String companyName, String salary, String jobDescription) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO JOB VALUES (?,?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, jobID);
			ps.setString(2, jobTitle);
			ps.setString(3, companyName);
			ps.setString(4, salary);
			ps.setString(5, jobDescription);
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
 * View Job Report
 * @return
 * @throws SQLException
 * @throws Exception
 */
	// method for fetch saved job data
	public ResultSet jobReport() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT JOBTITLE,COMPANYNAME,SALARY,JOBDESCRIPTION FROM JOB";
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
 * Fetch Job Details
 * @param jobID
 * @return
 * @throws SQLException
 * @throws Exception
 */
	// method for fetch old job data to be update
	public ResultSet fetchJobDetails(int jobID) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT JOBTITLE,COMPANYNAME,SALARY,JOBDESCRIPTION FROM JOB WHERE JOBID=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, jobID);
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
 * Update Job Data
 * @param jobTitle
 * @param companyName
 * @param salary
 * @param jobDescription
 * @return
 * @throws SQLException
 * @throws Exception
 */
	// method for update new job data in database
	public int updateJobDetails(String jobTitle, String companyName, String salary, String jobDescription)
			throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE JOB SET jobTitle=?,companyName=?,salary=?,jobDescription=? WHERE jobID=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, jobTitle);
			ps.setString(2, companyName);
			ps.setString(3, salary);
			ps.setString(4, jobDescription);
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
 * Delete job record
 * @param jobID
 * @return
 * @throws SQLException
 * @throws Exception
 */
	// method for delete the job record
	public int deleteJobDetails(int jobID) throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "DELETE FROM JOB WHERE JOBID=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, jobID);
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
 * View Job Post
 * @param jobID
 * @return
 * @throws SQLException
 * @throws Exception
 */
	public ResultSet viewJobPost(int jobID) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT JOBTITLE,COMPANYNAME,SALARY,JOBDESCRIPTION FROM JOB WHERE JOBID=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, jobID);
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
