/**
 * Update Job Action Class: Once invoked lets Admin edit job posting details
 */
package org.apache.struts.portal.action;

import java.sql.ResultSet;
import org.apache.struts.portal.dao.JobAdmin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Update Job Action Method
 * @author Syazana
 *
 */
public class UpdateJobAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620918L;
	private int jobID;
	private String jobTitle = "", companyName = "", salary = "", jobDescription = "";
	private String msg = "";
	ResultSet rs = null;
	JobAdmin dao = new JobAdmin();
	String submitType;

	/**
	 * 	Validations for Job Title, Company Name, Salary, Job Description
	 */
	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = dao.fetchJobDetails(jobID);
				if (rs != null) {
					while (rs.next()) {
						jobTitle = rs.getString("JOBTITLE");
						companyName = rs.getString("COMPANYNAME");
						salary = rs.getString("SALARY");
						jobDescription = rs.getString("JOBDESCRIPTION");
					}
				}
			} else {
				int i = dao.updateJobDetails(jobTitle, companyName, salary, jobDescription);
				if (i > 0) {
					msg = "Job Posting Updated Successfuly";
				} else {
					msg = "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
	}

	/**
	 * Get JobID
	 * @return
	 */
	public int getJobID() {
		return jobID;
	}

	/**
	 * Set JobID
	 * @param jobID
	 */
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	/**
	 * Get Job Title
	 * @return
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Set Job Title
	 * @param jobTitle
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * Get Company Name
	 * @return
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Set Company Name
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Get Salary
	 * @return
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * Set Salary
	 * @param salary
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * Get Job Description
	 * @return
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * Set Job Description
	 * @param jobDescription
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	/**
	 * Get Msg
	 * @return
	 */
	public String getMsg() {
		return msg;
	}
	
	/**
	 * Set Msg
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Get Submit Type
	 * @return
	 */
	public String getSubmitType() {
		return submitType;
	}

	/**
	 * Set SubmitType
	 * @param submitType
	 */
	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}
}