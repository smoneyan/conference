/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess;

import coms.datatransfer.ScheduleDTO;

/**
 *
 * @author subu
 */
public interface ScheduleDAO {
   public ScheduleDTO findSchedule(int scheduleId) throws DAOException;
    public ScheduleDTO[] findAllSchedules() throws DAOException;
    public void insertSchedule(ScheduleDTO schedule) throws DAOException;
    public void updateSchedule(ScheduleDTO schedule) throws DAOException;
    public void deleteSchedule(ScheduleDTO schedule) throws DAOException;
}
