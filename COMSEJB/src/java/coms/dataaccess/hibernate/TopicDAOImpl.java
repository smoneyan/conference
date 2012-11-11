/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.TopicDAO;
import coms.datatransfer.ConferenceDTO;
import coms.datatransfer.RoleDTO;
import coms.datatransfer.TopicDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class TopicDAOImpl extends AbstractDao implements TopicDAO {

  @Override
  public TopicDTO[] findAllTopic() throws DAOException {
    try {
      List roles = super.findAll(TopicDTO.class);
      TopicDTO[] result = new TopicDTO[roles.size()];
      roles.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public TopicDTO findTopic(String title) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding topic" + title);
      TopicDTO p = (TopicDTO) super.find(TopicDTO.class, title);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }

  }

  @Override
  public void insertTopic(TopicDTO topic) throws DAOException {
     try {
      super.saveOrUpdate(topic);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateTopic(TopicDTO topic) throws DAOException {
    try {
      super.saveOrUpdate(topic);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteTopic(TopicDTO topic) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting topic" + topic.getTitle());
      super.delete(topic);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }
}
