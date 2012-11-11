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

/**
 *
 * @author subu
 */
public class RoleDAOImpl extends AbstractDao implements RoleDAO{

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

}
