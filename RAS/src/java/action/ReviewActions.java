/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author fowlerne
 */
public class ReviewActions extends com.opensymphony.xwork2.ActionSupport{
    private String review_text;
    
    public void validate() {
        if (review_text == null || review_text.equals("") || review_text.length() == 0)
            addFieldError("review_text", "The review cannot be blank");
    }
    
    public String execute() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("loggedIn") != null && (boolean)session.getAttribute("loggedIn"))
        {
            return SUCCESS;
        }
        addFieldError("review_text", "You must be logged in to submit a review");
        return INPUT; 
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }
    
}
