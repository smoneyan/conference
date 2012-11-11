/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.ConferenceDAO;
import coms.dataaccess.DAOFactory;
import coms.dataaccess.RoleDAO;
import coms.dataaccess.TopicDAO;
import coms.dataaccess.UserDAO;

/**
 *
 * @author subu
 */
public class DAOFactoryImpl extends DAOFactory {

  private UserDAO userDAO = new UserDAOImpl();
  private RoleDAO roleDAO = new RoleDAOImpl();
  private TopicDAO topicDAO = new TopicDAOImpl();
  private ConferenceDAO conferenceDAO = new ConferenceDAOImpl();

  public UserDAO getUserDAO() {
    return userDAO;
  }

  @Override
  public RoleDAO getRoleDAO() {
    return roleDAO;
  }

  @Override
  public TopicDAO getTopicDAO() {
    return topicDAO;
  }

  @Override
  public ConferenceDAO getConferenceDAO() {
    return conferenceDAO;
  }
}
