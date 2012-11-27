/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.iface;

import coms.datatransfer.UserDTO;
import javax.ejb.Remote;

/**
 *
 * @author ALPHY
 */
@Remote
public interface ComsManagerRemote {
   public java.util.List<UserDTO> getAllConference();
}
