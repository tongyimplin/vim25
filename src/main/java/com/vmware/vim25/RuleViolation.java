package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuleViolation;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleViolation", propOrder = {"host", "rule"})
public class RuleViolation extends VmConfigFault {
  protected ManagedObjectReference host;
  
  protected ClusterRuleInfo rule;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ClusterRuleInfo getRule() {
    return this.rule;
  }
  
  public void setRule(ClusterRuleInfo paramClusterRuleInfo) {
    this.rule = paramClusterRuleInfo;
  }
}
