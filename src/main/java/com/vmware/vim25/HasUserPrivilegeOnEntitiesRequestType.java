package com.vmware.vim25;

import com.vmware.vim25.HasUserPrivilegeOnEntitiesRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasUserPrivilegeOnEntitiesRequestType", propOrder = {"_this", "entities", "userName", "privId"})
public class HasUserPrivilegeOnEntitiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> entities;
  
  @XmlElement(required = true)
  protected String userName;
  
  protected List<String> privId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getEntities() {
    if (this.entities == null)
      this.entities = new ArrayList<>(); 
    return this.entities;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public List<String> getPrivId() {
    if (this.privId == null)
      this.privId = new ArrayList<>(); 
    return this.privId;
  }
}
