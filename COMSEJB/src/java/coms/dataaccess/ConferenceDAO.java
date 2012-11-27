/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.ConferenceDTO;

/**
 *
 * @author subu
 */
public interface ConferenceDAO {

  public ConferenceDTO[] findAllConference() throws DAOException;

  public ConferenceDTO findConference(String title) throws DAOException;

  public void insertConference(ConferenceDTO conference) throws DAOException;

  public void updateConference(ConferenceDTO conference) throws DAOException;

  public void deleteConference(ConferenceDTO conference) throws DAOException;
}
