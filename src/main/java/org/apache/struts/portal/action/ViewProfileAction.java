/**
 * View Profile Action class: Once invoked calls upon the view profile page.
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.portal.dao.Admin;
import java.sql.ResultSet;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

/**
 * View Profile method
 */
public class ViewProfileAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private static final String VIEWPROFILE = "VIEWPROFILE";

	private Map<String, Object> sessionMap;
	private String firstName, lastName, email, company_Name, city, country;
	private ResultSet rs = null;
	private Admin admin = new Admin();

	@Override
	public String execute() throws Exception {
		try {
			System.out.println(sessionMap);
			//String semail = (String) sessionMap.get(Admin.sessionMap);
			HttpSession session = ServletActionContext.getRequest().getSession(true);
			String semail = (String) session.getAttribute("email");
			System.out.println(semail);
			rs = admin.viewProfile(semail);
			if (rs != null) {
				if (rs.next()) {
					setFirstName(rs.getString("FIRSTNAME"));
					setLastName(rs.getString("LASTNAME"));
					setEmail(rs.getString("EMAIL"));
					setCompany_Name(rs.getString("COMPANY_NAME"));
					setCity(rs.getString("CITY"));
					setCountry(rs.getString("COUNTRY"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return VIEWPROFILE;
	}
	
	/**
	 * Get First Name
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Set First Name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Get Last Name
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Set Last Name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * Get Company Name
	 * @return
	 */
	public String getCompany_Name() {
		return company_Name;
	}
	
	/**
	 * Set Company Name
	 * @param companyName
	 */
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	
	/**
	 * Get City
	 * @return
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * City
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Get Country
	 * @return
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Set Country
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Set Session
	 */
	public void setSession(Map<String, Object> map) {
		sessionMap = map;
		
	}
}