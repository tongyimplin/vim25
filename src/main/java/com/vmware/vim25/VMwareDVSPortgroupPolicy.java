package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupPolicy;
import com.vmware.vim25.VMwareDVSPortgroupPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPortgroupPolicy", propOrder = {"vlanOverrideAllowed", "uplinkTeamingOverrideAllowed", "securityPolicyOverrideAllowed", "ipfixOverrideAllowed", "macManagementOverrideAllowed"})
public class VMwareDVSPortgroupPolicy extends DVPortgroupPolicy {
  protected boolean vlanOverrideAllowed;
  
  protected boolean uplinkTeamingOverrideAllowed;
  
  protected boolean securityPolicyOverrideAllowed;
  
  protected Boolean ipfixOverrideAllowed;
  
  protected Boolean macManagementOverrideAllowed;
  
  public boolean isVlanOverrideAllowed() {
    return this.vlanOverrideAllowed;
  }
  
  public void setVlanOverrideAllowed(boolean paramBoolean) {
    this.vlanOverrideAllowed = paramBoolean;
  }
  
  public boolean isUplinkTeamingOverrideAllowed() {
    return this.uplinkTeamingOverrideAllowed;
  }
  
  public void setUplinkTeamingOverrideAllowed(boolean paramBoolean) {
    this.uplinkTeamingOverrideAllowed = paramBoolean;
  }
  
  public boolean isSecurityPolicyOverrideAllowed() {
    return this.securityPolicyOverrideAllowed;
  }
  
  public void setSecurityPolicyOverrideAllowed(boolean paramBoolean) {
    this.securityPolicyOverrideAllowed = paramBoolean;
  }
  
  public Boolean isIpfixOverrideAllowed() {
    return this.ipfixOverrideAllowed;
  }
  
  public void setIpfixOverrideAllowed(Boolean paramBoolean) {
    this.ipfixOverrideAllowed = paramBoolean;
  }
  
  public Boolean isMacManagementOverrideAllowed() {
    return this.macManagementOverrideAllowed;
  }
  
  public void setMacManagementOverrideAllowed(Boolean paramBoolean) {
    this.macManagementOverrideAllowed = paramBoolean;
  }
}
