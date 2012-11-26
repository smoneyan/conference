/*
 * ConfirmAction.java
 *
 * Created on September 27, 2006, 10:29 AM
 */

package coms.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import coms.delegates.ComsManagerDelegate;



/**
 * 
 * @author ISS
 * @version
 */

public class EmailAction extends ComsSupport {


	public String execute() throws Exception {
            System.out.println("inside email");
            ComsManagerDelegate comsDel=new ComsManagerDelegate();
            
            comsDel.notifyEvents();
            return "success";
        }
}