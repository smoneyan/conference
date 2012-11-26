/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans;

import coms.datatransfer.ConferenceDTO;
import javax.ejb.Local;

/**
 *
 * @author subu
 */
@Local
public interface ComsManagerBeanLocal {

  java.util.List<ConferenceDTO> getAllConference();
  
}
