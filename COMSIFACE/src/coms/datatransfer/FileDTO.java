/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

/**
 *
 * @author subu
 */
public class FileDTO {
  private int fid;
  private UserDTO user;
  private String uri,filemime, filename;
  private int timestamp;  

  public FileDTO(int fid, UserDTO user, String uri, String filemime, String filename, int timestamp) {
    this.fid = fid;
    this.user = user;
    this.uri = uri;
    this.filemime = filemime;
    this.filename = filename;
    this.timestamp = timestamp;
  }



  public FileDTO() {
  }

  public int getFid() {
    return fid;
  }

  public void setFid(int fid) {
    this.fid = fid;
  }

  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getFilemime() {
    return filemime;
  }

  public void setFilemime(String filemime) {
    this.filemime = filemime;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public int getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(int timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "FileDTO{" + "fid=" + fid + ", user=" + user + ", uri=" + uri + ", filemime=" + filemime + ", filename=" + filename + ", timestamp=" + timestamp + '}';
  }

 
  
}
