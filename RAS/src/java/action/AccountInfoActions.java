package action;

import javax.persistence.Basic;
import javax.persistence.Column;
import static model.UserPersistence.*;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;


/**
 *
 * @author bittnemk
 */
public class AccountInfoActions extends com.opensymphony.xwork2.ActionSupport{
    
    private String userId;
    private String password;
    private String reenter_password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReenter_password() {
        return reenter_password;
    }

    public void setReenter_password(String reenter_password) {
        this.reenter_password = reenter_password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String name;
    private String email;
  
    public void validate() {
        if (userId == null || userId.equals("") || userId.length() == 0)
            addFieldError("user_id", "The Username field cannot be blank");
        if (password == null || password.isEmpty() 
            || password.length() == 0 || password.equals(""))
            addFieldError("password", "The password field cannot be blank");
        if (reenter_password == null || reenter_password.isEmpty() 
            || reenter_password.length() == 0 || reenter_password.equals(""))
            addFieldError("reenter_password", "Must Reenter Password");
        else if (!reenter_password.equals(password))
            addFieldError("reenter_password", "Password does not match");
        if (name == null || name.equals("") || name.length() == 0)
            addFieldError("name", "The Name field cannot be blank");
        if (email == null || email.equals("") || email.length() == 0)
            addFieldError("email", "The Email field cannot be blank");
    
    }
    
    public String execute() {
            return SUCCESS;

    }
}
