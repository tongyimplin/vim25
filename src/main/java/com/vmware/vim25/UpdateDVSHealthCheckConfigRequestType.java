package com.vmware.vim25;

import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDVSHealthCheckConfigRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDVSHealthCheckConfigRequestType", propOrder = {"_this", "healthCheckConfig"})
public class UpdateDVSHealthCheckConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<DVSHealthCheckConfig> healthCheckConfig;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DVSHealthCheckConfig> getHealthCheckConfig() {
    if (this.healthCheckConfig == null)
      this.healthCheckConfig = new ArrayList<>(); 
    return this.healthCheckConfig;
  }
}
