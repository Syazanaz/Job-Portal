/**
 * View Report Action class: Once invoked calls upon the view report page.
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts.portal.bean.Person;
import org.apache.struts.portal.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

/**
 * View Report method
 */
public class ReportAction extends ActionSupport {

	private static final long serialVersionUID = 6329394260276112660L;
	ResultSet rs = null;
	Person bean = null;
	List<Person> beanList = null;
	Admin admin = new Admin();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<Person>();
			rs = admin.report();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new Person();
					bean.setSrNo(i);
					bean.setFirstName(rs.getString("FIRSTNAME"));
					bean.setLastName(rs.getString("LASTNAME"));
					bean.setEmail(rs.getString("EMAIL"));
					bean.setPassword(rs.getString("PASSWORD"));
					bean.setCompany_Name(rs.getString("COMPANY_NAME"));
					bean.setCity(rs.getString("CITY"));
					bean.setCountry(rs.getString("COUNTRY"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REPORT";
	}

	public boolean isNoData() {
		return noData;
	}
	
	/**
	 * Set NoData
	 * @param noData
	 */
	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	/**
	 * Get BeanList
	 * @return
	 */
	public List<Person> getBeanList() {
		return beanList;
	}
	
	/**
	 * Set BeanList
	 * @param beanList
	 */
	public void setBeanList(List<Person> beanList) {
		this.beanList = beanList;
	}
}