package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVSFailureCriteria;
import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.StringPolicy;
import com.vmware.vim25.VMwareUplinkPortOrderPolicy;
import com.vmware.vim25.VmwareUplinkPortTeamingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareUplinkPortTeamingPolicy", propOrder = {"policy", "reversePolicy", "notifySwitches", "rollingOrder", "failureCriteria", "uplinkPortOrder"})
public class VmwareUplinkPortTeamingPolicy extends InheritablePolicy {
  protected StringPolicy policy;
  
  protected BoolPolicy reversePolicy;
  
  protected BoolPolicy notifySwitches;
  
  protected BoolPolicy rollingOrder;
  
  protected DVSFailureCriteria failureCriteria;
  
  protected VMwareUplinkPortOrderPolicy uplinkPortOrder;
  
  public StringPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(StringPolicy paramStringPolicy) {
    this.policy = paramStringPolicy;
  }
  
  public BoolPolicy getReversePolicy() {
    return this.reversePolicy;
  }
  
  public void setReversePolicy(BoolPolicy paramBoolPolicy) {
    this.reversePolicy = paramBoolPolicy;
  }
  
  public BoolPolicy getNotifySwitches() {
    return this.notifySwitches;
  }
  
  public void setNotifySwitches(BoolPolicy paramBoolPolicy) {
    this.notifySwitches = paramBoolPolicy;
  }
  
  public BoolPolicy getRollingOrder() {
    return this.rollingOrder;
  }
  
  public void setRollingOrder(BoolPolicy paramBoolPolicy) {
    this.rollingOrder = paramBoolPolicy;
  }
  
  public DVSFailureCriteria getFailureCriteria() {
    return this.failureCriteria;
  }
  
  public void setFailureCriteria(DVSFailureCriteria paramDVSFailureCriteria) {
    this.failureCriteria = paramDVSFailureCriteria;
  }
  
  public VMwareUplinkPortOrderPolicy getUplinkPortOrder() {
    return this.uplinkPortOrder;
  }
  
  public void setUplinkPortOrder(VMwareUplinkPortOrderPolicy paramVMwareUplinkPortOrderPolicy) {
    this.uplinkPortOrder = paramVMwareUplinkPortOrderPolicy;
  }
}
