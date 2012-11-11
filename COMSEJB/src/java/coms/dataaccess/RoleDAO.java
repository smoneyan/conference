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

}
