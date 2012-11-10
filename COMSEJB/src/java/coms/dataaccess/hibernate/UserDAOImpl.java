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

/**
 *
 * @author subu
 */
public class UserDAOImpl extends AbstractDao implements UserDAO{

  @Override
  public UserDTO findUser(String userName) throws DAOException {
    throw new UnsupportedOperationException("Not supported yet.");
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
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateUser(UserDTO user) throws DAOException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void deleteUser(UserDTO user) throws DAOException {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
}
