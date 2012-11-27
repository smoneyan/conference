/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.SubmissionDAO;
import coms.datatransfer.SubmissionDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class SubmissionDAOImpl extends AbstractDao implements SubmissionDAO {

  @Override
  public SubmissionDTO findSubmission(int sid) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding Submission" + sid);
      SubmissionDTO p = (SubmissionDTO) super.find(SubmissionDTO.class, sid);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public SubmissionDTO[] findAllSubmission() throws DAOException {
    try {
      List submissions = super.findAll(SubmissionDTO.class);
      SubmissionDTO[] result = new SubmissionDTO[submissions.size()];
      submissions.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void insertFile(SubmissionDTO submission) throws DAOException {
    try {
      super.saveOrUpdate(submission);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateFile(SubmissionDTO submission) throws DAOException {
    try {
      super.saveOrUpdate(submission);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteFile(SubmissionDTO submission) throws DAOException {
    try {
      super.delete(submission);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }
}
