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
		ServletRequestAware, SessionAware, Preparable{

    public void setServletRequest(HttpServletRequest hsr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSession(Map<String, Object> map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void prepare() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
