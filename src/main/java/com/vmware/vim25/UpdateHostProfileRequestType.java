package com.vmware.vim25;

import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHostProfileRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHostProfileRequestType", propOrder = {"_this", "config"})
public class UpdateHostProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostProfileConfigSpec config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostProfileConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(HostProfileConfigSpec paramHostProfileConfigSpec) {
    this.config = paramHostProfileConfigSpec;
  }
}
