package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetOffloadCapabilities;
import com.vmware.vim25.HostNetworkPolicy;
import com.vmware.vim25.HostNetworkSecurityPolicy;
import com.vmware.vim25.HostNetworkTrafficShapingPolicy;
import com.vmware.vim25.HostNicTeamingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkPolicy", propOrder = {"security", "nicTeaming", "offloadPolicy", "shapingPolicy"})
public class HostNetworkPolicy extends DynamicData {
  protected HostNetworkSecurityPolicy security;
  
  protected HostNicTeamingPolicy nicTeaming;
  
  protected HostNetOffloadCapabilities offloadPolicy;
  
  protected HostNetworkTrafficShapingPolicy shapingPolicy;
  
  public HostNetworkSecurityPolicy getSecurity() {
    return this.security;
  }
  
  public void setSecurity(HostNetworkSecurityPolicy paramHostNetworkSecurityPolicy) {
    this.security = paramHostNetworkSecurityPolicy;
  }
  
  public HostNicTeamingPolicy getNicTeaming() {
    return this.nicTeaming;
  }
  
  public void setNicTeaming(HostNicTeamingPolicy paramHostNicTeamingPolicy) {
    this.nicTeaming = paramHostNicTeamingPolicy;
  }
  
  public HostNetOffloadCapabilities getOffloadPolicy() {
    return this.offloadPolicy;
  }
  
  public void setOffloadPolicy(HostNetOffloadCapabilities paramHostNetOffloadCapabilities) {
    this.offloadPolicy = paramHostNetOffloadCapabilities;
  }
  
  public HostNetworkTrafficShapingPolicy getShapingPolicy() {
    return this.shapingPolicy;
  }
  
  public void setShapingPolicy(HostNetworkTrafficShapingPolicy paramHostNetworkTrafficShapingPolicy) {
    this.shapingPolicy = paramHostNetworkTrafficShapingPolicy;
  }
}
