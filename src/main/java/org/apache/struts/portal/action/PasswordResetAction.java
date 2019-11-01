/**
 * Password Reset Action class: Once invoked calls upon the password reset page. 
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Password Reset Action method
 */
public class PasswordResetAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static final String ERROR = "ERROR";
	private static final String RESET = "RESET";
	/**
	 * Variables strings for Reset Email and Reset Message
	 */
	private String resEmail;
	private String resetMessage = "";

	@Override
	public String execute() throws Exception {
		if (resEmail == null || resEmail == "") {
			resetMessage = "Please enter the email address to send your password reset details";
			return ERROR;
		}
		return RESET;
	}
	
	/**
	 * Get Email
	 * @return
	 */
	public String getResEmail() {
		return resEmail;
	}
	
	/**
	 * Set Email
	 * @param resEmail
	 */
	public void setResEmail(String resEmail) {
		this.resEmail = resEmail;
	}
	
	/**
	 * Get Reset Message
	 * @return
	 */
	public String getResetMessage() {
		return resetMessage;
	}
	
	/**
	 * Set Reset Message
	 * @param resetMessage
	 */
	public void setResetMessage(String resetMessage) {
		this.resetMessage = resetMessage;
	}
}

