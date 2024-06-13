package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCapability", propOrder = {"snapshotOperationsSupported", "multipleSnapshotsSupported", "snapshotConfigSupported", "poweredOffSnapshotsSupported", "memorySnapshotsSupported", "revertToSnapshotSupported", "quiescedSnapshotsSupported", "disableSnapshotsSupported", "lockSnapshotsSupported", "consolePreferencesSupported", "cpuFeatureMaskSupported", "s1AcpiManagementSupported", "settingScreenResolutionSupported", "toolsAutoUpdateSupported", "vmNpivWwnSupported", "npivWwnOnNonRdmVmSupported", "vmNpivWwnDisableSupported", "vmNpivWwnUpdateSupported", "swapPlacementSupported", "toolsSyncTimeSupported", "virtualMmuUsageSupported", "diskSharesSupported", "bootOptionsSupported", "bootRetryOptionsSupported", "settingVideoRamSizeSupported", "settingDisplayTopologySupported", "recordReplaySupported", "changeTrackingSupported", "multipleCoresPerSocketSupported", "hostBasedReplicationSupported", "guestAutoLockSupported", "memoryReservationLockSupported", "featureRequirementSupported", "poweredOnMonitorTypeChangeSupported", "seSparseDiskSupported", "nestedHVSupported", "vpmcSupported", "secureBootSupported", "perVmEvcSupported", "virtualMmuUsageIgnored", "virtualExecUsageIgnored", "diskOnlySnapshotOnSuspendedVMSupported"})
public class VirtualMachineCapability extends DynamicData {
  protected boolean snapshotOperationsSupported;
  
  protected boolean multipleSnapshotsSupported;
  
  protected boolean snapshotConfigSupported;
  
  protected boolean poweredOffSnapshotsSupported;
  
  protected boolean memorySnapshotsSupported;
  
  protected boolean revertToSnapshotSupported;
  
  protected boolean quiescedSnapshotsSupported;
  
  protected boolean disableSnapshotsSupported;
  
  protected boolean lockSnapshotsSupported;
  
  protected boolean consolePreferencesSupported;
  
  protected boolean cpuFeatureMaskSupported;
  
  protected boolean s1AcpiManagementSupported;
  
  protected boolean settingScreenResolutionSupported;
  
  protected boolean toolsAutoUpdateSupported;
  
  protected boolean vmNpivWwnSupported;
  
  protected boolean npivWwnOnNonRdmVmSupported;
  
  protected Boolean vmNpivWwnDisableSupported;
  
  protected Boolean vmNpivWwnUpdateSupported;
  
  protected boolean swapPlacementSupported;
  
  protected boolean toolsSyncTimeSupported;
  
  protected boolean virtualMmuUsageSupported;
  
  protected boolean diskSharesSupported;
  
  protected boolean bootOptionsSupported;
  
  protected Boolean bootRetryOptionsSupported;
  
  protected boolean settingVideoRamSizeSupported;
  
  protected Boolean settingDisplayTopologySupported;
  
  protected Boolean recordReplaySupported;
  
  protected Boolean changeTrackingSupported;
  
  protected Boolean multipleCoresPerSocketSupported;
  
  protected Boolean hostBasedReplicationSupported;
  
  protected Boolean guestAutoLockSupported;
  
  protected Boolean memoryReservationLockSupported;
  
  protected Boolean featureRequirementSupported;
  
  protected Boolean poweredOnMonitorTypeChangeSupported;
  
  protected Boolean seSparseDiskSupported;
  
  protected Boolean nestedHVSupported;
  
  @XmlElement(name = "vPMCSupported")
  protected Boolean vpmcSupported;
  
  protected Boolean secureBootSupported;
  
  protected Boolean perVmEvcSupported;
  
  protected Boolean virtualMmuUsageIgnored;
  
  protected Boolean virtualExecUsageIgnored;
  
  protected Boolean diskOnlySnapshotOnSuspendedVMSupported;
  
  public boolean isSnapshotOperationsSupported() {
    return this.snapshotOperationsSupported;
  }
  
  public void setSnapshotOperationsSupported(boolean paramBoolean) {
    this.snapshotOperationsSupported = paramBoolean;
  }
  
  public boolean isMultipleSnapshotsSupported() {
    return this.multipleSnapshotsSupported;
  }
  
  public void setMultipleSnapshotsSupported(boolean paramBoolean) {
    this.multipleSnapshotsSupported = paramBoolean;
  }
  
  public boolean isSnapshotConfigSupported() {
    return this.snapshotConfigSupported;
  }
  
  public void setSnapshotConfigSupported(boolean paramBoolean) {
    this.snapshotConfigSupported = paramBoolean;
  }
  
  public boolean isPoweredOffSnapshotsSupported() {
    return this.poweredOffSnapshotsSupported;
  }
  
  public void setPoweredOffSnapshotsSupported(boolean paramBoolean) {
    this.poweredOffSnapshotsSupported = paramBoolean;
  }
  
