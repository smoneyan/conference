/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.ItemTypeDTO;

/**
 *
 * @author subu
 */
public interface ItemTypeDAO {
   public ItemTypeDTO findItemType(String typeName) throws DAOException;
   public ItemTypeDTO[] findAllItemTypes() throws DAOException;
}
