package action;

import static model.UserPersistence.*;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author sorianpd
 */
public class UserActions extends com.opensymphony.xwork2.ActionSupport {

    
    public void validate() {
        if (user_id == null || user_id.equals("") || user_id.length() == 0)
            addFieldError("user_id", "The Username field cannot be blank");
        if (password == null || password.isEmpty() 
            || password.length() == 0 || password.equals(""))
            addFieldError("password", "The password field cannot be blank");
    }
    
    public String execute() {
        if (validateLogin (user_id, password))
        {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("loggedIn", true);
            if ((boolean) session.getAttribute("loggedIn")) System.out.println ("SUCCESS");
            return SUCCESS;
        }
        addFieldError("password", "Wrong UserName and/or Password");
        return INPUT; 
    }
    
    
    public String getUser_id() {
        return user_id;
    }
        
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    private String user_id; 
    private String password; 
    
    
    
}
