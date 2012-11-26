/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.locator;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ALPHY
 */
public class EJBLocator {
    
    private InitialContext initCtx=null;
    private static EJBLocator locator=null;
    static {locator=new EJBLocator();}
    private EJBLocator()
    {
        try {
            initCtx=new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(EJBLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static EJBLocator getInstance(){return locator;}
    
//    public ComsManagerBeanLocal lookupComsManagerBean(){
//      try{
//        return (ComsManagerBeanLocal) initCtx.lookup("Bean30");
//      }catch(NamingException ne){
//        System.out.print("cannot find the context");
//        ne.printStackTrace();
//      }
//    return null;
//    }

    
}
