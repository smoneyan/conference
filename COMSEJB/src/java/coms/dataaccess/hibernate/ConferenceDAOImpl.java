/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.ConferenceDAO;
import coms.dataaccess.DAOException;
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
public class ConferenceDAOImpl extends AbstractDao implements ConferenceDAO {

  @Override
  public ConferenceDTO[] findAllConference() throws DAOException {
    try {
      List roles = super.findAll(ConferenceDTO.class);
      ConferenceDTO[] result = new ConferenceDTO[roles.size()];
      roles.toArray(result);
      return (result);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public ConferenceDTO findConference(String title) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding conference" + title);
      ConferenceDTO p = (ConferenceDTO) super.find(ConferenceDTO.class, title);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public void insertConference(ConferenceDTO conference) throws DAOException {
     try {
      super.saveOrUpdate(conference);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateConference(ConferenceDTO conference) throws DAOException {
    try {
      super.saveOrUpdate(conference);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteConference(ConferenceDTO conference) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting conference" + conference.getTitle());
      super.delete(conference);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }
}
