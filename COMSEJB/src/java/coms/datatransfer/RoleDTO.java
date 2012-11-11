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
public class RoleDTO implements Serializable{
  private Integer rid;
  private String role_name;

  public RoleDTO() {
  }
  

  
  public RoleDTO(String role_name) {
    this.role_name = role_name;
  }

  
  /**
   * @return the rid
   */
  public Integer getRid() {
    return rid;
  }

  /**
   * @param rid the rid to set
   */
  public void setRid(Integer rid) {
    this.rid = rid;
  }

  /**
   * @return the role_name
   */
  public String getRole_name() {
    return role_name;
  }

  /**
   * @param role_name the role_name to set
   */
  public void setRole_name(String role_name) {
    this.role_name = role_name;
  }

  @Override
  public String toString() {
    return "RoleDTO{" + "rid=" + rid + ", role_name=" + role_name + '}';
  }
 
  
  
}
