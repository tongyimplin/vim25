package com.vmware.vim25;

import com.vmware.vim25.EnterMaintenanceModeRequestType;
import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterMaintenanceModeRequestType", propOrder = {"_this", "timeout", "evacuatePoweredOffVms", "maintenanceSpec"})
public class EnterMaintenanceModeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int timeout;
  
  protected Boolean evacuatePoweredOffVms;
  
  protected HostMaintenanceSpec maintenanceSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(int paramInt) {
    this.timeout = paramInt;
  }
  
  public Boolean isEvacuatePoweredOffVms() {
    return this.evacuatePoweredOffVms;
  }
  
  public void setEvacuatePoweredOffVms(Boolean paramBoolean) {
    this.evacuatePoweredOffVms = paramBoolean;
  }
  
  public HostMaintenanceSpec getMaintenanceSpec() {
    return this.maintenanceSpec;
  }
  
  public void setMaintenanceSpec(HostMaintenanceSpec paramHostMaintenanceSpec) {
    this.maintenanceSpec = paramHostMaintenanceSpec;
  }
}
