package com.vmware.vim25;

import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetMultipathLunPolicyRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMultipathLunPolicyRequestType", propOrder = {"_this", "lunId", "policy"})
public class SetMultipathLunPolicyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String lunId;
  
  @XmlElement(required = true)
  protected HostMultipathInfoLogicalUnitPolicy policy;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getLunId() {
    return this.lunId;
  }
  
  public void setLunId(String paramString) {
    this.lunId = paramString;
  }
  
  public HostMultipathInfoLogicalUnitPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(HostMultipathInfoLogicalUnitPolicy paramHostMultipathInfoLogicalUnitPolicy) {
    this.policy = paramHostMultipathInfoLogicalUnitPolicy;
  }
}
