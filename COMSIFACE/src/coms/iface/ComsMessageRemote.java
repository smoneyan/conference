/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.iface;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ALPHY
 */
@Remote
public interface ComsMessageRemote {
    public void sendJMSMessageToEmailMessage(List<String> recipients,String messageData) ;
}
