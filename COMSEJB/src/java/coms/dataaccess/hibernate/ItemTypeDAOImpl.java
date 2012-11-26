/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.ItemTypeDAO;
import coms.datatransfer.ItemTypeDTO;
import coms.datatransfer.ScheduleDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class ItemTypeDAOImpl extends AbstractDao implements ItemTypeDAO{

  @Override
  public ItemTypeDTO findItemType(String typeName) throws DAOException {
      try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding Item type" + typeName);
      ItemTypeDTO p = (ItemTypeDTO) super.find(ScheduleDTO.class, typeName);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public ItemTypeDTO[] findAllItemTypes() throws DAOException {
     try {
      List itemTypes = super.findAll(ItemTypeDTO.class);
      ItemTypeDTO[] result = new ItemTypeDTO[itemTypes.size()];
      itemTypes.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

 
}
