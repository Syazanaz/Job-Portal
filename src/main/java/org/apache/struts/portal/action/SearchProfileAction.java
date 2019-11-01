/**
 * Search Profile Action class: Once invoked calls upon the search profile page. Search bar found on navigation bar on all pages. 
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.portal.dao.Admin;
import org.apache.struts.portal.bean.Profile;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Search Profile method
 */
public class SearchProfileAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static final String SEARCHPROFILE = "SEARCHPROFILE";
	private static final String HOME = "HOME";

	private String search;
	private ResultSet rs = null;
	private Admin admin = null;
	private List<Profile> persons = null;
	private String message = "";
	
	/**
	 * Users are able to search using first name, last name, city, country and company name. 
	 * Message will be shown if no results are returned in the search. 
	 */
	@Override
	public String execute() throws Exception {
		if (search == null || search == "") {
			return HOME;
		}
		persons = new ArrayList<Profile>();
		try {
			admin = new Admin();
			rs = admin.searchProfile(search);
			if (rs != null) {
				while (rs.next()) {
					Profile person = new Profile();
					person.setFirstName(rs.getString("FirstName"));
					person.setLastName(rs.getString("LastName"));
					person.setCity(rs.getString("City"));
					person.setCountry(rs.getString("Country"));
					person.setCompany_Name(rs.getString("Company_Name"));
					persons.add(person);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (persons.size() == 0) {
			message = "No profiles found";
		}
		return SEARCHPROFILE;
	}
	
	/**
	 * Get Message
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set Message
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Get Search 
	 * @return
	 */
	public String getSearch() {
		return search;
	}
	
	/**
	 * Set Search 
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	
	/**
	 * Get Persons
	 * @return
	 */
	public List<Profile> getPersons() {
		return persons;
	}
	
	/**
	 * Set Persons
	 * @param persons
	 */
	public void setPersons(List<Profile> persons) {
		this.persons = persons;
	}
}

