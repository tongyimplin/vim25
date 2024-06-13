package com.vmware.vim25;

import com.vmware.vim25.HostSystemResourceInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateSystemResourcesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemResourcesRequestType", propOrder = {"_this", "resourceInfo"})
public class UpdateSystemResourcesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostSystemResourceInfo resourceInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostSystemResourceInfo getResourceInfo() {
    return this.resourceInfo;
  }
  
  public void setResourceInfo(HostSystemResourceInfo paramHostSystemResourceInfo) {
    this.resourceInfo = paramHostSystemResourceInfo;
  }
}
