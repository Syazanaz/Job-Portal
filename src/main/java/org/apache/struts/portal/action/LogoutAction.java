/**
 * Logout Action class: Once invoked calls upon the Logout Page. Redirected to the main page which is the login page. 
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Logout Action method
 */
public class LogoutAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private static final String LOGOUT = "LOGOUT";
	
	private Map<String, Object> sessionMap;
	
	
	@Override
	public String execute() throws Exception {
		sessionMap.clear();
		return LOGOUT;
	}
	
	/**
	 * Set Session
	 */
	public void setSession(Map<String, Object> map) {
		sessionMap = map;
	}
}
