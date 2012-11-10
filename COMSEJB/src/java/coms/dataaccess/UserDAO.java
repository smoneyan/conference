/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.UserDTO;

/**
 *
 * @author subu
 */
public interface UserDAO {
    public UserDTO findUser(String userName) throws DAOException;
    public UserDTO[] findAllUser() throws DAOException;
    public void insertUser(UserDTO user) throws DAOException;
    public void updateUser(UserDTO user) throws DAOException;
    public void deleteUser(UserDTO user) throws DAOException;
}
