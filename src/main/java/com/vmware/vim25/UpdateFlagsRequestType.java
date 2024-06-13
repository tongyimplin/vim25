package com.vmware.vim25;

import com.vmware.vim25.HostFlagInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateFlagsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFlagsRequestType", propOrder = {"_this", "flagInfo"})
public class UpdateFlagsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostFlagInfo flagInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostFlagInfo getFlagInfo() {
    return this.flagInfo;
  }
  
  public void setFlagInfo(HostFlagInfo paramHostFlagInfo) {
    this.flagInfo = paramHostFlagInfo;
  }
}
