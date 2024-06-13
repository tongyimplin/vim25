package com.vmware.vim25;

import com.vmware.vim25.ClusterDasVmSettings;
import com.vmware.vim25.ClusterVmComponentProtectionSettings;
import com.vmware.vim25.ClusterVmToolsMonitoringSettings;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmSettings", propOrder = {"restartPriority", "restartPriorityTimeout", "isolationResponse", "vmToolsMonitoringSettings", "vmComponentProtectionSettings"})
public class ClusterDasVmSettings extends DynamicData {
  protected String restartPriority;
  
  protected Integer restartPriorityTimeout;
  
  protected String isolationResponse;
  
  protected ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings;
  
  protected ClusterVmComponentProtectionSettings vmComponentProtectionSettings;
  
  public String getRestartPriority() {
    return this.restartPriority;
  }
  
  public void setRestartPriority(String paramString) {
    this.restartPriority = paramString;
  }
  
  public Integer getRestartPriorityTimeout() {
    return this.restartPriorityTimeout;
  }
  
  public void setRestartPriorityTimeout(Integer paramInteger) {
    this.restartPriorityTimeout = paramInteger;
  }
  
  public String getIsolationResponse() {
    return this.isolationResponse;
  }
  
  public void setIsolationResponse(String paramString) {
    this.isolationResponse = paramString;
  }
  
  public ClusterVmToolsMonitoringSettings getVmToolsMonitoringSettings() {
    return this.vmToolsMonitoringSettings;
  }
  
  public void setVmToolsMonitoringSettings(ClusterVmToolsMonitoringSettings paramClusterVmToolsMonitoringSettings) {
    this.vmToolsMonitoringSettings = paramClusterVmToolsMonitoringSettings;
  }
  
  public ClusterVmComponentProtectionSettings getVmComponentProtectionSettings() {
    return this.vmComponentProtectionSettings;
  }
  
  public void setVmComponentProtectionSettings(ClusterVmComponentProtectionSettings paramClusterVmComponentProtectionSettings) {
    this.vmComponentProtectionSettings = paramClusterVmComponentProtectionSettings;
  }
}
