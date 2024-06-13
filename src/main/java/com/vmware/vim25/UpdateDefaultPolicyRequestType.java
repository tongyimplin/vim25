package com.vmware.vim25;

import com.vmware.vim25.HostFirewallDefaultPolicy;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDefaultPolicyRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDefaultPolicyRequestType", propOrder = {"_this", "defaultPolicy"})
public class UpdateDefaultPolicyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostFirewallDefaultPolicy defaultPolicy;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostFirewallDefaultPolicy getDefaultPolicy() {
    return this.defaultPolicy;
  }
  
  public void setDefaultPolicy(HostFirewallDefaultPolicy paramHostFirewallDefaultPolicy) {
    this.defaultPolicy = paramHostFirewallDefaultPolicy;
  }
}
