package com.vmware.vim25;

import com.vmware.vim25.GenerateConfigTaskListRequestType;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateConfigTaskListRequestType", propOrder = {"_this", "configSpec", "host"})
public class GenerateConfigTaskListRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostConfigSpec configSpec;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(HostConfigSpec paramHostConfigSpec) {
    this.configSpec = paramHostConfigSpec;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
