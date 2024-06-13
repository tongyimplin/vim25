package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNicFailureCriteria;
import com.vmware.vim25.HostNicOrderPolicy;
import com.vmware.vim25.HostNicTeamingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicTeamingPolicy", propOrder = {"policy", "reversePolicy", "notifySwitches", "rollingOrder", "failureCriteria", "nicOrder"})
public class HostNicTeamingPolicy extends DynamicData {
  protected String policy;
  
  protected Boolean reversePolicy;
  
  protected Boolean notifySwitches;
  
  protected Boolean rollingOrder;
  
  protected HostNicFailureCriteria failureCriteria;
  
  protected HostNicOrderPolicy nicOrder;
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
  
  public Boolean isReversePolicy() {
    return this.reversePolicy;
  }
  
  public void setReversePolicy(Boolean paramBoolean) {
    this.reversePolicy = paramBoolean;
  }
  
  public Boolean isNotifySwitches() {
    return this.notifySwitches;
  }
  
  public void setNotifySwitches(Boolean paramBoolean) {
    this.notifySwitches = paramBoolean;
  }
  
  public Boolean isRollingOrder() {
    return this.rollingOrder;
  }
  
  public void setRollingOrder(Boolean paramBoolean) {
    this.rollingOrder = paramBoolean;
  }
  
  public HostNicFailureCriteria getFailureCriteria() {
    return this.failureCriteria;
  }
  
  public void setFailureCriteria(HostNicFailureCriteria paramHostNicFailureCriteria) {
    this.failureCriteria = paramHostNicFailureCriteria;
  }
  
  public HostNicOrderPolicy getNicOrder() {
    return this.nicOrder;
  }
  
  public void setNicOrder(HostNicOrderPolicy paramHostNicOrderPolicy) {
    this.nicOrder = paramHostNicOrderPolicy;
  }
}