  public boolean isMemorySnapshotsSupported() {
    return this.memorySnapshotsSupported;
  }
  
  public void setMemorySnapshotsSupported(boolean paramBoolean) {
    this.memorySnapshotsSupported = paramBoolean;
  }
  
  public boolean isRevertToSnapshotSupported() {
    return this.revertToSnapshotSupported;
  }
  
  public void setRevertToSnapshotSupported(boolean paramBoolean) {
    this.revertToSnapshotSupported = paramBoolean;
  }
  
  public boolean isQuiescedSnapshotsSupported() {
    return this.quiescedSnapshotsSupported;
  }
  
  public void setQuiescedSnapshotsSupported(boolean paramBoolean) {
    this.quiescedSnapshotsSupported = paramBoolean;
  }
  
  public boolean isDisableSnapshotsSupported() {
    return this.disableSnapshotsSupported;
  }
  
  public void setDisableSnapshotsSupported(boolean paramBoolean) {
    this.disableSnapshotsSupported = paramBoolean;
  }
  
  public boolean isLockSnapshotsSupported() {
    return this.lockSnapshotsSupported;
  }
  
  public void setLockSnapshotsSupported(boolean paramBoolean) {
    this.lockSnapshotsSupported = paramBoolean;
  }
  
  public boolean isConsolePreferencesSupported() {
    return this.consolePreferencesSupported;
  }
  
  public void setConsolePreferencesSupported(boolean paramBoolean) {
    this.consolePreferencesSupported = paramBoolean;
  }
  
  public boolean isCpuFeatureMaskSupported() {
    return this.cpuFeatureMaskSupported;
  }
  
  public void setCpuFeatureMaskSupported(boolean paramBoolean) {
    this.cpuFeatureMaskSupported = paramBoolean;
  }
  
  public boolean isS1AcpiManagementSupported() {
    return this.s1AcpiManagementSupported;
  }
  
  public void setS1AcpiManagementSupported(boolean paramBoolean) {
    this.s1AcpiManagementSupported = paramBoolean;
  }
  
  public boolean isSettingScreenResolutionSupported() {
    return this.settingScreenResolutionSupported;
  }
  
  public void setSettingScreenResolutionSupported(boolean paramBoolean) {
    this.settingScreenResolutionSupported = paramBoolean;
  }
  
  public boolean isToolsAutoUpdateSupported() {
    return this.toolsAutoUpdateSupported;
  }
  
  public void setToolsAutoUpdateSupported(boolean paramBoolean) {
    this.toolsAutoUpdateSupported = paramBoolean;
  }
  
  public boolean isVmNpivWwnSupported() {
    return this.vmNpivWwnSupported;
  }
  
  public void setVmNpivWwnSupported(boolean paramBoolean) {
    this.vmNpivWwnSupported = paramBoolean;
  }
  
  public boolean isNpivWwnOnNonRdmVmSupported() {
    return this.npivWwnOnNonRdmVmSupported;
  }
  
  public void setNpivWwnOnNonRdmVmSupported(boolean paramBoolean) {
    this.npivWwnOnNonRdmVmSupported = paramBoolean;
  }
  
  public Boolean isVmNpivWwnDisableSupported() {
    return this.vmNpivWwnDisableSupported;
  }
  
  public void setVmNpivWwnDisableSupported(Boolean paramBoolean) {
    this.vmNpivWwnDisableSupported = paramBoolean;
  }
  
  public Boolean isVmNpivWwnUpdateSupported() {
    return this.vmNpivWwnUpdateSupported;
  }
  
  public void setVmNpivWwnUpdateSupported(Boolean paramBoolean) {
    this.vmNpivWwnUpdateSupported = paramBoolean;
  }
  
  public boolean isSwapPlacementSupported() {
    return this.swapPlacementSupported;
  }
  
  public void setSwapPlacementSupported(boolean paramBoolean) {
    this.swapPlacementSupported = paramBoolean;
  }
  
  public boolean isToolsSyncTimeSupported() {
    return this.toolsSyncTimeSupported;
  }
  
  public void setToolsSyncTimeSupported(boolean paramBoolean) {
    this.toolsSyncTimeSupported = paramBoolean;
  }
  
  public boolean isVirtualMmuUsageSupported() {
    return this.virtualMmuUsageSupported;
  }
  
  public void setVirtualMmuUsageSupported(boolean paramBoolean) {
    this.virtualMmuUsageSupported = paramBoolean;
  }
  
  public boolean isDiskSharesSupported() {
    return this.diskSharesSupported;
  }
  
  public void setDiskSharesSupported(boolean paramBoolean) {
    this.diskSharesSupported = paramBoolean;
  }
  
  public boolean isBootOptionsSupported() {
    return this.bootOptionsSupported;
  }
  
  public void setBootOptionsSupported(boolean paramBoolean) {
    this.bootOptionsSupported = paramBoolean;
  }
  
