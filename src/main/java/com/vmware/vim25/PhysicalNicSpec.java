package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.PhysicalNicLinkInfo;
import com.vmware.vim25.PhysicalNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicSpec", propOrder = {"ip", "linkSpeed", "enableEnhancedNetworkingStack", "ensInterruptEnabled"})
public class PhysicalNicSpec extends DynamicData {
  protected HostIpConfig ip;
  
  protected PhysicalNicLinkInfo linkSpeed;
  
  protected Boolean enableEnhancedNetworkingStack;
  
  protected Boolean ensInterruptEnabled;
  
  public HostIpConfig getIp() {
    return this.ip;
  }
  
  public void setIp(HostIpConfig paramHostIpConfig) {
    this.ip = paramHostIpConfig;
  }
  
  public PhysicalNicLinkInfo getLinkSpeed() {
    return this.linkSpeed;
  }
  
  public void setLinkSpeed(PhysicalNicLinkInfo paramPhysicalNicLinkInfo) {
    this.linkSpeed = paramPhysicalNicLinkInfo;
  }
  
  public Boolean isEnableEnhancedNetworkingStack() {
    return this.enableEnhancedNetworkingStack;
  }
  
  public void setEnableEnhancedNetworkingStack(Boolean paramBoolean) {
    this.enableEnhancedNetworkingStack = paramBoolean;
  }
  
  public Boolean isEnsInterruptEnabled() {
    return this.ensInterruptEnabled;
  }
  
  public void setEnsInterruptEnabled(Boolean paramBoolean) {
    this.ensInterruptEnabled = paramBoolean;
  }
}
