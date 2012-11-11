/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.TopicDTO;

/**
 *
 * @author subu
 */
public interface TopicDAO {

  public TopicDTO[] findAllTopic() throws DAOException;

  public TopicDTO findTopic(String title) throws DAOException;

  public void insertTopic(TopicDTO topic) throws DAOException;

  public void updateTopic(TopicDTO topic) throws DAOException;

  public void deleteTopic(TopicDTO topic) throws DAOException;
}
