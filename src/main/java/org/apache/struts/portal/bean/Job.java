package org.apache.struts.portal.bean;

/**
 * Job Java Bean Class
 * 
 * @author Syazana
 *
 */

public class Job {
	
	// generate getter and setters
	 private String jobTitle;
	 private String companyName;
	 private String salary;
	 private String jobDescription;
	 
	 private int jobID;

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
	 
}
