/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.ConferenceDAO;
import coms.dataaccess.DAOException;
import coms.dataaccess.DAOFactory;
import coms.datatransfer.ConferenceDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class TestClass {
  public static void main(String a[]){
    try {
//      UserDAO userDao = DAOFactory.getInstance().getUserDAO();
//      UserDTO[] users = userDao.findAllUser();
//      for(UserDTO user : users){
//        System.out.println(user);
//      }
//      TopicDAO topicDao = DAOFactory.getInstance().getTopicDAO();
//      TopicDTO[] topics =  topicDao.findAllTopic();
//      for(TopicDTO topic : topics){
//        System.out.println(topic);
//      }
       ConferenceDAO confDao = DAOFactory.getInstance().getConferenceDAO();
       ConferenceDTO[] conf = confDao.findAllConference();
       for(ConferenceDTO c : conf){
         System.out.println(c);
       }
      
     } catch (DAOException ex) {
      Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
