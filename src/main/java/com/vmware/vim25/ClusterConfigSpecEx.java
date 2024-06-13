package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.ClusterCryptoConfigInfo;
import com.vmware.vim25.ClusterDasConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigSpec;
import com.vmware.vim25.ClusterDpmConfigInfo;
import com.vmware.vim25.ClusterDpmHostConfigSpec;
import com.vmware.vim25.ClusterDrsConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigSpec;
import com.vmware.vim25.ClusterGroupSpec;
import com.vmware.vim25.ClusterInfraUpdateHaConfigInfo;
import com.vmware.vim25.ClusterOrchestrationInfo;
import com.vmware.vim25.ClusterProactiveDrsConfigInfo;
import com.vmware.vim25.ClusterRuleSpec;
import com.vmware.vim25.ClusterVmOrchestrationSpec;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.VsanClusterConfigInfo;
import com.vmware.vim25.VsanHostConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigSpecEx", propOrder = {"dasConfig", "dasVmConfigSpec", "drsConfig", "drsVmConfigSpec", "rulesSpec", "orchestration", "vmOrchestrationSpec", "dpmConfig", "dpmHostConfigSpec", "vsanConfig", "vsanHostConfigSpec", "groupSpec", "infraUpdateHaConfig", "proactiveDrsConfig", "inHciWorkflow", "cryptoConfig"})
public class ClusterConfigSpecEx extends ComputeResourceConfigSpec {
  protected ClusterDasConfigInfo dasConfig;
  
  protected List<ClusterDasVmConfigSpec> dasVmConfigSpec;
  
  protected ClusterDrsConfigInfo drsConfig;
  
  protected List<ClusterDrsVmConfigSpec> drsVmConfigSpec;
  
  protected List<ClusterRuleSpec> rulesSpec;
  
  protected ClusterOrchestrationInfo orchestration;
  
  protected List<ClusterVmOrchestrationSpec> vmOrchestrationSpec;
  
  protected ClusterDpmConfigInfo dpmConfig;
  
  protected List<ClusterDpmHostConfigSpec> dpmHostConfigSpec;
  
  protected VsanClusterConfigInfo vsanConfig;
  
  protected List<VsanHostConfigInfo> vsanHostConfigSpec;
  
  protected List<ClusterGroupSpec> groupSpec;
  
  protected ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
  
  protected ClusterProactiveDrsConfigInfo proactiveDrsConfig;
  
  protected Boolean inHciWorkflow;
  
  protected ClusterCryptoConfigInfo cryptoConfig;
  
  public ClusterDasConfigInfo getDasConfig() {
    return this.dasConfig;
  }
  
  public void setDasConfig(ClusterDasConfigInfo paramClusterDasConfigInfo) {
    this.dasConfig = paramClusterDasConfigInfo;
  }
  
  public List<ClusterDasVmConfigSpec> getDasVmConfigSpec() {
    if (this.dasVmConfigSpec == null)
      this.dasVmConfigSpec = new ArrayList<>(); 
    return this.dasVmConfigSpec;
  }
  
  public ClusterDrsConfigInfo getDrsConfig() {
    return this.drsConfig;
  }
  
  public void setDrsConfig(ClusterDrsConfigInfo paramClusterDrsConfigInfo) {
    this.drsConfig = paramClusterDrsConfigInfo;
  }
  
  public List<ClusterDrsVmConfigSpec> getDrsVmConfigSpec() {
    if (this.drsVmConfigSpec == null)
      this.drsVmConfigSpec = new ArrayList<>(); 
    return this.drsVmConfigSpec;
  }
  
  public List<ClusterRuleSpec> getRulesSpec() {
    if (this.rulesSpec == null)
      this.rulesSpec = new ArrayList<>(); 
    return this.rulesSpec;
  }
  
  public ClusterOrchestrationInfo getOrchestration() {
    return this.orchestration;
  }
  
  public void setOrchestration(ClusterOrchestrationInfo paramClusterOrchestrationInfo) {
    this.orchestration = paramClusterOrchestrationInfo;
  }
  
  public List<ClusterVmOrchestrationSpec> getVmOrchestrationSpec() {
    if (this.vmOrchestrationSpec == null)
      this.vmOrchestrationSpec = new ArrayList<>(); 
    return this.vmOrchestrationSpec;
  }
  
  public ClusterDpmConfigInfo getDpmConfig() {
    return this.dpmConfig;
  }
  
  public void setDpmConfig(ClusterDpmConfigInfo paramClusterDpmConfigInfo) {
    this.dpmConfig = paramClusterDpmConfigInfo;
  }
  
  public List<ClusterDpmHostConfigSpec> getDpmHostConfigSpec() {
    if (this.dpmHostConfigSpec == null)
      this.dpmHostConfigSpec = new ArrayList<>(); 
    return this.dpmHostConfigSpec;
  }
  
  public VsanClusterConfigInfo getVsanConfig() {
    return this.vsanConfig;
  }
  
  public void setVsanConfig(VsanClusterConfigInfo paramVsanClusterConfigInfo) {
    this.vsanConfig = paramVsanClusterConfigInfo;
  }
  
  public List<VsanHostConfigInfo> getVsanHostConfigSpec() {
    if (this.vsanHostConfigSpec == null)
      this.vsanHostConfigSpec = new ArrayList<>(); 
    return this.vsanHostConfigSpec;
  }
  
  public List<ClusterGroupSpec> getGroupSpec() {
    if (this.groupSpec == null)
      this.groupSpec = new ArrayList<>(); 
    return this.groupSpec;
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
  
  public Boolean isInHciWorkflow() {
    return this.inHciWorkflow;
  }
  
  public void setInHciWorkflow(Boolean paramBoolean) {
    this.inHciWorkflow = paramBoolean;
  }
  
  public ClusterCryptoConfigInfo getCryptoConfig() {
    return this.cryptoConfig;
  }
  
  public void setCryptoConfig(ClusterCryptoConfigInfo paramClusterCryptoConfigInfo) {
    this.cryptoConfig = paramClusterCryptoConfigInfo;
  }
}
