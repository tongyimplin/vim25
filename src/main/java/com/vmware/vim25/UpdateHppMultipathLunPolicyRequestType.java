package com.vmware.vim25;

import com.vmware.vim25.HostMultipathInfoHppLogicalUnitPolicy;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHppMultipathLunPolicyRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHppMultipathLunPolicyRequestType", propOrder = {"_this", "lunId", "policy"})
public class UpdateHppMultipathLunPolicyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String lunId;
  
  @XmlElement(required = true)
  protected HostMultipathInfoHppLogicalUnitPolicy policy;
  
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
  
  public HostMultipathInfoHppLogicalUnitPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(HostMultipathInfoHppLogicalUnitPolicy paramHostMultipathInfoHppLogicalUnitPolicy) {
    this.policy = paramHostMultipathInfoHppLogicalUnitPolicy;
  }
}
