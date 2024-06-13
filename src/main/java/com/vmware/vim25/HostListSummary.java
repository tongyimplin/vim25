package com.vmware.vim25;

import com.vmware.vim25.CustomFieldValue;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConfigSummary;
import com.vmware.vim25.HostHardwareSummary;
import com.vmware.vim25.HostListSummary;
import com.vmware.vim25.HostListSummaryGatewaySummary;
import com.vmware.vim25.HostListSummaryQuickStats;
import com.vmware.vim25.HostRuntimeInfo;
import com.vmware.vim25.HostTpmAttestationInfo;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostListSummary", propOrder = {"host", "hardware", "runtime", "config", "quickStats", "overallStatus", "rebootRequired", "customValue", "managementServerIp", "maxEVCModeKey", "currentEVCModeKey", "gateway", "tpmAttestation"})
public class HostListSummary extends DynamicData {
  protected ManagedObjectReference host;
  
  protected HostHardwareSummary hardware;
  
  protected HostRuntimeInfo runtime;
  
  @XmlElement(required = true)
  protected HostConfigSummary config;
  
  @XmlElement(required = true)
  protected HostListSummaryQuickStats quickStats;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus overallStatus;
  
  protected boolean rebootRequired;
  
  protected List<CustomFieldValue> customValue;
  
  protected String managementServerIp;
  
  protected String maxEVCModeKey;
  
  protected String currentEVCModeKey;
  
  protected HostListSummaryGatewaySummary gateway;
  
  protected HostTpmAttestationInfo tpmAttestation;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public HostHardwareSummary getHardware() {
    return this.hardware;
  }
  
  public void setHardware(HostHardwareSummary paramHostHardwareSummary) {
    this.hardware = paramHostHardwareSummary;
  }
  
  public HostRuntimeInfo getRuntime() {
    return this.runtime;
  }
  
  public void setRuntime(HostRuntimeInfo paramHostRuntimeInfo) {
    this.runtime = paramHostRuntimeInfo;
  }
  
  public HostConfigSummary getConfig() {
    return this.config;
  }
  
  public void setConfig(HostConfigSummary paramHostConfigSummary) {
    this.config = paramHostConfigSummary;
  }
  
  public HostListSummaryQuickStats getQuickStats() {
    return this.quickStats;
  }
  
  public void setQuickStats(HostListSummaryQuickStats paramHostListSummaryQuickStats) {
    this.quickStats = paramHostListSummaryQuickStats;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
  
  public boolean isRebootRequired() {
    return this.rebootRequired;
  }
  
  public void setRebootRequired(boolean paramBoolean) {
    this.rebootRequired = paramBoolean;
  }
  
  public List<CustomFieldValue> getCustomValue() {
    if (this.customValue == null)
      this.customValue = new ArrayList<>(); 
    return this.customValue;
  }
  
  public String getManagementServerIp() {
    return this.managementServerIp;
  }
  
  public void setManagementServerIp(String paramString) {
    this.managementServerIp = paramString;
  }
  
  public String getMaxEVCModeKey() {
    return this.maxEVCModeKey;
  }
  
  public void setMaxEVCModeKey(String paramString) {
    this.maxEVCModeKey = paramString;
  }
  
  public String getCurrentEVCModeKey() {
    return this.currentEVCModeKey;
  }
  
  public void setCurrentEVCModeKey(String paramString) {
    this.currentEVCModeKey = paramString;
  }
  
  public HostListSummaryGatewaySummary getGateway() {
    return this.gateway;
  }
  
  public void setGateway(HostListSummaryGatewaySummary paramHostListSummaryGatewaySummary) {
    this.gateway = paramHostListSummaryGatewaySummary;
  }
  
  public HostTpmAttestationInfo getTpmAttestation() {
    return this.tpmAttestation;
  }
  
  public void setTpmAttestation(HostTpmAttestationInfo paramHostTpmAttestationInfo) {
    this.tpmAttestation = paramHostTpmAttestationInfo;
  }
}
