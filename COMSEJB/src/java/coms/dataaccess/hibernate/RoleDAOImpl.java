/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.RoleDAO;
import coms.datatransfer.RoleDTO;
import coms.datatransfer.UserDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class RoleDAOImpl extends AbstractDao implements RoleDAO {

  @Override
  public RoleDTO[] findAllRole() throws DAOException {
    try {
      List roles = super.findAll(RoleDTO.class);
      RoleDTO[] result = new RoleDTO[roles.size()];
      roles.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public RoleDTO findRole(String roleName) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding User" + roleName);
      RoleDTO p = (RoleDTO) super.find(RoleDTO.class, roleName);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public void insertRole(RoleDTO role) throws DAOException {
    try {
      super.saveOrUpdate(role);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateRole(RoleDTO role) throws DAOException {
    try {
      super.saveOrUpdate(role);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteRole(RoleDTO role) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting User" + role.getRoleName());
      super.delete(role);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }
}
