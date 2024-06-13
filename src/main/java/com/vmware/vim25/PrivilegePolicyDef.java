package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PrivilegePolicyDef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegePolicyDef", propOrder = {"createPrivilege", "readPrivilege", "updatePrivilege", "deletePrivilege"})
public class PrivilegePolicyDef extends DynamicData {
  @XmlElement(required = true)
  protected String createPrivilege;
  
  @XmlElement(required = true)
  protected String readPrivilege;
  
  @XmlElement(required = true)
  protected String updatePrivilege;
  
  @XmlElement(required = true)
  protected String deletePrivilege;
  
  public String getCreatePrivilege() {
    return this.createPrivilege;
  }
  
  public void setCreatePrivilege(String paramString) {
    this.createPrivilege = paramString;
  }
  
  public String getReadPrivilege() {
    return this.readPrivilege;
  }
  
  public void setReadPrivilege(String paramString) {
    this.readPrivilege = paramString;
  }
  
  public String getUpdatePrivilege() {
    return this.updatePrivilege;
  }
  
  public void setUpdatePrivilege(String paramString) {
    this.updatePrivilege = paramString;
  }
  
  public String getDeletePrivilege() {
    return this.deletePrivilege;
  }
  
  public void setDeletePrivilege(String paramString) {
    this.deletePrivilege = paramString;
  }
}
