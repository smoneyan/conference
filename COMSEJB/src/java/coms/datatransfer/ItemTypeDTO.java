/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.datatransfer;

/**
 *
 * @author subu
 */
public class ItemTypeDTO {
  private int typeId;
  private String typeName;

  public ItemTypeDTO() {
  }

  public ItemTypeDTO(int typeId, String typeName) {
    this.typeId = typeId;
    this.typeName = typeName;
  }

  public int getTypeId() {
    return typeId;
  }

  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  @Override
  public String toString() {
    return "ItemTypeDTO{" + "typeId=" + typeId + ", typeName=" + typeName + '}';
  }
  
  
  
}
