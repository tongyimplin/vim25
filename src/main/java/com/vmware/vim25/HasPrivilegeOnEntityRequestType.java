package com.vmware.vim25;

import com.vmware.vim25.HasPrivilegeOnEntityRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasPrivilegeOnEntityRequestType", propOrder = {"_this", "entity", "sessionId", "privId"})
public class HasPrivilegeOnEntityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected String sessionId;
  
  protected List<String> privId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getSessionId() {
    return this.sessionId;
  }
  
  public void setSessionId(String paramString) {
    this.sessionId = paramString;
  }
  
  public List<String> getPrivId() {
    if (this.privId == null)
      this.privId = new ArrayList<>(); 
    return this.privId;
  }
}
