/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.FileDAO;
import coms.datatransfer.FileDTO;
import coms.datatransfer.UserDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class FileDAOImpl extends AbstractDao implements FileDAO {

  @Override
  public FileDTO findFile(int fid) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding file" + fid);
      FileDTO p = (FileDTO) super.find(FileDTO.class, fid);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public FileDTO[] findAllFile() throws DAOException {
     try {
      List files = super.findAll(FileDTO.class);
      FileDTO[] result = new FileDTO[files.size()];
      files.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void insertFile(FileDTO file) throws DAOException {
    try {
      super.saveOrUpdate(file);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateFile(FileDTO file) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Updating file" + file.getFid());
      super.saveOrUpdate(file);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public void deleteFile(FileDTO file) throws DAOException {
      try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting file" + file.getFid());
      super.delete(file);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

 
}
