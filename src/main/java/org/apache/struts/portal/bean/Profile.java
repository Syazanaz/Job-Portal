/**
 * Profile Java Bean Class 
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.bean;

/**
 * Profile method: Used for search profile
 */
public class Profile {
	String firstName, lastName, city, country, company_Name;
	
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
}
