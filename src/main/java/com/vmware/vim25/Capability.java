package com.vmware.vim25;

import com.vmware.vim25.Capability;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EVCMode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capability", propOrder = {"provisioningSupported", "multiHostSupported", "userShellAccessSupported", "supportedEVCMode", "networkBackupAndRestoreSupported", "ftDrsWithoutEvcSupported", "hciWorkflowSupported", "computePolicyVersion", "clusterPlacementSupported", "lifecycleManagementSupported", "scalableSharesSupported"})
public class Capability extends DynamicData {
  protected boolean provisioningSupported;
  
  protected boolean multiHostSupported;
  
  protected boolean userShellAccessSupported;
  
  protected List<EVCMode> supportedEVCMode;
  
  protected Boolean networkBackupAndRestoreSupported;
  
  protected Boolean ftDrsWithoutEvcSupported;
  
  protected Boolean hciWorkflowSupported;
  
  protected Integer computePolicyVersion;
  
  protected Boolean clusterPlacementSupported;
  
  protected Boolean lifecycleManagementSupported;
  
  protected Boolean scalableSharesSupported;
  
  public boolean isProvisioningSupported() {
    return this.provisioningSupported;
  }
  
  public void setProvisioningSupported(boolean paramBoolean) {
    this.provisioningSupported = paramBoolean;
  }
  
  public boolean isMultiHostSupported() {
    return this.multiHostSupported;
  }
  
  public void setMultiHostSupported(boolean paramBoolean) {
    this.multiHostSupported = paramBoolean;
  }
  
  public boolean isUserShellAccessSupported() {
    return this.userShellAccessSupported;
  }
  
  public void setUserShellAccessSupported(boolean paramBoolean) {
    this.userShellAccessSupported = paramBoolean;
  }
  
  public List<EVCMode> getSupportedEVCMode() {
    if (this.supportedEVCMode == null)
      this.supportedEVCMode = new ArrayList<>(); 
    return this.supportedEVCMode;
  }
  
  public Boolean isNetworkBackupAndRestoreSupported() {
    return this.networkBackupAndRestoreSupported;
  }
  
  public void setNetworkBackupAndRestoreSupported(Boolean paramBoolean) {
    this.networkBackupAndRestoreSupported = paramBoolean;
  }
  
  public Boolean isFtDrsWithoutEvcSupported() {
    return this.ftDrsWithoutEvcSupported;
  }
  
  public void setFtDrsWithoutEvcSupported(Boolean paramBoolean) {
    this.ftDrsWithoutEvcSupported = paramBoolean;
  }
  
  public Boolean isHciWorkflowSupported() {
    return this.hciWorkflowSupported;
  }
  
  public void setHciWorkflowSupported(Boolean paramBoolean) {
    this.hciWorkflowSupported = paramBoolean;
  }
  
  public Integer getComputePolicyVersion() {
    return this.computePolicyVersion;
  }
  
  public void setComputePolicyVersion(Integer paramInteger) {
    this.computePolicyVersion = paramInteger;
  }
  
  public Boolean isClusterPlacementSupported() {
    return this.clusterPlacementSupported;
  }
  
  public void setClusterPlacementSupported(Boolean paramBoolean) {
    this.clusterPlacementSupported = paramBoolean;
  }
  
  public Boolean isLifecycleManagementSupported() {
    return this.lifecycleManagementSupported;
  }
  
  public void setLifecycleManagementSupported(Boolean paramBoolean) {
    this.lifecycleManagementSupported = paramBoolean;
  }
  
  public Boolean isScalableSharesSupported() {
    return this.scalableSharesSupported;
  }
  
  public void setScalableSharesSupported(Boolean paramBoolean) {
    this.scalableSharesSupported = paramBoolean;
  }
}
