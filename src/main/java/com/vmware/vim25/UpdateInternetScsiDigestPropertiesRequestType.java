package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiDigestPropertiesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiDigestPropertiesRequestType", propOrder = {"_this", "iScsiHbaDevice", "targetSet", "digestProperties"})
public class UpdateInternetScsiDigestPropertiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  protected HostInternetScsiHbaTargetSet targetSet;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaDigestProperties digestProperties;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIScsiHbaDevice() {
    return this.iScsiHbaDevice;
  }
  
  public void setIScsiHbaDevice(String paramString) {
    this.iScsiHbaDevice = paramString;
  }
  
  public HostInternetScsiHbaTargetSet getTargetSet() {
    return this.targetSet;
  }
  
  public void setTargetSet(HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet) {
    this.targetSet = paramHostInternetScsiHbaTargetSet;
  }
  
  public HostInternetScsiHbaDigestProperties getDigestProperties() {
    return this.digestProperties;
  }
  
  public void setDigestProperties(HostInternetScsiHbaDigestProperties paramHostInternetScsiHbaDigestProperties) {
    this.digestProperties = paramHostInternetScsiHbaDigestProperties;
  }
}
