package action;

import static model.UserPersistence.*;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author bittnemk
 */
public class VehicleInfoActions extends com.opensymphony.xwork2.ActionSupport{
    private String carMake;
    private String carModel;
    private String carColor;
    private String carLicense;
    
    public void validate() {
        if (carMake == null || carMake.equals("") || carMake.length() == 0)
            addFieldError("carMake", "The Car Make field cannot be blank");
        if (carModel == null || carModel.isEmpty() 
            || carModel.length() == 0 || carModel.equals(""))
            addFieldError("carModel", "The Car Model field cannot be blank");
        if (carColor == null || carColor.equals("") || carColor.length() == 0)
            addFieldError("carColor", "The Car Color field cannot be blank");
        if (carModel == null || carModel.isEmpty() 
            || carLicense.length() == 0 || carLicense.equals(""))
            addFieldError("carLicense", "The Car License field cannot be blank");
    }
    
    public String execute() {
        return SUCCESS;
    }
}
