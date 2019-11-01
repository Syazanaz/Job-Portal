/**
 * Register Action class: Once invoked calls upon the register page. 
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.action;

import org.apache.struts.portal.bean.Person;
import org.apache.struts.portal.dao.Admin;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Register Action method
 */
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340125L;
	private int person_id;
	private int type = 1;
	private String firstname, lastname, email, password, company_name, city, country;
	private Person personBean;
	private String msg = "";
	Admin admin = null;
	int ctr = 0;

	/**
	 * Validations for registration. If not complete, error message will be shown. Once registration is
	 * successful, registration confirmation page is shown.
	 */
	
	@Override
	public String execute() throws Exception {
		admin = new Admin();

		try {
			ctr = admin.registerUser(person_id, firstname, lastname, email, password, company_name, city, country, type);
			if (ctr > 0) {
				msg = "Registration Successful!";
			} else {
				msg = "An error occured. Please try again.";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/**
	 * Get Person Bean
	 * @return
	 */
	public Person getPersonBean() {
        return personBean;
    }
	
    /**
     * Set Person Bean
     * @param person
     */
    public void setPersonBean(Person person) {
        personBean = person;
    }
    
	/**
	 * Get Person_id
	 * @return
	 */
	public int getPerson_id() {
		return person_id;
	}
	
	/**
	 * Set Person_id
	 * @param person_id
	 */
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	/**
	 * Get First Name
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}
	
	
	/**
	 * Set First Name
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	 * Get Last Name
	 * @return
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * Set Last Name
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	 * Get Password
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Set Password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Get Company Name
	 * @return
	 */
	public String getCompany_name() {
		return company_name;
	}
	
	/**
	 * Set Company Name
	 * @param company_name
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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
	
	/**
	 * Get Type
	 * @return
	 */
	public int getType() {
		return type;
	}
	
	/**
	 * Set Type
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	
	/**
	 * Validations for First Name, Email, Password, Company Name, City and Country. These fields are
	 * mandatory. If not entered, error message will be shown.
	 */
	public void validate(){
	    if (getFirstname().length() == 0) {
	        addFieldError("firstname", "First Name is required.");
	    }

	    if (getEmail().length() == 0) {
	        addFieldError("email", "Email is required.");
	    }

	    if (getPassword().length() != 8 && getPassword().length() == 0 ) {
	        addFieldError("password", "Password is required and must be 8 characters");
	    }
	    
	    if (getCompany_name().length() == 0) {
	        addFieldError("company_name", "Company Name is required.");
	    }
	    
	    if (getCity().length() == 0) {
	        addFieldError("city", "City is required.");
	    }
	    
	    if (getCountry().length() == 0) {
	        addFieldError("country", "Country is required.");
	    }
	}
}	
		