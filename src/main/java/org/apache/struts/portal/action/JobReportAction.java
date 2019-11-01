/**
 * View Job Report Action Class: Once invoked calls upon the view job report page.
 */
package org.apache.struts.portal.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts.portal.bean.Job;
import org.apache.struts.portal.dao.JobAdmin;
import com.opensymphony.xwork2.ActionSupport;

public class JobReportAction extends ActionSupport {
	
/**
 * View Job Report Method	
 */
	private static final long serialVersionUID = 6329394260276112661L;
	ResultSet rs = null;
	Job bean = null;
	List<Job> beanList = null;
	JobAdmin admin = new JobAdmin();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<Job>();
			rs = admin.jobReport();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new Job();
					bean.setJobID(i);
					bean.setJobTitle(rs.getString("JOBTITLE"));
					bean.setCompanyName(rs.getString("COMPANYNAME"));
					bean.setSalary(rs.getString("SALARY"));
					bean.setJobDescription(rs.getString("JOBDESCRIPTION"));
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
	
	/**
	 * Boolean is No Data
	 * @return
	 */
	public boolean isNoData() {
		return noData;
	}
	
	/**
	 * Set No Data
	 * @param noData
	 */
	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	/**
	 * Get Bean List
	 * @return
	 */
	public List<Job> getBeanList() {
		return beanList;
	}
	
	/**
	 * Set Bean List
	 * @param beanList
	 */
	public void setBeanList(List<Job> beanList) {
		this.beanList = beanList;
	}
}