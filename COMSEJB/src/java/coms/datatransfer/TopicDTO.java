/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

import java.io.Serializable;

/**
 *
 * @author subu
 */
public class TopicDTO implements Serializable{
   private Integer topicId;
   private String title;

  public TopicDTO() {
  }

  public TopicDTO(String title) {
    this.title = title;
  }

  /**
   * @return the topicId
   */
  public Integer getTopicId() {
    return topicId;
  }

  /**
   * @param topicId the topicId to set
   */
  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
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

  @Override
  public String toString() {
    return "TopicDTO{" + "topicId=" + topicId + ", title=" + title + '}';
  }

   
  
}
