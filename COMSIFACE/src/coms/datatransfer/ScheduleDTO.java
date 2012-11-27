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
  private double price;
  private int startTime, endTime;
  private ConferenceDTO conference;
  private ItemTypeDTO itemType;

  public ScheduleDTO() {
  }

  public ScheduleDTO(int scheduleId, String scheduleName, double price, int startTime, int endTime, ConferenceDTO conference, ItemTypeDTO itemType) {
    this.scheduleId = scheduleId;
    this.scheduleName = scheduleName;
    this.price = price;
    this.startTime = startTime;
    this.endTime = endTime;
    this.conference = conference;
    this.itemType = itemType;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
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

  public ConferenceDTO getConference() {
    return conference;
  }

  public void setConference(ConferenceDTO conference) {
    this.conference = conference;
  }

  public ItemTypeDTO getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeDTO itemType) {
    this.itemType = itemType;
  }

  @Override
  public String toString() {
    return "ScheduleDTO{" + "scheduleId=" + scheduleId + ", scheduleName=" + scheduleName + ", price=" + price + ", startTime=" + startTime + ", endTime=" + endTime + ", conference=" + conference + ", itemType=" + itemType + '}';
  }

       
}
