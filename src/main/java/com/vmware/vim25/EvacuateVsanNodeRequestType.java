package com.vmware.vim25;

import com.vmware.vim25.EvacuateVsanNodeRequestType;
import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvacuateVsanNodeRequestType", propOrder = {"_this", "maintenanceSpec", "timeout"})
public class EvacuateVsanNodeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostMaintenanceSpec maintenanceSpec;
  
  protected int timeout;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostMaintenanceSpec getMaintenanceSpec() {
    return this.maintenanceSpec;
  }
  
  public void setMaintenanceSpec(HostMaintenanceSpec paramHostMaintenanceSpec) {
    this.maintenanceSpec = paramHostMaintenanceSpec;
  }
  
  public int getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(int paramInt) {
    this.timeout = paramInt;
  }
}
