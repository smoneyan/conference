/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author ALPHY
 */
public class ComsSupport extends ActionSupport implements
		ServletRequestAware, SessionAware{
protected HttpServletRequest request;
protected Map<String, Object> session;
    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

  
}
