/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOFactory;
import coms.dataaccess.UserDAO;

/**
 *
 * @author subu
 */
public class DAOFactoryImpl extends DAOFactory{
    
    private UserDAO userDAO = new UserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }
    
  
}
