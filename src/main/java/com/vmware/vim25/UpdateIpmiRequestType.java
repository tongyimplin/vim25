package com.vmware.vim25;

import com.vmware.vim25.HostIpmiInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateIpmiRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpmiRequestType", propOrder = {"_this", "ipmiInfo"})
public class UpdateIpmiRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostIpmiInfo ipmiInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostIpmiInfo getIpmiInfo() {
    return this.ipmiInfo;
  }
  
  public void setIpmiInfo(HostIpmiInfo paramHostIpmiInfo) {
    this.ipmiInfo = paramHostIpmiInfo;
  }
}
