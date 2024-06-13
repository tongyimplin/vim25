package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerformVsanUpgradePreflightCheckRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformVsanUpgradePreflightCheckRequestType", propOrder = {"_this", "cluster", "downgradeFormat"})
public class PerformVsanUpgradePreflightCheckRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference cluster;
  
  protected Boolean downgradeFormat;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCluster() {
    return this.cluster;
  }
  
  public void setCluster(ManagedObjectReference paramManagedObjectReference) {
    this.cluster = paramManagedObjectReference;
  }
  
  public Boolean isDowngradeFormat() {
    return this.downgradeFormat;
  }
  
  public void setDowngradeFormat(Boolean paramBoolean) {
    this.downgradeFormat = paramBoolean;
  }
}
