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
public class UserDTO implements Serializable{
  private int uid;
  private String username, password, email, workAddress, contactAddress, blog, website;
  private Long  telephone, mobile;
  private RoleDTO userRole;

  public UserDTO() {
  }
  
  
  public UserDTO(String username, String password, String email, String workAddress, String contactAddress, String blog, String website, Long telephone, Long mobile, RoleDTO userRole) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.workAddress = workAddress;
    this.contactAddress = contactAddress;
    this.blog = blog;
    this.website = website;
    this.telephone = telephone;
    this.mobile = mobile;
    this.userRole = userRole;
  }

  
  
  /**
   * @return the uid
   */
  public int getUid() {
    return uid;
  }

  /**
   * @param uid the uid to set
   */
  public void setUid(int uid) {
    this.uid = uid;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the workAddress
   */
  public String getWorkAddress() {
    return workAddress;
  }

  /**
   * @param workAddress the workAddress to set
   */
  public void setWorkAddress(String workAddress) {
    this.workAddress = workAddress;
  }

  /**
   * @return the contactAddress
   */
  public String getContactAddress() {
    return contactAddress;
  }

  /**
   * @param contactAddress the contactAddress to set
   */
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  /**
   * @return the blog
   */
  public String getBlog() {
    return blog;
  }

  /**
   * @param blog the blog to set
   */
  public void setBlog(String blog) {
    this.blog = blog;
  }

  /**
   * @return the website
   */
  public String getWebsite() {
    return website;
  }

  /**
   * @param website the website to set
   */
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * @return the telephone
   */
  public Long getTelephone() {
    return telephone;
  }

  /**
   * @param telephone the telephone to set
   */
  public void setTelephone(Long telephone) {
    this.telephone = telephone;
  }

  /**
   * @return the mobile
   */
  public Long getMobile() {
    return mobile;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(Long mobile) {
    this.mobile = mobile;
  }

  /**
   * @return the userRole
   */
  public RoleDTO getUserRole() {
    return userRole;
  }

  /**
   * @param userRole the userRole to set
   */
  public void setUserRole(RoleDTO userRole) {
    this.userRole = userRole;
  }

  @Override
  public String toString() {
    return "UserDTO{" + "uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email + ", workAddress=" + workAddress + ", contactAddress=" + contactAddress + ", blog=" + blog + ", website=" + website + ", telephone=" + telephone + ", mobile=" + mobile + ", userRole=" + userRole + '}';
  }
  
  
  
  
}
