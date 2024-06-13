package com.vmware.vim25;

import com.vmware.vim25.ClusterVmToolsMonitoringSettings;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmToolsMonitoringSettings", propOrder = {"enabled", "vmMonitoring", "clusterSettings", "failureInterval", "minUpTime", "maxFailures", "maxFailureWindow"})
public class ClusterVmToolsMonitoringSettings extends DynamicData {
  protected Boolean enabled;
  
  protected String vmMonitoring;
  
  protected Boolean clusterSettings;
  
  protected Integer failureInterval;
  
  protected Integer minUpTime;
  
  protected Integer maxFailures;
  
  protected Integer maxFailureWindow;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getVmMonitoring() {
    return this.vmMonitoring;
  }
  
  public void setVmMonitoring(String paramString) {
    this.vmMonitoring = paramString;
  }
  
  public Boolean isClusterSettings() {
    return this.clusterSettings;
  }
  
  public void setClusterSettings(Boolean paramBoolean) {
    this.clusterSettings = paramBoolean;
  }
  
  public Integer getFailureInterval() {
    return this.failureInterval;
  }
  
  public void setFailureInterval(Integer paramInteger) {
    this.failureInterval = paramInteger;
  }
  
  public Integer getMinUpTime() {
    return this.minUpTime;
  }
  
  public void setMinUpTime(Integer paramInteger) {
    this.minUpTime = paramInteger;
  }
  
  public Integer getMaxFailures() {
    return this.maxFailures;
  }
  
  public void setMaxFailures(Integer paramInteger) {
    this.maxFailures = paramInteger;
  }
  
  public Integer getMaxFailureWindow() {
    return this.maxFailureWindow;
  }
  
  public void setMaxFailureWindow(Integer paramInteger) {
    this.maxFailureWindow = paramInteger;
  }
}
