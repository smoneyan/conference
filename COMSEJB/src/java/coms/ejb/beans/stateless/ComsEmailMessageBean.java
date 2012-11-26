/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans.stateless;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ALPHY
 */
@MessageDriven(mappedName = "jms/emailMessage", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ComsEmailMessageBean implements MessageListener {
    private MessageDrivenContext _context;
    @Resource(name = "mailSession")
 private Session mailSession;
    public ComsEmailMessageBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        MapMessage map = (MapMessage) message;
        
        try {
            // simple forward to E-mail:
           // List<String> recipients=(List<String>) map.getString("recipients");
            String recipient=map.getString("recipients");
            String msgToSend=map.getString("message");
//            for(String recipient:recipients)
//            {
            sendEmail(recipient,
                   msgToSend);
           // }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void sendEmail(String recipient, String text) throws Exception {
        
        try {
            
            //mailSession = (Session) _context.lookup("AdminSession");
            
            javax.mail.Message message = new MimeMessage(mailSession);
            message.setFrom();
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                    InternetAddress.parse(recipient, false));
            
            message.setSubject("Notification");
            message.setText(text);
            
            // sends the email message:
            Transport.send(message);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
