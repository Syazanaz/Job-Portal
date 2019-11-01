/**
 * Delete Action class: Once invoked lets Administrators delete invalid user account.
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.action;

import org.apache.struts.portal.dao.Admin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Delete Action method
 */
public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = -146601914103585418L;
	String email, msg;
	Admin dao = new Admin();

	/**
	 * Validations for deleting record from the database.
	 */
	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteUserDetails(email);
			if (isDeleted > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "There is some error, please try again";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}
	
	/**
	 * Get Email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Set Email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
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