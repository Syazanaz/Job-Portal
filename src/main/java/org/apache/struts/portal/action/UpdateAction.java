/**
 * Update Action class: Once invoked lets user edit profile 
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.action;

import java.sql.ResultSet;
import org.apache.struts.portal.dao.Admin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Update Action method
 */
public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private String firstName = "", lastName = "", email = "", company_Name = "", city = "", country = "", emailhidden = "";
	private String msg = "";
	ResultSet rs = null;
	Admin dao = new Admin();
	String submitType;
	
	/**
	 * Validations for First Name, Last Name, Email, Company Name, City and Country. 
	 */
	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = dao.fetchUserDetails(email.trim());
				if (rs != null) {
					while (rs.next()) {
						firstName = rs.getString("FIRSTNAME");
						lastName = rs.getString("LASTNAME");
						email = rs.getString("EMAIL");
						company_Name = rs.getString("COMPANY_NAME");
						city = rs.getString("CITY");
						country = rs.getString("COUNTRY");
					}
				}
			} else {
				int i = dao.updateUserDetails(firstName, lastName, email, company_Name, city, country, emailhidden);
				if (i > 0) {
					msg = "Record Updated Successfuly";
				} else {
					msg = "Error, please try again";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
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
	 * @param company_Name
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
	 * Set City
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
	 * Get Emailhidden
	 * @return
	 */
	public String getEmailhidden() {
		return emailhidden;
	}
	
	/**
	 * Set Emailhidden
	 * @param emailhidden
	 */
	public void setEmailhidden(String emailhidden) {
		this.emailhidden = emailhidden;
	}
	
	/**
	 * Get SubmitType
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
