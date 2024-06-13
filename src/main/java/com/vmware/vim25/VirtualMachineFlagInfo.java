package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFlagInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFlagInfo", propOrder = {"disableAcceleration", "enableLogging", "useToe", "runWithDebugInfo", "monitorType", "htSharing", "snapshotDisabled", "snapshotLocked", "diskUuidEnabled", "virtualMmuUsage", "virtualExecUsage", "snapshotPowerOffBehavior", "recordReplayEnabled", "faultToleranceType", "cbrcCacheEnabled", "vvtdEnabled", "vbsEnabled"})
public class VirtualMachineFlagInfo extends DynamicData {
  protected Boolean disableAcceleration;
  
  protected Boolean enableLogging;
  
  protected Boolean useToe;
  
  protected Boolean runWithDebugInfo;
  
  protected String monitorType;
  
  protected String htSharing;
  
  protected Boolean snapshotDisabled;
  
  protected Boolean snapshotLocked;
  
  protected Boolean diskUuidEnabled;
  
  protected String virtualMmuUsage;
  
  protected String virtualExecUsage;
  
  protected String snapshotPowerOffBehavior;
  
  protected Boolean recordReplayEnabled;
  
  protected String faultToleranceType;
  
  protected Boolean cbrcCacheEnabled;
  
  protected Boolean vvtdEnabled;
  
  protected Boolean vbsEnabled;
  
  public Boolean isDisableAcceleration() {
    return this.disableAcceleration;
  }
  
  public void setDisableAcceleration(Boolean paramBoolean) {
    this.disableAcceleration = paramBoolean;
  }
  
  public Boolean isEnableLogging() {
    return this.enableLogging;
  }
  
  public void setEnableLogging(Boolean paramBoolean) {
    this.enableLogging = paramBoolean;
  }
  
  public Boolean isUseToe() {
    return this.useToe;
  }
  
  public void setUseToe(Boolean paramBoolean) {
    this.useToe = paramBoolean;
  }
  
  public Boolean isRunWithDebugInfo() {
    return this.runWithDebugInfo;
  }
  
  public void setRunWithDebugInfo(Boolean paramBoolean) {
    this.runWithDebugInfo = paramBoolean;
  }
  
  public String getMonitorType() {
    return this.monitorType;
  }
  
  public void setMonitorType(String paramString) {
    this.monitorType = paramString;
  }
  
  public String getHtSharing() {
    return this.htSharing;
  }
  
  public void setHtSharing(String paramString) {
    this.htSharing = paramString;
  }
  
  public Boolean isSnapshotDisabled() {
    return this.snapshotDisabled;
  }
  
  public void setSnapshotDisabled(Boolean paramBoolean) {
    this.snapshotDisabled = paramBoolean;
  }
  
  public Boolean isSnapshotLocked() {
    return this.snapshotLocked;
  }
  
  public void setSnapshotLocked(Boolean paramBoolean) {
    this.snapshotLocked = paramBoolean;
  }
  
  public Boolean isDiskUuidEnabled() {
    return this.diskUuidEnabled;
  }
  
  public void setDiskUuidEnabled(Boolean paramBoolean) {
    this.diskUuidEnabled = paramBoolean;
  }
  
  public String getVirtualMmuUsage() {
    return this.virtualMmuUsage;
  }
  
  public void setVirtualMmuUsage(String paramString) {
    this.virtualMmuUsage = paramString;
  }
  
  public String getVirtualExecUsage() {
    return this.virtualExecUsage;
  }
  
  public void setVirtualExecUsage(String paramString) {
    this.virtualExecUsage = paramString;
  }
  
  public String getSnapshotPowerOffBehavior() {
    return this.snapshotPowerOffBehavior;
  }
  
  public void setSnapshotPowerOffBehavior(String paramString) {
    this.snapshotPowerOffBehavior = paramString;
  }
  
  public Boolean isRecordReplayEnabled() {
    return this.recordReplayEnabled;
  }
  
  public void setRecordReplayEnabled(Boolean paramBoolean) {
    this.recordReplayEnabled = paramBoolean;
  }
  
  public String getFaultToleranceType() {
    return this.faultToleranceType;
  }
  
  public void setFaultToleranceType(String paramString) {
    this.faultToleranceType = paramString;
  }
  
  public Boolean isCbrcCacheEnabled() {
    return this.cbrcCacheEnabled;
  }
  
  public void setCbrcCacheEnabled(Boolean paramBoolean) {
    this.cbrcCacheEnabled = paramBoolean;
  }
  
  public Boolean isVvtdEnabled() {
    return this.vvtdEnabled;
  }
  
  public void setVvtdEnabled(Boolean paramBoolean) {
    this.vvtdEnabled = paramBoolean;
  }
  
  public Boolean isVbsEnabled() {
    return this.vbsEnabled;
  }
  
  public void setVbsEnabled(Boolean paramBoolean) {
    this.vbsEnabled = paramBoolean;
  }
}
