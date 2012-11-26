/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

/**
 *
 * @author subu
 */
public class ScheduleDTO {
  private int scheduleId;
  private String scheduleName;
  private int startTime, endTime;

  public ScheduleDTO() {
  }

  public ScheduleDTO(int scheduleId, String scheduleName, int startTime, int endTime) {
    this.scheduleId = scheduleId;
    this.scheduleName = scheduleName;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public int getEndTime() {
    return endTime;
  }

  public void setEndTime(int endTime) {
    this.endTime = endTime;
  }
 
  public int getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(int scheduleId) {
    this.scheduleId = scheduleId;
  }

  public String getScheduleName() {
    return scheduleName;
  }

  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }

  @Override
  public String toString() {
    return "ScheduleDTO{" + "scheduleId=" + scheduleId + ", scheduleName=" + scheduleName + ", startTime=" + startTime + ", endTime=" + endTime + '}';
  }        
}