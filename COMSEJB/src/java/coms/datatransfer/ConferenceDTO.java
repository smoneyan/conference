/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author subu
 */
public class ConferenceDTO implements Serializable{
  private int confId;
  private String title,description,location;
  private int confDate, submissionDate, reviewDate, lastUpdatedDate;
  private Set<TopicDTO> topics = new HashSet<TopicDTO>(0);

  public ConferenceDTO(String title, String description, String location, int confDate, int submissionDate, int reviewDate, int lastUpdatedDate, Set<TopicDTO> topics) {
    this.title = title;
    this.description = description;
    this.location = location;
    this.confDate = confDate;
    this.submissionDate = submissionDate;
    this.reviewDate = reviewDate;
    this.lastUpdatedDate = lastUpdatedDate;
    this.topics = topics;
  }

  public ConferenceDTO() {
  }

  /**
   * @return the confId
   */
  public int getConfId() {
    return confId;
  }

  /**
   * @param confId the confId to set
   */
  public void setConfId(int confId) {
    this.confId = confId;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * @param location the location to set
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * @return the confDate
   */
  public int getConfDate() {
    return confDate;
  }

  /**
   * @param confDate the confDate to set
   */
  public void setConfDate(int confDate) {
    this.confDate = confDate;
  }

  /**
   * @return the submissionDate
   */
  public int getSubmissionDate() {
    return submissionDate;
  }

  /**
   * @param submissionDate the submissionDate to set
   */
  public void setSubmissionDate(int submissionDate) {
    this.submissionDate = submissionDate;
  }

  /**
   * @return the reviewDate
   */
  public int getReviewDate() {
    return reviewDate;
  }

  /**
   * @param reviewDate the reviewDate to set
   */
  public void setReviewDate(int reviewDate) {
    this.reviewDate = reviewDate;
  }

  /**
   * @return the lastUpdatedDate
   */
  public int getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * @param lastUpdatedDate the lastUpdatedDate to set
   */
  public void setLastUpdatedDate(int lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  /**
   * @return the topics
   */
  public Set<TopicDTO> getTopics() {
    return topics;
  }

  /**
   * @param topics the topics to set
   */
  public void setTopics(Set<TopicDTO> topics) {
    this.topics = topics;
  }

  @Override
  public String toString() {
    return "ConferenceDTO{" + "confId=" + confId + ", title=" + title + ", description=" + description + ", location=" + location + ", confDate=" + confDate + ", submissionDate=" + submissionDate + ", reviewDate=" + reviewDate + ", lastUpdatedDate=" + lastUpdatedDate + ", topics=" + topics + '}';
  }
 
  
}
