package com.vmware.vim25;

import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveAnswerFileForProfileRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveAnswerFileForProfileRequestType", propOrder = {"_this", "host", "applyProfile"})
public class RetrieveAnswerFileForProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected HostApplyProfile applyProfile;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public HostApplyProfile getApplyProfile() {
    return this.applyProfile;
  }
  
  public void setApplyProfile(HostApplyProfile paramHostApplyProfile) {
    this.applyProfile = paramHostApplyProfile;
  }
}
