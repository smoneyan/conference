/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.FileDTO;
import coms.datatransfer.SubmissionDTO;

/**
 *
 * @author subu
 */
public interface SubmissionDAO {
    public SubmissionDTO findSubmission(int sid) throws DAOException;
    public SubmissionDTO[] findAllSubmission() throws DAOException;
    public void insertFile(SubmissionDTO submission) throws DAOException;
    public void updateFile(SubmissionDTO submission) throws DAOException;
    public void deleteFile(SubmissionDTO submission) throws DAOException;
}
