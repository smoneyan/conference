/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.FileDTO;
import coms.datatransfer.UserDTO;

/**
 *
 * @author subu
 */
public interface FileDAO {
    public FileDTO findFile(int fid) throws DAOException;
    public FileDTO[] findAllFile() throws DAOException;
    public void insertFile(FileDTO file) throws DAOException;
    public void updateFile(FileDTO user) throws DAOException;
    public void deleteFile(FileDTO user) throws DAOException;
}
