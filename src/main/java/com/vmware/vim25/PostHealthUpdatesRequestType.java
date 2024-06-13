package com.vmware.vim25;

import com.vmware.vim25.HealthUpdate;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PostHealthUpdatesRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostHealthUpdatesRequestType", propOrder = {"_this", "providerId", "updates"})
public class PostHealthUpdatesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String providerId;
  
  protected List<HealthUpdate> updates;
  
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
  
  public List<HealthUpdate> getUpdates() {
    if (this.updates == null)
      this.updates = new ArrayList<>(); 
    return this.updates;
  }
}
