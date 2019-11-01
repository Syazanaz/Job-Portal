/**
 * Person Java Bean Class 
 * 
 * @author syazana
 *
 */

package org.apache.struts.portal.bean;

/**
 * Person Java Bean method
 */
public class Person {

	// generate getter and setters
		private String firstName, lastName, email, password, company_Name, city, country;
		private int srNo;
		private int type;
		
		/**
		 * Get FirstName
		 * @return
		 */
		public String getFirstName() {
			return firstName;
		}
	
		/**
		 * Set FirstName
		 * @param firstName
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		/**
		 * Get LastName
		 * @return
		 */
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * Set LastName
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
		 * Get SrNo
		 * @return
		 */
		public int getSrNo() {
			return srNo;
		}
		
		/**
		 * Set SrNo
		 * @param srNo
		 */
		public void setSrNo(int srNo) {
			this.srNo = srNo;
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
	        if (type != 1) {
	            type = 2;
	        }
			this.type = type;
		}
		
		 public String toString() {
		        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() +
		        " Email:  " + getEmail() + " Password: " + getPassword() + 
		        " Company Name: " + getCompany_Name() + " City: " + getCity() + " Country: " +getCountry();
		    }
}