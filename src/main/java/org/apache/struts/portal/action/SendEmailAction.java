package org.apache.struts.portal.action;

import java.util.List;

import javax.servlet.ServletContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.portal.dao.BulkEmailSender;

public class SendEmailAction extends ActionSupport implements ServletContextAware {
	
	private static final long serialVersionUID = 1L;
	
	// email subject
	private String emailSubject;

	// email message
	private String emailBodyText;

	// email to address
	private List<String> emailToAddresses;
	
	// servlet context
	private ServletContext servletContext;
	
	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	
	public String getEmailBodyText() {
		return emailBodyText;
	}
	
	public void setEmailBodyText(String emailBodyText) {
		this.emailBodyText = emailBodyText;
	}
	
	public List<String> getEmailToAddresses() {
		return emailToAddresses;
	}
	
	public void setEmailToAddresses(List<String> emailToAddresses) {
		this.emailToAddresses = emailToAddresses;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	// overridden method when we implement ServletContextAware
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	// action method
	@Override
	public String execute() throws Exception {
		// send the email
		BulkEmailSender.sendBulkEmail(emailToAddresses, emailSubject, emailBodyText);
		
		addActionMessage("Email sent successfully!");
		
		// return to the success page which is the same page here
		return SUCCESS;
	}
	
	// validate method is called before the execute method to validate the input fields
	@Override
	public void validate() {
		
		String i = emailToAddresses.get(0);
		
		if (i.equals("")) {
			String errorMsg = "You must provide To Email Address!";
			addActionError(errorMsg);
		}

		if (emailSubject.length() == 0) {
			String errorMsg = "You must provide Email Subject!";
			addActionError(errorMsg);
		}

		if (emailBodyText.length() == 0) {
			String errorMsg = "You must provide Email Message!";
			addActionError(errorMsg);
		}

	}
}

