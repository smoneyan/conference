/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.UserDAO;
import coms.datatransfer.UserDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class UserDAOImpl extends AbstractDao implements UserDAO {

  @Override
  public UserDTO findUser(String userName) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding User" + userName);
      UserDTO p = (UserDTO) super.find(UserDTO.class, userName);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public UserDTO[] findAllUser() throws DAOException {
    try {

      List users = super.findAll(UserDTO.class);
      UserDTO[] result = new UserDTO[users.size()];
      users.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void insertUser(UserDTO user) throws DAOException {
    try {
      super.saveOrUpdate(user);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateUser(UserDTO user) throws DAOException {
    try {
      super.saveOrUpdate(user);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteUser(UserDTO user) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting User" + user.getUsername());
      super.delete(user);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }
}
