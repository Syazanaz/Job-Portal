/**
 * Delete Job Action Class: Once invoked lets Administrator invalid job posting.
 */
package org.apache.struts.portal.action;

import org.apache.struts.portal.dao.JobAdmin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Delete Job Action Method
 * @author Syazana
 *
 */
public class DeleteJobAction extends ActionSupport {

	private static final long serialVersionUID = -146601914103585419L;
	int jobID;
	String msg;
	JobAdmin dao = new JobAdmin();
	
	/**
	 * Validations for deleting job posting record from database
	 */
	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteJobDetails(jobID);
			if (isDeleted > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
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
}
