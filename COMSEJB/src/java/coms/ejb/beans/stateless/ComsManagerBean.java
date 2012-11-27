/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans.stateless;

import coms.dataaccess.DAOException;
import coms.dataaccess.DAOFactory;
import coms.dataaccess.UserDAO;
import coms.datatransfer.ConferenceDTO;
import coms.datatransfer.UserDTO;
import coms.ejb.beans.ComsManagerBeanLocal;
import coms.iface.ComsManagerRemote;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author subu
 */
@Stateless(mappedName="ComsManagerBean")
public class ComsManagerBean implements ComsManagerRemote {

  @Override
  public java.util.List<UserDTO> getAllConference() {
    List<UserDTO> conf = null;
    try {
      System.out.println("getAllConference");
      UserDAO confDao = DAOFactory.getInstance().getUserDAO();
      conf = Arrays.asList(confDao.findAllUser());
      return conf;
    }
    catch (DAOException ex) {
      Logger.getLogger(ComsManagerBean.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }


  // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")

 
  
}
