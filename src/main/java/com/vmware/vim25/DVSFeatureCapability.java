package com.vmware.vim25;

import com.vmware.vim25.DVSBackupRestoreCapability;
import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.DVSHealthCheckCapability;
import com.vmware.vim25.DVSNetworkResourceManagementCapability;
import com.vmware.vim25.DVSRollbackCapability;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSFeatureCapability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFeatureCapability", propOrder = {"networkResourceManagementSupported", "vmDirectPathGen2Supported", "nicTeamingPolicy", "networkResourcePoolHighShareValue", "networkResourceManagementCapability", "healthCheckCapability", "rollbackCapability", "backupRestoreCapability", "networkFilterSupported", "macLearningSupported"})
@XmlSeeAlso({VMwareDVSFeatureCapability.class})
public class DVSFeatureCapability extends DynamicData {
  protected boolean networkResourceManagementSupported;
  
  protected boolean vmDirectPathGen2Supported;
  
  protected List<String> nicTeamingPolicy;
  
  protected Integer networkResourcePoolHighShareValue;
  
  protected DVSNetworkResourceManagementCapability networkResourceManagementCapability;
  
  protected DVSHealthCheckCapability healthCheckCapability;
  
  protected DVSRollbackCapability rollbackCapability;
  
  protected DVSBackupRestoreCapability backupRestoreCapability;
  
  protected Boolean networkFilterSupported;
  
  protected Boolean macLearningSupported;
  
  public boolean isNetworkResourceManagementSupported() {
    return this.networkResourceManagementSupported;
  }
  
  public void setNetworkResourceManagementSupported(boolean paramBoolean) {
    this.networkResourceManagementSupported = paramBoolean;
  }
  
  public boolean isVmDirectPathGen2Supported() {
    return this.vmDirectPathGen2Supported;
  }
  
  public void setVmDirectPathGen2Supported(boolean paramBoolean) {
    this.vmDirectPathGen2Supported = paramBoolean;
  }
  
  public List<String> getNicTeamingPolicy() {
    if (this.nicTeamingPolicy == null)
      this.nicTeamingPolicy = new ArrayList<>(); 
    return this.nicTeamingPolicy;
  }
  
  public Integer getNetworkResourcePoolHighShareValue() {
    return this.networkResourcePoolHighShareValue;
  }
  
  public void setNetworkResourcePoolHighShareValue(Integer paramInteger) {
    this.networkResourcePoolHighShareValue = paramInteger;
  }
  
  public DVSNetworkResourceManagementCapability getNetworkResourceManagementCapability() {
    return this.networkResourceManagementCapability;
  }
  
  public void setNetworkResourceManagementCapability(DVSNetworkResourceManagementCapability paramDVSNetworkResourceManagementCapability) {
    this.networkResourceManagementCapability = paramDVSNetworkResourceManagementCapability;
  }
  
  public DVSHealthCheckCapability getHealthCheckCapability() {
    return this.healthCheckCapability;
  }
  
  public void setHealthCheckCapability(DVSHealthCheckCapability paramDVSHealthCheckCapability) {
    this.healthCheckCapability = paramDVSHealthCheckCapability;
  }
  
  public DVSRollbackCapability getRollbackCapability() {
    return this.rollbackCapability;
  }
  
  public void setRollbackCapability(DVSRollbackCapability paramDVSRollbackCapability) {
    this.rollbackCapability = paramDVSRollbackCapability;
  }
  
  public DVSBackupRestoreCapability getBackupRestoreCapability() {
    return this.backupRestoreCapability;
  }
  
  public void setBackupRestoreCapability(DVSBackupRestoreCapability paramDVSBackupRestoreCapability) {
    this.backupRestoreCapability = paramDVSBackupRestoreCapability;
  }
  
  public Boolean isNetworkFilterSupported() {
    return this.networkFilterSupported;
  }
  
  public void setNetworkFilterSupported(Boolean paramBoolean) {
    this.networkFilterSupported = paramBoolean;
  }
  
  public Boolean isMacLearningSupported() {
    return this.macLearningSupported;
  }
  
  public void setMacLearningSupported(Boolean paramBoolean) {
    this.macLearningSupported = paramBoolean;
  }
}
