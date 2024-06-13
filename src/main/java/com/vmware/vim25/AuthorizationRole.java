package com.vmware.vim25;

import com.vmware.vim25.AuthorizationRole;
import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationRole", propOrder = {"roleId", "system", "name", "info", "privilege"})
public class AuthorizationRole extends DynamicData {
  protected int roleId;
  
  protected boolean system;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected Description info;
  
  protected List<String> privilege;
  
  public int getRoleId() {
    return this.roleId;
  }
  
  public void setRoleId(int paramInt) {
    this.roleId = paramInt;
  }
  
  public boolean isSystem() {
    return this.system;
  }
  
  public void setSystem(boolean paramBoolean) {
    this.system = paramBoolean;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Description getInfo() {
    return this.info;
  }
  
  public void setInfo(Description paramDescription) {
    this.info = paramDescription;
  }
  
  public List<String> getPrivilege() {
    if (this.privilege == null)
      this.privilege = new ArrayList<>(); 
    return this.privilege;
  }
}
