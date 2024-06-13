package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigInfoEx;
import com.vmware.vim25.ClusterCryptoConfigInfo;
import com.vmware.vim25.ClusterDasConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigInfo;
import com.vmware.vim25.ClusterDpmConfigInfo;
import com.vmware.vim25.ClusterDpmHostConfigInfo;
import com.vmware.vim25.ClusterDrsConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigInfo;
import com.vmware.vim25.ClusterGroupInfo;
import com.vmware.vim25.ClusterInfraUpdateHaConfigInfo;
import com.vmware.vim25.ClusterOrchestrationInfo;
import com.vmware.vim25.ClusterProactiveDrsConfigInfo;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ClusterVmOrchestrationInfo;
import com.vmware.vim25.ComputeResourceConfigInfo;
import com.vmware.vim25.VsanClusterConfigInfo;
import com.vmware.vim25.VsanHostConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigInfoEx", propOrder = {"dasConfig", "dasVmConfig", "drsConfig", "drsVmConfig", "rule", "orchestration", "vmOrchestration", "dpmConfigInfo", "dpmHostConfig", "vsanConfigInfo", "vsanHostConfig", "group", "infraUpdateHaConfig", "proactiveDrsConfig", "cryptoConfig"})
public class ClusterConfigInfoEx extends ComputeResourceConfigInfo {
  @XmlElement(required = true)
  protected ClusterDasConfigInfo dasConfig;
  
  protected List<ClusterDasVmConfigInfo> dasVmConfig;
  
  @XmlElement(required = true)
  protected ClusterDrsConfigInfo drsConfig;
  
  protected List<ClusterDrsVmConfigInfo> drsVmConfig;
  
  protected List<ClusterRuleInfo> rule;
  
  protected ClusterOrchestrationInfo orchestration;
  
  protected List<ClusterVmOrchestrationInfo> vmOrchestration;
  
  protected ClusterDpmConfigInfo dpmConfigInfo;
  
  protected List<ClusterDpmHostConfigInfo> dpmHostConfig;
  
  protected VsanClusterConfigInfo vsanConfigInfo;
  
  protected List<VsanHostConfigInfo> vsanHostConfig;
  
  protected List<ClusterGroupInfo> group;
  
  protected ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
  
  protected ClusterProactiveDrsConfigInfo proactiveDrsConfig;
  
  protected ClusterCryptoConfigInfo cryptoConfig;
  
  public ClusterDasConfigInfo getDasConfig() {
    return this.dasConfig;
  }
  
  public void setDasConfig(ClusterDasConfigInfo paramClusterDasConfigInfo) {
    this.dasConfig = paramClusterDasConfigInfo;
  }
  
  public List<ClusterDasVmConfigInfo> getDasVmConfig() {
    if (this.dasVmConfig == null)
      this.dasVmConfig = new ArrayList<>(); 
    return this.dasVmConfig;
  }
  
  public ClusterDrsConfigInfo getDrsConfig() {
    return this.drsConfig;
  }
  
  public void setDrsConfig(ClusterDrsConfigInfo paramClusterDrsConfigInfo) {
    this.drsConfig = paramClusterDrsConfigInfo;
  }
  
  public List<ClusterDrsVmConfigInfo> getDrsVmConfig() {
    if (this.drsVmConfig == null)
      this.drsVmConfig = new ArrayList<>(); 
    return this.drsVmConfig;
  }
  
  public List<ClusterRuleInfo> getRule() {
    if (this.rule == null)
      this.rule = new ArrayList<>(); 
    return this.rule;
  }
  
  public ClusterOrchestrationInfo getOrchestration() {
    return this.orchestration;
  }
  
  public void setOrchestration(ClusterOrchestrationInfo paramClusterOrchestrationInfo) {
    this.orchestration = paramClusterOrchestrationInfo;
  }
  
  public List<ClusterVmOrchestrationInfo> getVmOrchestration() {
    if (this.vmOrchestration == null)
      this.vmOrchestration = new ArrayList<>(); 
    return this.vmOrchestration;
  }
  
  public ClusterDpmConfigInfo getDpmConfigInfo() {
    return this.dpmConfigInfo;
  }
  
  public void setDpmConfigInfo(ClusterDpmConfigInfo paramClusterDpmConfigInfo) {
    this.dpmConfigInfo = paramClusterDpmConfigInfo;
  }
  
  public List<ClusterDpmHostConfigInfo> getDpmHostConfig() {
    if (this.dpmHostConfig == null)
      this.dpmHostConfig = new ArrayList<>(); 
    return this.dpmHostConfig;
  }
  
  public VsanClusterConfigInfo getVsanConfigInfo() {
    return this.vsanConfigInfo;
  }
  
  public void setVsanConfigInfo(VsanClusterConfigInfo paramVsanClusterConfigInfo) {
    this.vsanConfigInfo = paramVsanClusterConfigInfo;
  }
  
  public List<VsanHostConfigInfo> getVsanHostConfig() {
    if (this.vsanHostConfig == null)
      this.vsanHostConfig = new ArrayList<>(); 
    return this.vsanHostConfig;
  }
  
  public List<ClusterGroupInfo> getGroup() {
    if (this.group == null)
      this.group = new ArrayList<>(); 
    return this.group;
  }
  
  public ClusterInfraUpdateHaConfigInfo getInfraUpdateHaConfig() {
    return this.infraUpdateHaConfig;
  }
  
  public void setInfraUpdateHaConfig(ClusterInfraUpdateHaConfigInfo paramClusterInfraUpdateHaConfigInfo) {
    this.infraUpdateHaConfig = paramClusterInfraUpdateHaConfigInfo;
  }
  
  public ClusterProactiveDrsConfigInfo getProactiveDrsConfig() {
    return this.proactiveDrsConfig;
  }
  
  public void setProactiveDrsConfig(ClusterProactiveDrsConfigInfo paramClusterProactiveDrsConfigInfo) {
    this.proactiveDrsConfig = paramClusterProactiveDrsConfigInfo;
  }
  
  public ClusterCryptoConfigInfo getCryptoConfig() {
    return this.cryptoConfig;
  }
  
  public void setCryptoConfig(ClusterCryptoConfigInfo paramClusterCryptoConfigInfo) {
    this.cryptoConfig = paramClusterCryptoConfigInfo;
  }
}
