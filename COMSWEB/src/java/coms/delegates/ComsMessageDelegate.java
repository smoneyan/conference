/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.delegates;

import coms.iface.ComsMessageRemote;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author subu
 */
public class ComsMessageDelegate {
  private ComsMessageRemote comsMessage;

    /** Creates a new instance of FloristDelegate */
    public ComsMessageDelegate() {
        
        comsMessage = lookupComsMessageBean();
    }
  public void notifyEvents()
    {
        
        List<String> rec1=new ArrayList<String>();
        rec1.add("binnyal@gmail.com");
        
    comsMessage.sendJMSMessageToEmailMessage(rec1,"Test Message from coms");
    
    
    }
  private ComsMessageRemote lookupComsMessageBean() {
        try {
            Context c = new InitialContext();
            return (ComsMessageRemote) c.lookup("ComsMessageBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
  
}
