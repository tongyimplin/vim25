package com.vmware.vim25;

import com.vmware.vim25.HostFirewallRulesetRulesetSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateRulesetRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRulesetRequestType", propOrder = {"_this", "id", "spec"})
public class UpdateRulesetRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected HostFirewallRulesetRulesetSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public HostFirewallRulesetRulesetSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostFirewallRulesetRulesetSpec paramHostFirewallRulesetRulesetSpec) {
    this.spec = paramHostFirewallRulesetRulesetSpec;
  }
}
