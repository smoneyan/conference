/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans.stateless;

import coms.dataaccess.ConferenceDAO;
import coms.dataaccess.DAOException;
import coms.dataaccess.DAOFactory;
import coms.datatransfer.ConferenceDTO;
import coms.ejb.beans.ComsManagerBeanLocal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author subu
 */
@Stateless(mappedName="ComsManagerBean")
public class ComsManagerBean implements ComsManagerBeanLocal, Serializable {

  @Override
  public java.util.List<ConferenceDTO> getAllConference() {
    ConferenceDTO[] conf = null;
    try {
      ConferenceDAO confDao = DAOFactory.getInstance().getConferenceDAO();
      conf = confDao.findAllConference();
      return Arrays.asList(conf);
    }
    catch (DAOException ex) {
      Logger.getLogger(ComsManagerBean.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }


  // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")
  
}
