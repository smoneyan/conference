/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.dataaccess.hibernate;

import coms.dataaccess.DAOException;
import coms.dataaccess.ScheduleDAO;
import coms.datatransfer.ScheduleDTO;
import coms.exceptions.HibernateAccessLayerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subu
 */
public class ScheduleDAOImpl extends AbstractDao implements ScheduleDAO {

  @Override
  public ScheduleDTO findSchedule(int scheduleId) throws DAOException {
    try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Finding schedule" + scheduleId);
      ScheduleDTO p = (ScheduleDTO) super.find(ScheduleDTO.class, scheduleId);
      return p;
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }

  @Override
  public ScheduleDTO[] findAllSchedules() throws DAOException {
    try {
      List schedules = super.findAll(ScheduleDTO.class);
      ScheduleDTO[] result = new ScheduleDTO[schedules.size()];
      schedules.toArray(result);
      return (result);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void insertSchedule(ScheduleDTO schedule) throws DAOException {
      try {
      super.saveOrUpdate(schedule);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void updateSchedule(ScheduleDTO schedule) throws DAOException {
     try {
      super.saveOrUpdate(schedule);
    } catch (Throwable t) {
      t.printStackTrace();
      throw new HibernateAccessLayerException(t.toString());
    }
  }

  @Override
  public void deleteSchedule(ScheduleDTO schedule) throws DAOException {
     try {
      Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting schedule" + schedule.getScheduleName());
      super.delete(schedule);
    } catch (Throwable t) {
      throw new HibernateAccessLayerException(t.toString());

    }
  }
}
