/**
 * Login Action class: Once invoked calls upon the Login Page
 * 
 * @author syazana
 *
 */
package org.apache.struts.portal.action;

import java.sql.*;
import java.util.Map;
import org.apache.struts.portal.dao.Admin;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Login Action method
 */
public class LoginAction implements SessionAware{
private String email,password,result="invalid_email";
private static int online_user_count=1;
private Connection conn=null;
private Admin dbobj=new Admin();
private SessionMap<String ,Object> sessionMap;

/**
 * Set Session
 */
public void setSession(Map<String, Object> map) {
     sessionMap=(SessionMap<String, Object>) map;
}
//HttpServletRequest request=ServletActionContext.getRequest();
//HttpSession session=request.getSession();
//HttpServletRequest session=(HttpServletRequest) ServletActionContext.getRequest().getSession();

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
 * Validations for Email and Password. They cannot be blank and has to be registered with the user account.   
 * If the email or password cannot be found in the database, error message pops up. 
 * @return
 */
public String loginexecute() {
     conn=dbobj.getConnection();
     System.out.println("In execute of loginAction"+conn);
     String query="select * from person where email=?";
     try {
           PreparedStatement pst = conn.prepareStatement(query);
           pst.setString(1,getEmail());
           ResultSet rs=pst.executeQuery();
           if(rs.next()) {
        	   System.out.println();
                if(rs.getString("password").equals(getPassword()))
                {  
                    sessionMap.put("email",getEmail());
                    sessionMap.put("onlineusers_cout",online_user_count++);
                    int Type = rs.getInt("Type");
                    if (Type == 2) {
                 	   return "Admin";
                    }
                    else {
                 	   return "User";
                    }
                }
                else {
                     result="invalid_password";
                }
           }
           else {
                result="invalid_email";
           }
           
     } catch (SQLException e) {
           System.out.println("Connection failure "+e.getMessage());
     } 
    
     return result;
}//end of loginexecute() method
}//end of class
	
