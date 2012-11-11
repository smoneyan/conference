/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.RoleDTO;
import coms.datatransfer.UserDTO;

/**
 *
 * @author subu
 */
public interface RoleDAO {

  public RoleDTO[] findAllRole() throws DAOException;

  public RoleDTO findRole(String roleName) throws DAOException;

  public void insertRole(RoleDTO role) throws DAOException;

  public void updateRole(RoleDTO role) throws DAOException;

  public void deleteRole(RoleDTO role) throws DAOException;
}
