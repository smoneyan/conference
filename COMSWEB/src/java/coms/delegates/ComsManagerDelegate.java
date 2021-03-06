/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.delegates;
import coms.datatransfer.UserDTO;
import coms.iface.ComsManagerRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



/**
 * 
 * @author ISS
 */
public class ComsManagerDelegate {

    
    private ComsManagerRemote comsMgr;

    /** Creates a new instance of FloristDelegate */
    public ComsManagerDelegate() {
        
        comsMgr = lookupComsManagerBean();
    }

    public List<UserDTO> getAllConference()
    {
        System.out.println("get delegate"+comsMgr);
      
        
    return comsMgr.getAllConference();
    
    
    }

    private ComsManagerRemote lookupComsManagerBean() {
        try {
            Context c = new InitialContext();
            return (ComsManagerRemote) c.lookup("ComsManagerBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

