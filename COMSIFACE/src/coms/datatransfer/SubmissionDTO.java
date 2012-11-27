/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

/**
 *
 * @author subu
 */
public class SubmissionDTO {
  private int submissionId;
  private String email;
  private String title;
  private String description;  
  private UserDTO submittedUser;
  private ScheduleDTO confSchedule;
  private FileDTO file;
  private int blindReview;
  private int status;

  public SubmissionDTO() {
  }

  public SubmissionDTO(int submissionId, String email, String title, String description, UserDTO submittedUser, ScheduleDTO confSchedule, FileDTO file, int blindReview, int status) {
    this.submissionId = submissionId;
    this.email = email;
    this.title = title;
    this.description = description;
    this.submittedUser = submittedUser;
    this.confSchedule = confSchedule;
    this.file = file;
    this.blindReview = blindReview;
    this.status = status;
  }

  public int getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(int submissionId) {
    this.submissionId = submissionId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserDTO getSubmittedUser() {
    return submittedUser;
  }

  public void setSubmittedUser(UserDTO submittedUser) {
    this.submittedUser = submittedUser;
  }

  public ScheduleDTO getConfSchedule() {
    return confSchedule;
  }

  public void setConfSchedule(ScheduleDTO confSchedule) {
    this.confSchedule = confSchedule;
  }

  public FileDTO getFile() {
    return file;
  }

  public void setFile(FileDTO file) {
    this.file = file;
  }

  public int getBlindReview() {
    return blindReview;
  }

  public void setBlindReview(int blindReview) {
    this.blindReview = blindReview;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "SubmissionDTO{" + "submissionId=" + submissionId + ", email=" + email + ", title=" + title + ", description=" + description + ", submittedUser=" + submittedUser + ", confSchedule=" + confSchedule + ", file=" + file + ", blindReview=" + blindReview + ", status=" + status + '}';
  }
  
  
  
 
}
