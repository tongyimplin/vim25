package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVsanRequestType;
import com.vmware.vim25.VsanHostConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVsanRequestType", propOrder = {"_this", "config"})
public class UpdateVsanRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VsanHostConfigInfo config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VsanHostConfigInfo getConfig() {
    return this.config;
  }
  
  public void setConfig(VsanHostConfigInfo paramVsanHostConfigInfo) {
    this.config = paramVsanHostConfigInfo;
  }
}
