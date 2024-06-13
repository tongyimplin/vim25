package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResolveInstallationErrorsOnClusterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveInstallationErrorsOnClusterRequestType", propOrder = {"_this", "filterId", "cluster"})
public class ResolveInstallationErrorsOnClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String filterId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference cluster;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getFilterId() {
    return this.filterId;
  }
  
  public void setFilterId(String paramString) {
    this.filterId = paramString;
  }
  
  public ManagedObjectReference getCluster() {
    return this.cluster;
  }
  
  public void setCluster(ManagedObjectReference paramManagedObjectReference) {
    this.cluster = paramManagedObjectReference;
  }
}
