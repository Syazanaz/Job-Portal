/**
 * Create Job Action Class: Once invoked calls upon the job creation page.
 */
package org.apache.struts.portal.action;

import org.apache.struts.portal.bean.Job;
import org.apache.struts.portal.dao.JobAdmin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Create Job Action Method
 * @author Syazana
 *
 */
public class CreateJobAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340126L;
	private int jobID;
	private String jobTitle, companyName, salary, jobDescription;
	private Job jobBean;
	private String msg = "";
	JobAdmin jobAdmin = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		jobAdmin = new JobAdmin();

		try {
			ctr = jobAdmin.createJob(jobID, jobTitle, companyName, salary, jobDescription);
			if (ctr > 0) {
				msg = "New job posting successful!";
			} else {
				msg = "An error occured. Please try again.";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	/**
	 * Get Job Bean
	 * @return
	 */
	public Job getJobBean() {
		return jobBean;
    }
	
    /**
     * Set Job Bean
     * @param job
     */
    public void setJobBean(Job job) {
        jobBean = job;
    }
    
    /**
     * Get Job ID
     * @return
     */
	public int getJobID() {
		return jobID;
	}
	
	/**
	 * Set Job ID
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
	 * Set Title
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
	 * Get Ctr
	 * @return
	 */
	public int getCtr() {
		return ctr;
	}

	/**
	 * Set Ctr
	 * @param ctr
	 */
	public void setCtr(int ctr) {
		this.ctr = ctr;
	}
}