  public Boolean isBootRetryOptionsSupported() {
    return this.bootRetryOptionsSupported;
  }
  
  public void setBootRetryOptionsSupported(Boolean paramBoolean) {
    this.bootRetryOptionsSupported = paramBoolean;
  }
  
  public boolean isSettingVideoRamSizeSupported() {
    return this.settingVideoRamSizeSupported;
  }
  
  public void setSettingVideoRamSizeSupported(boolean paramBoolean) {
    this.settingVideoRamSizeSupported = paramBoolean;
  }
  
  public Boolean isSettingDisplayTopologySupported() {
    return this.settingDisplayTopologySupported;
  }
  
  public void setSettingDisplayTopologySupported(Boolean paramBoolean) {
    this.settingDisplayTopologySupported = paramBoolean;
  }
  
  public Boolean isRecordReplaySupported() {
    return this.recordReplaySupported;
  }
  
  public void setRecordReplaySupported(Boolean paramBoolean) {
    this.recordReplaySupported = paramBoolean;
  }
  
  public Boolean isChangeTrackingSupported() {
    return this.changeTrackingSupported;
  }
  
  public void setChangeTrackingSupported(Boolean paramBoolean) {
    this.changeTrackingSupported = paramBoolean;
  }
  
  public Boolean isMultipleCoresPerSocketSupported() {
    return this.multipleCoresPerSocketSupported;
  }
  
  public void setMultipleCoresPerSocketSupported(Boolean paramBoolean) {
    this.multipleCoresPerSocketSupported = paramBoolean;
  }
  
  public Boolean isHostBasedReplicationSupported() {
    return this.hostBasedReplicationSupported;
  }
  
  public void setHostBasedReplicationSupported(Boolean paramBoolean) {
    this.hostBasedReplicationSupported = paramBoolean;
  }
  
  public Boolean isGuestAutoLockSupported() {
    return this.guestAutoLockSupported;
  }
  
  public void setGuestAutoLockSupported(Boolean paramBoolean) {
    this.guestAutoLockSupported = paramBoolean;
  }
  
  public Boolean isMemoryReservationLockSupported() {
    return this.memoryReservationLockSupported;
  }
  
  public void setMemoryReservationLockSupported(Boolean paramBoolean) {
    this.memoryReservationLockSupported = paramBoolean;
  }
  
  public Boolean isFeatureRequirementSupported() {
    return this.featureRequirementSupported;
  }
  
  public void setFeatureRequirementSupported(Boolean paramBoolean) {
    this.featureRequirementSupported = paramBoolean;
  }
  
  public Boolean isPoweredOnMonitorTypeChangeSupported() {
    return this.poweredOnMonitorTypeChangeSupported;
  }
  
  public void setPoweredOnMonitorTypeChangeSupported(Boolean paramBoolean) {
    this.poweredOnMonitorTypeChangeSupported = paramBoolean;
  }
  
  public Boolean isSeSparseDiskSupported() {
    return this.seSparseDiskSupported;
  }
  
  public void setSeSparseDiskSupported(Boolean paramBoolean) {
    this.seSparseDiskSupported = paramBoolean;
  }
  
  public Boolean isNestedHVSupported() {
    return this.nestedHVSupported;
  }
  
  public void setNestedHVSupported(Boolean paramBoolean) {
    this.nestedHVSupported = paramBoolean;
  }
  
  public Boolean isVPMCSupported() {
    return this.vpmcSupported;
  }
  
  public void setVPMCSupported(Boolean paramBoolean) {
    this.vpmcSupported = paramBoolean;
  }
  
  public Boolean isSecureBootSupported() {
    return this.secureBootSupported;
  }
  
  public void setSecureBootSupported(Boolean paramBoolean) {
    this.secureBootSupported = paramBoolean;
  }
  
  public Boolean isPerVmEvcSupported() {
    return this.perVmEvcSupported;
  }
  
  public void setPerVmEvcSupported(Boolean paramBoolean) {
    this.perVmEvcSupported = paramBoolean;
  }
  
  public Boolean isVirtualMmuUsageIgnored() {
    return this.virtualMmuUsageIgnored;
  }
  
  public void setVirtualMmuUsageIgnored(Boolean paramBoolean) {
    this.virtualMmuUsageIgnored = paramBoolean;
  }
  
  public Boolean isVirtualExecUsageIgnored() {
    return this.virtualExecUsageIgnored;
  }
  
  public void setVirtualExecUsageIgnored(Boolean paramBoolean) {
    this.virtualExecUsageIgnored = paramBoolean;
  }
  
  public Boolean isDiskOnlySnapshotOnSuspendedVMSupported() {
    return this.diskOnlySnapshotOnSuspendedVMSupported;
  }
  
  public void setDiskOnlySnapshotOnSuspendedVMSupported(Boolean paramBoolean) {
    this.diskOnlySnapshotOnSuspendedVMSupported = paramBoolean;
  }
}
