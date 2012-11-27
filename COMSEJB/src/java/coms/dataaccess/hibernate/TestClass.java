/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.DAOFactory;
import coms.dataaccess.ScheduleDAO;
import coms.datatransfer.ScheduleDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class TestClass {

  public static void main(String a[]) {
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
//      ConferenceDAO confDao = DAOFactory.getInstance().getConferenceDAO();
//      ConferenceDTO[] conf = confDao.findAllConference();
//      for (ConferenceDTO c : conf) {
//        System.out.println(c);
//      }

       ScheduleDAO scheduleDao = DAOFactory.getInstance().getScheduleDAO();
       ScheduleDTO[] sched = scheduleDao.findAllSchedules();
       for(ScheduleDTO s : sched){
         System.out.println(s);
       }

//      ItemTypeDAO itemTypeDao = DAOFactory.getInstance().getItemTypeDAO();
//      ItemTypeDTO[] itemTypes = itemTypeDao.findAllItemTypes();
//      for (ItemTypeDTO s : itemTypes) {
//        System.out.println(s);
//      }

//      FileDAO fileDao = DAOFactory.getInstance().getFileDAO();
//      FileDTO[] files = fileDao.findAllFile();
//      for (FileDTO c : files) {
//        System.out.println(c);
//      }

//        SubmissionDAO submissionDao = DAOFactory.getInstance().getSubmissionDAO();
//      SubmissionDTO[] submissions = submissionDao.findAllSubmission();
//      for (SubmissionDTO c : submissions) {
//        System.out.println(c);
//      }

    } catch (DAOException ex) {
      Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
