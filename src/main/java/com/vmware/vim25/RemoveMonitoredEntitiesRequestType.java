package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveMonitoredEntitiesRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveMonitoredEntitiesRequestType", propOrder = {"_this", "providerId", "entities"})
public class RemoveMonitoredEntitiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String providerId;
  
  protected List<ManagedObjectReference> entities;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getProviderId() {
    return this.providerId;
  }
  
  public void setProviderId(String paramString) {
    this.providerId = paramString;
  }
  
  public List<ManagedObjectReference> getEntities() {
    if (this.entities == null)
      this.entities = new ArrayList<>(); 
    return this.entities;
  }
}
