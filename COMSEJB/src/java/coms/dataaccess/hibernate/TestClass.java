/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.DAOFactory;
import coms.dataaccess.UserDAO;
import coms.datatransfer.UserDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class TestClass {
  public static void main(String a[]){
    try {
      UserDAO userDao = DAOFactory.getInstance().getUserDAO();
      UserDTO[] users = userDao.findAllUser();
      for(UserDTO user : users){
        System.out.print(user);
      }
     } catch (DAOException ex) {
      Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
