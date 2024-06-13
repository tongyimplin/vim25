package com.vmware.vim25;

import com.vmware.vim25.HasPrivilegeOnEntitiesRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasPrivilegeOnEntitiesRequestType", propOrder = {"_this", "entity", "sessionId", "privId"})
public class HasPrivilegeOnEntitiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> entity;
  
  @XmlElement(required = true)
  protected String sessionId;
  
  protected List<String> privId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getEntity() {
    if (this.entity == null)
      this.entity = new ArrayList<>(); 
    return this.entity;
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
