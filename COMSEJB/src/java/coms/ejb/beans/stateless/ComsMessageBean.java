/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.ejb.beans.stateless;

import javax.ejb.Stateless;

import coms.ejb.beans.ComsManagerBeanLocal;
import coms.iface.ComsMessageRemote;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
/**
 *
 * @author ALPHY
 */
@Stateless(mappedName="ComsMessageBean")
public class ComsMessageBean implements ComsMessageBeanLocal,ComsMessageRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Resource(mappedName = "jms/emailMessage")
    private Queue emailMessage;
    @Resource(mappedName = "jms/emailFactory")
    private ConnectionFactory emailMessageFactory;

  // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")

    private Message createJMSMessageForjmsEmailMessage(Session session,List<String> recipients, Object messageData) throws JMSException {
        // TODO create and populate message to send
        MapMessage tm = session.createMapMessage();
        tm.setString("message",messageData.toString());
        System.out.println("recipients"+recipients);
        tm.setString("recipients","binnyal@gmail.com");
        return tm;
    }

    @Override
    public void sendJMSMessageToEmailMessage(List<String> recipients,String messageData) {
        Connection connection = null;
        Session session = null;
        try {
            connection = emailMessageFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(emailMessage);
            messageProducer.send(createJMSMessageForjmsEmailMessage(session,recipients, messageData));
        } 
        catch(JMSException ex)
        {}
        finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException ex) {
                    Logger.getLogger(ComsManagerBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }


}
