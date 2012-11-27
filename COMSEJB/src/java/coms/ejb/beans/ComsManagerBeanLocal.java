/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans;

import coms.datatransfer.ConferenceDTO;
import coms.datatransfer.UserDTO;
import javax.ejb.Local;

/**
 *
 * @author subu
 */
@Local
public interface ComsManagerBeanLocal {
 public java.util.List<UserDTO> getAllConference();
  
  
}
