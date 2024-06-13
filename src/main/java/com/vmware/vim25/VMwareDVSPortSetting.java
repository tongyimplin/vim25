package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVSMacManagementPolicy;
import com.vmware.vim25.DVSSecurityPolicy;
import com.vmware.vim25.IntPolicy;
import com.vmware.vim25.VMwareDVSPortSetting;
import com.vmware.vim25.VMwareUplinkLacpPolicy;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec;
import com.vmware.vim25.VmwareUplinkPortTeamingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPortSetting", propOrder = {"vlan", "qosTag", "uplinkTeamingPolicy", "securityPolicy", "ipfixEnabled", "txUplink", "lacpPolicy", "macManagementPolicy", "vni"})
public class VMwareDVSPortSetting extends DVPortSetting {
  protected VmwareDistributedVirtualSwitchVlanSpec vlan;
  
  protected IntPolicy qosTag;
  
  protected VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy;
  
  protected DVSSecurityPolicy securityPolicy;
  
  protected BoolPolicy ipfixEnabled;
  
  protected BoolPolicy txUplink;
  
  protected VMwareUplinkLacpPolicy lacpPolicy;
  
  protected DVSMacManagementPolicy macManagementPolicy;
  
  @XmlElement(name = "VNI")
  protected IntPolicy vni;
  
  public VmwareDistributedVirtualSwitchVlanSpec getVlan() {
    return this.vlan;
  }
  
  public void setVlan(VmwareDistributedVirtualSwitchVlanSpec paramVmwareDistributedVirtualSwitchVlanSpec) {
    this.vlan = paramVmwareDistributedVirtualSwitchVlanSpec;
  }
  
  public IntPolicy getQosTag() {
    return this.qosTag;
  }
  
  public void setQosTag(IntPolicy paramIntPolicy) {
    this.qosTag = paramIntPolicy;
  }
  
  public VmwareUplinkPortTeamingPolicy getUplinkTeamingPolicy() {
    return this.uplinkTeamingPolicy;
  }
  
  public void setUplinkTeamingPolicy(VmwareUplinkPortTeamingPolicy paramVmwareUplinkPortTeamingPolicy) {
    this.uplinkTeamingPolicy = paramVmwareUplinkPortTeamingPolicy;
  }
  
  public DVSSecurityPolicy getSecurityPolicy() {
    return this.securityPolicy;
  }
  
  public void setSecurityPolicy(DVSSecurityPolicy paramDVSSecurityPolicy) {
    this.securityPolicy = paramDVSSecurityPolicy;
  }
  
  public BoolPolicy getIpfixEnabled() {
    return this.ipfixEnabled;
  }
  
  public void setIpfixEnabled(BoolPolicy paramBoolPolicy) {
    this.ipfixEnabled = paramBoolPolicy;
  }
  
  public BoolPolicy getTxUplink() {
    return this.txUplink;
  }
  
  public void setTxUplink(BoolPolicy paramBoolPolicy) {
    this.txUplink = paramBoolPolicy;
  }
  
  public VMwareUplinkLacpPolicy getLacpPolicy() {
    return this.lacpPolicy;
  }
  
  public void setLacpPolicy(VMwareUplinkLacpPolicy paramVMwareUplinkLacpPolicy) {
    this.lacpPolicy = paramVMwareUplinkLacpPolicy;
  }
  
  public DVSMacManagementPolicy getMacManagementPolicy() {
    return this.macManagementPolicy;
  }
  
  public void setMacManagementPolicy(DVSMacManagementPolicy paramDVSMacManagementPolicy) {
    this.macManagementPolicy = paramDVSMacManagementPolicy;
  }
  
  public IntPolicy getVNI() {
    return this.vni;
  }
  
  public void setVNI(IntPolicy paramIntPolicy) {
    this.vni = paramIntPolicy;
  }
}
