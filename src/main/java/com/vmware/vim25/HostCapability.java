package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCapability;
import com.vmware.vim25.HostCpuIdInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCapability", propOrder = {"recursiveResourcePoolsSupported", "cpuMemoryResourceConfigurationSupported", "rebootSupported", "shutdownSupported", "vmotionSupported", "standbySupported", "ipmiSupported", "maxSupportedVMs", "maxRunningVMs", "maxSupportedVcpus", "maxRegisteredVMs", "datastorePrincipalSupported", "sanSupported", "nfsSupported", "iscsiSupported", "vlanTaggingSupported", "nicTeamingSupported", "highGuestMemSupported", "maintenanceModeSupported", "suspendedRelocateSupported", "restrictedSnapshotRelocateSupported", "perVmSwapFiles", "localSwapDatastoreSupported", "unsharedSwapVMotionSupported", "backgroundSnapshotsSupported", "preAssignedPCIUnitNumbersSupported", "screenshotSupported", "scaledScreenshotSupported", "storageVMotionSupported", "vmotionWithStorageVMotionSupported", "vmotionAcrossNetworkSupported", "maxNumDisksSVMotion", "hbrNicSelectionSupported", "vrNfcNicSelectionSupported", "recordReplaySupported", "ftSupported", "replayUnsupportedReason", "replayCompatibilityIssues", "smpFtSupported", "ftCompatibilityIssues", "smpFtCompatibilityIssues", "maxVcpusPerFtVm", "loginBySSLThumbprintSupported", "cloneFromSnapshotSupported", "deltaDiskBackingsSupported", "perVMNetworkTrafficShapingSupported", "tpmSupported", "tpmVersion", "txtEnabled", "supportedCpuFeature", "virtualExecUsageSupported", "storageIORMSupported", "vmDirectPathGen2Supported", "vmDirectPathGen2UnsupportedReason", "vmDirectPathGen2UnsupportedReasonExtended", "supportedVmfsMajorVersion", "vStorageCapable", "snapshotRelayoutSupported", "firewallIpRulesSupported", "servicePackageInfoSupported", "maxHostRunningVms", "maxHostSupportedVcpus", "vmfsDatastoreMountCapable", "eightPlusHostVmfsSharedAccessSupported", "nestedHVSupported", "vpmcSupported", "interVMCommunicationThroughVMCISupported", "scheduledHardwareUpgradeSupported", "featureCapabilitiesSupported", "latencySensitivitySupported", "storagePolicySupported", "accel3DSupported", "reliableMemoryAware", "multipleNetworkStackInstanceSupported", "messageBusProxySupported", "vsanSupported", "vFlashSupported", "hostAccessManagerSupported", "provisioningNicSelectionSupported", "nfs41Supported", "nfs41Krb5ISupported", "turnDiskLocatorLedSupported", "virtualVolumeDatastoreSupported", "markAsSsdSupported", "markAsLocalSupported", "smartCardAuthenticationSupported", "pMemSupported", "pMemSnapshotSupported", "cryptoSupported", "oneKVolumeAPIsSupported", "gatewayOnNicSupported", "upitSupported", "cpuHwMmuSupported", "encryptedVMotionSupported", "encryptionChangeOnAddRemoveSupported", "encryptionHotOperationSupported", "encryptionWithSnapshotsSupported", "encryptionFaultToleranceSupported", "encryptionMemorySaveSupported", "encryptionRDMSupported", "encryptionVFlashSupported", "encryptionCBRCSupported", "encryptionHBRSupported", "ftEfiSupported", "unmapMethodSupported", "maxMemMBPerFtVm", "virtualMmuUsageIgnored", "virtualExecUsageIgnored", "vmCreateDateSupported", "vmfs3EOLSupported", "ftVmcpSupported", "quickBootSupported", "assignableHardwareSupported", "useFeatureReqsForOldHWv", "markPerenniallyReservedSupported", "hppPspSupported", "deviceRebindWithoutRebootSupported", "storagePolicyChangeSupported", "precisionTimeProtocolSupported", "remoteDeviceVMotionSupported", "maxSupportedVmMemory"})
public class HostCapability extends DynamicData {
  protected boolean recursiveResourcePoolsSupported;
  
  protected boolean cpuMemoryResourceConfigurationSupported;
  
  protected boolean rebootSupported;
  
  protected boolean shutdownSupported;
  
  protected boolean vmotionSupported;
  
  protected boolean standbySupported;
  
  protected Boolean ipmiSupported;
  
  protected Integer maxSupportedVMs;
  
  protected Integer maxRunningVMs;
  
  protected Integer maxSupportedVcpus;
  
  protected Integer maxRegisteredVMs;
  
  protected boolean datastorePrincipalSupported;
  
  protected boolean sanSupported;
  
  protected boolean nfsSupported;
  
  protected boolean iscsiSupported;
  
  protected boolean vlanTaggingSupported;
  
  protected boolean nicTeamingSupported;
  
  protected boolean highGuestMemSupported;
  
  protected boolean maintenanceModeSupported;
  
  protected boolean suspendedRelocateSupported;
  
  protected boolean restrictedSnapshotRelocateSupported;
  
  protected boolean perVmSwapFiles;
  
  protected boolean localSwapDatastoreSupported;
  
  protected boolean unsharedSwapVMotionSupported;
  
  protected boolean backgroundSnapshotsSupported;
  
  protected boolean preAssignedPCIUnitNumbersSupported;
  
  protected boolean screenshotSupported;
  
  protected boolean scaledScreenshotSupported;
  
  protected Boolean storageVMotionSupported;
  
  protected Boolean vmotionWithStorageVMotionSupported;
  
  protected Boolean vmotionAcrossNetworkSupported;
  
  protected Integer maxNumDisksSVMotion;
  
  protected Boolean hbrNicSelectionSupported;
  
  protected Boolean vrNfcNicSelectionSupported;
  
  protected Boolean recordReplaySupported;
  
  protected Boolean ftSupported;
  
  protected String replayUnsupportedReason;
  
  protected List<String> replayCompatibilityIssues;
  
  protected Boolean smpFtSupported;
  
  protected List<String> ftCompatibilityIssues;
  
  protected List<String> smpFtCompatibilityIssues;
  
  protected Integer maxVcpusPerFtVm;
  
  protected Boolean loginBySSLThumbprintSupported;
  
  protected Boolean cloneFromSnapshotSupported;
  
  protected Boolean deltaDiskBackingsSupported;
  
  protected Boolean perVMNetworkTrafficShapingSupported;
  
  protected Boolean tpmSupported;
  
  protected String tpmVersion;
  
  protected Boolean txtEnabled;
  
  protected List<HostCpuIdInfo> supportedCpuFeature;
  
  protected Boolean virtualExecUsageSupported;
  
  protected Boolean storageIORMSupported;
  
  protected Boolean vmDirectPathGen2Supported;
  
  protected List<String> vmDirectPathGen2UnsupportedReason;
  
  protected String vmDirectPathGen2UnsupportedReasonExtended;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> supportedVmfsMajorVersion;
  
  protected Boolean vStorageCapable;
  
  protected Boolean snapshotRelayoutSupported;
  
  protected Boolean firewallIpRulesSupported;
  
  protected Boolean servicePackageInfoSupported;
  
  protected Integer maxHostRunningVms;
  
  protected Integer maxHostSupportedVcpus;
  
  protected Boolean vmfsDatastoreMountCapable;
  
  protected Boolean eightPlusHostVmfsSharedAccessSupported;
  
  protected Boolean nestedHVSupported;
  
  @XmlElement(name = "vPMCSupported")
  protected Boolean vpmcSupported;
  
  protected Boolean interVMCommunicationThroughVMCISupported;
  
  protected Boolean scheduledHardwareUpgradeSupported;
  
  protected Boolean featureCapabilitiesSupported;
  
  protected Boolean latencySensitivitySupported;
  
  protected Boolean storagePolicySupported;
  
  @XmlElement(name = "accel3dSupported")
  protected Boolean accel3DSupported;
  
  protected Boolean reliableMemoryAware;
  
  protected Boolean multipleNetworkStackInstanceSupported;
  
  protected Boolean messageBusProxySupported;
  
  protected Boolean vsanSupported;
  
  protected Boolean vFlashSupported;
  
  protected Boolean hostAccessManagerSupported;
  
  protected Boolean provisioningNicSelectionSupported;
  
  protected Boolean nfs41Supported;
  
  @XmlElement(name = "nfs41Krb5iSupported")
  protected Boolean nfs41Krb5ISupported;
  
  protected Boolean turnDiskLocatorLedSupported;
  
  protected Boolean virtualVolumeDatastoreSupported;
  
  protected Boolean markAsSsdSupported;
  
  protected Boolean markAsLocalSupported;
  
  protected Boolean smartCardAuthenticationSupported;
  
  protected Boolean pMemSupported;
  
  protected Boolean pMemSnapshotSupported;
  
  protected Boolean cryptoSupported;
  
  protected Boolean oneKVolumeAPIsSupported;
  
  protected Boolean gatewayOnNicSupported;
  
  protected Boolean upitSupported;
  
  protected Boolean cpuHwMmuSupported;
  
  protected Boolean encryptedVMotionSupported;
  
  protected Boolean encryptionChangeOnAddRemoveSupported;
  
  protected Boolean encryptionHotOperationSupported;
  
  protected Boolean encryptionWithSnapshotsSupported;
  
  protected Boolean encryptionFaultToleranceSupported;
  
  protected Boolean encryptionMemorySaveSupported;
  
  protected Boolean encryptionRDMSupported;
  
  protected Boolean encryptionVFlashSupported;
  
  protected Boolean encryptionCBRCSupported;
  
  protected Boolean encryptionHBRSupported;
  
  protected Boolean ftEfiSupported;
  
  protected String unmapMethodSupported;
  
  protected Integer maxMemMBPerFtVm;
  
  protected Boolean virtualMmuUsageIgnored;
  
  protected Boolean virtualExecUsageIgnored;
  
  protected Boolean vmCreateDateSupported;
  
  protected Boolean vmfs3EOLSupported;
  
  protected Boolean ftVmcpSupported;
  
  protected Boolean quickBootSupported;
  
  protected Boolean assignableHardwareSupported;
  
  protected Boolean useFeatureReqsForOldHWv;
  
  protected Boolean markPerenniallyReservedSupported;
  
  protected Boolean hppPspSupported;
  
  protected Boolean deviceRebindWithoutRebootSupported;
  
  protected Boolean storagePolicyChangeSupported;
  
  protected Boolean precisionTimeProtocolSupported;
  
  protected Boolean remoteDeviceVMotionSupported;
  
  protected Integer maxSupportedVmMemory;
  
  public boolean isRecursiveResourcePoolsSupported() {
    return this.recursiveResourcePoolsSupported;
  }
  
  public void setRecursiveResourcePoolsSupported(boolean paramBoolean) {
    this.recursiveResourcePoolsSupported = paramBoolean;
  }
  
  public boolean isCpuMemoryResourceConfigurationSupported() {
    return this.cpuMemoryResourceConfigurationSupported;
  }
  
  public void setCpuMemoryResourceConfigurationSupported(boolean paramBoolean) {
    this.cpuMemoryResourceConfigurationSupported = paramBoolean;
  }
  
  public boolean isRebootSupported() {
    return this.rebootSupported;
  }
  
  public void setRebootSupported(boolean paramBoolean) {
    this.rebootSupported = paramBoolean;
  }
  
  public boolean isShutdownSupported() {
    return this.shutdownSupported;
  }
  
  public void setShutdownSupported(boolean paramBoolean) {
    this.shutdownSupported = paramBoolean;
  }
  
  public boolean isVmotionSupported() {
    return this.vmotionSupported;
  }
  
  public void setVmotionSupported(boolean paramBoolean) {
    this.vmotionSupported = paramBoolean;
  }
  
  public boolean isStandbySupported() {
    return this.standbySupported;
  }
  
  public void setStandbySupported(boolean paramBoolean) {
    this.standbySupported = paramBoolean;
  }
  
  public Boolean isIpmiSupported() {
    return this.ipmiSupported;
  }
  
  public void setIpmiSupported(Boolean paramBoolean) {
    this.ipmiSupported = paramBoolean;
  }
  
  public Integer getMaxSupportedVMs() {
    return this.maxSupportedVMs;
  }
  
  public void setMaxSupportedVMs(Integer paramInteger) {
    this.maxSupportedVMs = paramInteger;
  }
  
  public Integer getMaxRunningVMs() {
    return this.maxRunningVMs;
  }
  
  public void setMaxRunningVMs(Integer paramInteger) {
    this.maxRunningVMs = paramInteger;
  }
  
  public Integer getMaxSupportedVcpus() {
    return this.maxSupportedVcpus;
  }
  
  public void setMaxSupportedVcpus(Integer paramInteger) {
    this.maxSupportedVcpus = paramInteger;
  }
  
  public Integer getMaxRegisteredVMs() {
    return this.maxRegisteredVMs;
  }
  
  public void setMaxRegisteredVMs(Integer paramInteger) {
    this.maxRegisteredVMs = paramInteger;
  }
  
  public boolean isDatastorePrincipalSupported() {
    return this.datastorePrincipalSupported;
  }
  
  public void setDatastorePrincipalSupported(boolean paramBoolean) {
    this.datastorePrincipalSupported = paramBoolean;
  }
  
  public boolean isSanSupported() {
    return this.sanSupported;
  }
  
  public void setSanSupported(boolean paramBoolean) {
    this.sanSupported = paramBoolean;
  }
  
  public boolean isNfsSupported() {
    return this.nfsSupported;
  }
  
  public void setNfsSupported(boolean paramBoolean) {
    this.nfsSupported = paramBoolean;
  }
  
  public boolean isIscsiSupported() {
    return this.iscsiSupported;
  }
  
  public void setIscsiSupported(boolean paramBoolean) {
    this.iscsiSupported = paramBoolean;
  }
  
  public boolean isVlanTaggingSupported() {
    return this.vlanTaggingSupported;
  }
  
  public void setVlanTaggingSupported(boolean paramBoolean) {
    this.vlanTaggingSupported = paramBoolean;
  }
  
  public boolean isNicTeamingSupported() {
    return this.nicTeamingSupported;
  }
  
  public void setNicTeamingSupported(boolean paramBoolean) {
    this.nicTeamingSupported = paramBoolean;
  }
  
  public boolean isHighGuestMemSupported() {
    return this.highGuestMemSupported;
  }
  
  public void setHighGuestMemSupported(boolean paramBoolean) {
    this.highGuestMemSupported = paramBoolean;
  }
  
  public boolean isMaintenanceModeSupported() {
    return this.maintenanceModeSupported;
  }
  
  public void setMaintenanceModeSupported(boolean paramBoolean) {
    this.maintenanceModeSupported = paramBoolean;
  }
  
  public boolean isSuspendedRelocateSupported() {
    return this.suspendedRelocateSupported;
  }
  
  public void setSuspendedRelocateSupported(boolean paramBoolean) {
    this.suspendedRelocateSupported = paramBoolean;
  }
  
  public boolean isRestrictedSnapshotRelocateSupported() {
    return this.restrictedSnapshotRelocateSupported;
  }
  
  public void setRestrictedSnapshotRelocateSupported(boolean paramBoolean) {
    this.restrictedSnapshotRelocateSupported = paramBoolean;
  }
  
  public boolean isPerVmSwapFiles() {
    return this.perVmSwapFiles;
  }
  
  public void setPerVmSwapFiles(boolean paramBoolean) {
    this.perVmSwapFiles = paramBoolean;
  }
  
  public boolean isLocalSwapDatastoreSupported() {
    return this.localSwapDatastoreSupported;
  }
  
  public void setLocalSwapDatastoreSupported(boolean paramBoolean) {
    this.localSwapDatastoreSupported = paramBoolean;
  }
  
  public boolean isUnsharedSwapVMotionSupported() {
    return this.unsharedSwapVMotionSupported;
  }
  
  public void setUnsharedSwapVMotionSupported(boolean paramBoolean) {
    this.unsharedSwapVMotionSupported = paramBoolean;
  }
  
  public boolean isBackgroundSnapshotsSupported() {
    return this.backgroundSnapshotsSupported;
  }
  
  public void setBackgroundSnapshotsSupported(boolean paramBoolean) {
    this.backgroundSnapshotsSupported = paramBoolean;
  }
  
  public boolean isPreAssignedPCIUnitNumbersSupported() {
    return this.preAssignedPCIUnitNumbersSupported;
  }
  
  public void setPreAssignedPCIUnitNumbersSupported(boolean paramBoolean) {
    this.preAssignedPCIUnitNumbersSupported = paramBoolean;
  }
  
  public boolean isScreenshotSupported() {
    return this.screenshotSupported;
  }
  
  public void setScreenshotSupported(boolean paramBoolean) {
    this.screenshotSupported = paramBoolean;
  }
  
  public boolean isScaledScreenshotSupported() {
    return this.scaledScreenshotSupported;
  }
  
  public void setScaledScreenshotSupported(boolean paramBoolean) {
    this.scaledScreenshotSupported = paramBoolean;
  }
  
  public Boolean isStorageVMotionSupported() {
    return this.storageVMotionSupported;
  }
  
  public void setStorageVMotionSupported(Boolean paramBoolean) {
    this.storageVMotionSupported = paramBoolean;
  }
  
  public Boolean isVmotionWithStorageVMotionSupported() {
    return this.vmotionWithStorageVMotionSupported;
  }
  
  public void setVmotionWithStorageVMotionSupported(Boolean paramBoolean) {
    this.vmotionWithStorageVMotionSupported = paramBoolean;
  }
  
  public Boolean isVmotionAcrossNetworkSupported() {
    return this.vmotionAcrossNetworkSupported;
  }
  
  public void setVmotionAcrossNetworkSupported(Boolean paramBoolean) {
    this.vmotionAcrossNetworkSupported = paramBoolean;
  }
  
  public Integer getMaxNumDisksSVMotion() {
    return this.maxNumDisksSVMotion;
  }
  
  public void setMaxNumDisksSVMotion(Integer paramInteger) {
    this.maxNumDisksSVMotion = paramInteger;
  }
  
  public Boolean isHbrNicSelectionSupported() {
    return this.hbrNicSelectionSupported;
  }
  
  public void setHbrNicSelectionSupported(Boolean paramBoolean) {
    this.hbrNicSelectionSupported = paramBoolean;
  }
  
  public Boolean isVrNfcNicSelectionSupported() {
    return this.vrNfcNicSelectionSupported;
  }
  
  public void setVrNfcNicSelectionSupported(Boolean paramBoolean) {
    this.vrNfcNicSelectionSupported = paramBoolean;
  }
  
  public Boolean isRecordReplaySupported() {
    return this.recordReplaySupported;
  }
  
  public void setRecordReplaySupported(Boolean paramBoolean) {
    this.recordReplaySupported = paramBoolean;
  }
  
  public Boolean isFtSupported() {
    return this.ftSupported;
  }
  
  public void setFtSupported(Boolean paramBoolean) {
    this.ftSupported = paramBoolean;
  }
  
  public String getReplayUnsupportedReason() {
    return this.replayUnsupportedReason;
  }
  
  public void setReplayUnsupportedReason(String paramString) {
    this.replayUnsupportedReason = paramString;
  }
  
  public List<String> getReplayCompatibilityIssues() {
    if (this.replayCompatibilityIssues == null)
      this.replayCompatibilityIssues = new ArrayList<>(); 
    return this.replayCompatibilityIssues;
  }
  
  public Boolean isSmpFtSupported() {
    return this.smpFtSupported;
  }
  
  public void setSmpFtSupported(Boolean paramBoolean) {
    this.smpFtSupported = paramBoolean;
  }
  
  public List<String> getFtCompatibilityIssues() {
    if (this.ftCompatibilityIssues == null)
      this.ftCompatibilityIssues = new ArrayList<>(); 
    return this.ftCompatibilityIssues;
  }
  
  public List<String> getSmpFtCompatibilityIssues() {
    if (this.smpFtCompatibilityIssues == null)
      this.smpFtCompatibilityIssues = new ArrayList<>(); 
    return this.smpFtCompatibilityIssues;
  }
  
  public Integer getMaxVcpusPerFtVm() {
    return this.maxVcpusPerFtVm;
  }
  
  public void setMaxVcpusPerFtVm(Integer paramInteger) {
    this.maxVcpusPerFtVm = paramInteger;
  }
  
  public Boolean isLoginBySSLThumbprintSupported() {
    return this.loginBySSLThumbprintSupported;
  }
  
  public void setLoginBySSLThumbprintSupported(Boolean paramBoolean) {
    this.loginBySSLThumbprintSupported = paramBoolean;
  }
  
  public Boolean isCloneFromSnapshotSupported() {
    return this.cloneFromSnapshotSupported;
  }
  
  public void setCloneFromSnapshotSupported(Boolean paramBoolean) {
    this.cloneFromSnapshotSupported = paramBoolean;
  }
  
  public Boolean isDeltaDiskBackingsSupported() {
    return this.deltaDiskBackingsSupported;
  }
  
  public void setDeltaDiskBackingsSupported(Boolean paramBoolean) {
    this.deltaDiskBackingsSupported = paramBoolean;
  }
  
  public Boolean isPerVMNetworkTrafficShapingSupported() {
    return this.perVMNetworkTrafficShapingSupported;
  }
  
  public void setPerVMNetworkTrafficShapingSupported(Boolean paramBoolean) {
    this.perVMNetworkTrafficShapingSupported = paramBoolean;
  }
  
  public Boolean isTpmSupported() {
    return this.tpmSupported;
  }
  
  public void setTpmSupported(Boolean paramBoolean) {
    this.tpmSupported = paramBoolean;
  }
  
  public String getTpmVersion() {
    return this.tpmVersion;
  }
  
  public void setTpmVersion(String paramString) {
    this.tpmVersion = paramString;
  }
  
  public Boolean isTxtEnabled() {
    return this.txtEnabled;
  }
  
  public void setTxtEnabled(Boolean paramBoolean) {
    this.txtEnabled = paramBoolean;
  }
  
  public List<HostCpuIdInfo> getSupportedCpuFeature() {
    if (this.supportedCpuFeature == null)
      this.supportedCpuFeature = new ArrayList<>(); 
    return this.supportedCpuFeature;
  }
  
  public Boolean isVirtualExecUsageSupported() {
    return this.virtualExecUsageSupported;
  }
  
  public void setVirtualExecUsageSupported(Boolean paramBoolean) {
    this.virtualExecUsageSupported = paramBoolean;
  }
  
  public Boolean isStorageIORMSupported() {
    return this.storageIORMSupported;
  }
  
  public void setStorageIORMSupported(Boolean paramBoolean) {
    this.storageIORMSupported = paramBoolean;
  }
  
  public Boolean isVmDirectPathGen2Supported() {
    return this.vmDirectPathGen2Supported;
  }
  
  public void setVmDirectPathGen2Supported(Boolean paramBoolean) {
    this.vmDirectPathGen2Supported = paramBoolean;
  }
  
  public List<String> getVmDirectPathGen2UnsupportedReason() {
    if (this.vmDirectPathGen2UnsupportedReason == null)
      this.vmDirectPathGen2UnsupportedReason = new ArrayList<>(); 
    return this.vmDirectPathGen2UnsupportedReason;
  }
  
  public String getVmDirectPathGen2UnsupportedReasonExtended() {
    return this.vmDirectPathGen2UnsupportedReasonExtended;
  }
  
  public void setVmDirectPathGen2UnsupportedReasonExtended(String paramString) {
    this.vmDirectPathGen2UnsupportedReasonExtended = paramString;
  }
  
  public List<Integer> getSupportedVmfsMajorVersion() {
    if (this.supportedVmfsMajorVersion == null)
      this.supportedVmfsMajorVersion = new ArrayList<>(); 
    return this.supportedVmfsMajorVersion;
  }
  
  public Boolean isVStorageCapable() {
    return this.vStorageCapable;
  }
  
  public void setVStorageCapable(Boolean paramBoolean) {
    this.vStorageCapable = paramBoolean;
  }
  
  public Boolean isSnapshotRelayoutSupported() {
    return this.snapshotRelayoutSupported;
  }
  
  public void setSnapshotRelayoutSupported(Boolean paramBoolean) {
    this.snapshotRelayoutSupported = paramBoolean;
  }
  
  public Boolean isFirewallIpRulesSupported() {
    return this.firewallIpRulesSupported;
  }
  
  public void setFirewallIpRulesSupported(Boolean paramBoolean) {
    this.firewallIpRulesSupported = paramBoolean;
  }
  
  public Boolean isServicePackageInfoSupported() {
    return this.servicePackageInfoSupported;
  }
  
  public void setServicePackageInfoSupported(Boolean paramBoolean) {
    this.servicePackageInfoSupported = paramBoolean;
  }
  
  public Integer getMaxHostRunningVms() {
    return this.maxHostRunningVms;
  }
  
  public void setMaxHostRunningVms(Integer paramInteger) {
    this.maxHostRunningVms = paramInteger;
  }
  
  public Integer getMaxHostSupportedVcpus() {
    return this.maxHostSupportedVcpus;
  }
  
  public void setMaxHostSupportedVcpus(Integer paramInteger) {
    this.maxHostSupportedVcpus = paramInteger;
  }
  
  public Boolean isVmfsDatastoreMountCapable() {
    return this.vmfsDatastoreMountCapable;
  }
  
  public void setVmfsDatastoreMountCapable(Boolean paramBoolean) {
    this.vmfsDatastoreMountCapable = paramBoolean;
  }
  
  public Boolean isEightPlusHostVmfsSharedAccessSupported() {
    return this.eightPlusHostVmfsSharedAccessSupported;
  }
  
  public void setEightPlusHostVmfsSharedAccessSupported(Boolean paramBoolean) {
    this.eightPlusHostVmfsSharedAccessSupported = paramBoolean;
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
  
  public Boolean isInterVMCommunicationThroughVMCISupported() {
    return this.interVMCommunicationThroughVMCISupported;
  }
  
  public void setInterVMCommunicationThroughVMCISupported(Boolean paramBoolean) {
    this.interVMCommunicationThroughVMCISupported = paramBoolean;
  }
  
  public Boolean isScheduledHardwareUpgradeSupported() {
    return this.scheduledHardwareUpgradeSupported;
  }
  
  public void setScheduledHardwareUpgradeSupported(Boolean paramBoolean) {
    this.scheduledHardwareUpgradeSupported = paramBoolean;
  }
  
  public Boolean isFeatureCapabilitiesSupported() {
    return this.featureCapabilitiesSupported;
  }
  
  public void setFeatureCapabilitiesSupported(Boolean paramBoolean) {
    this.featureCapabilitiesSupported = paramBoolean;
  }
  
  public Boolean isLatencySensitivitySupported() {
    return this.latencySensitivitySupported;
  }
  
  public void setLatencySensitivitySupported(Boolean paramBoolean) {
    this.latencySensitivitySupported = paramBoolean;
  }
  
  public Boolean isStoragePolicySupported() {
    return this.storagePolicySupported;
  }
  
  public void setStoragePolicySupported(Boolean paramBoolean) {
    this.storagePolicySupported = paramBoolean;
  }
  
  public Boolean isAccel3DSupported() {
    return this.accel3DSupported;
  }
  
  public void setAccel3DSupported(Boolean paramBoolean) {
    this.accel3DSupported = paramBoolean;
  }
  
  public Boolean isReliableMemoryAware() {
    return this.reliableMemoryAware;
  }
  
  public void setReliableMemoryAware(Boolean paramBoolean) {
    this.reliableMemoryAware = paramBoolean;
  }
  
  public Boolean isMultipleNetworkStackInstanceSupported() {
    return this.multipleNetworkStackInstanceSupported;
  }
  
  public void setMultipleNetworkStackInstanceSupported(Boolean paramBoolean) {
    this.multipleNetworkStackInstanceSupported = paramBoolean;
  }
  
  public Boolean isMessageBusProxySupported() {
    return this.messageBusProxySupported;
  }
  
  public void setMessageBusProxySupported(Boolean paramBoolean) {
    this.messageBusProxySupported = paramBoolean;
  }
  
  public Boolean isVsanSupported() {
    return this.vsanSupported;
  }
  
  public void setVsanSupported(Boolean paramBoolean) {
    this.vsanSupported = paramBoolean;
  }
  
  public Boolean isVFlashSupported() {
    return this.vFlashSupported;
  }
  
  public void setVFlashSupported(Boolean paramBoolean) {
    this.vFlashSupported = paramBoolean;
  }
  
  public Boolean isHostAccessManagerSupported() {
    return this.hostAccessManagerSupported;
  }
  
  public void setHostAccessManagerSupported(Boolean paramBoolean) {
    this.hostAccessManagerSupported = paramBoolean;
  }
  
  public Boolean isProvisioningNicSelectionSupported() {
    return this.provisioningNicSelectionSupported;
  }
  
  public void setProvisioningNicSelectionSupported(Boolean paramBoolean) {
    this.provisioningNicSelectionSupported = paramBoolean;
  }
  
  public Boolean isNfs41Supported() {
    return this.nfs41Supported;
  }
  
  public void setNfs41Supported(Boolean paramBoolean) {
    this.nfs41Supported = paramBoolean;
  }
  
  public Boolean isNfs41Krb5ISupported() {
    return this.nfs41Krb5ISupported;
  }
  
  public void setNfs41Krb5ISupported(Boolean paramBoolean) {
    this.nfs41Krb5ISupported = paramBoolean;
  }
  
  public Boolean isTurnDiskLocatorLedSupported() {
    return this.turnDiskLocatorLedSupported;
  }
  
  public void setTurnDiskLocatorLedSupported(Boolean paramBoolean) {
    this.turnDiskLocatorLedSupported = paramBoolean;
  }
  
  public Boolean isVirtualVolumeDatastoreSupported() {
    return this.virtualVolumeDatastoreSupported;
  }
  
  public void setVirtualVolumeDatastoreSupported(Boolean paramBoolean) {
    this.virtualVolumeDatastoreSupported = paramBoolean;
  }
  
  public Boolean isMarkAsSsdSupported() {
    return this.markAsSsdSupported;
  }
  
  public void setMarkAsSsdSupported(Boolean paramBoolean) {
    this.markAsSsdSupported = paramBoolean;
  }
  
  public Boolean isMarkAsLocalSupported() {
    return this.markAsLocalSupported;
  }
  
  public void setMarkAsLocalSupported(Boolean paramBoolean) {
    this.markAsLocalSupported = paramBoolean;
  }
  
  public Boolean isSmartCardAuthenticationSupported() {
    return this.smartCardAuthenticationSupported;
  }
  
  public void setSmartCardAuthenticationSupported(Boolean paramBoolean) {
    this.smartCardAuthenticationSupported = paramBoolean;
  }
  
  public Boolean isPMemSupported() {
    return this.pMemSupported;
  }
  
  public void setPMemSupported(Boolean paramBoolean) {
    this.pMemSupported = paramBoolean;
  }
  
  public Boolean isPMemSnapshotSupported() {
    return this.pMemSnapshotSupported;
  }
  
  public void setPMemSnapshotSupported(Boolean paramBoolean) {
    this.pMemSnapshotSupported = paramBoolean;
  }
  
  public Boolean isCryptoSupported() {
    return this.cryptoSupported;
  }
  
  public void setCryptoSupported(Boolean paramBoolean) {
    this.cryptoSupported = paramBoolean;
  }
  
  public Boolean isOneKVolumeAPIsSupported() {
    return this.oneKVolumeAPIsSupported;
  }
  
  public void setOneKVolumeAPIsSupported(Boolean paramBoolean) {
    this.oneKVolumeAPIsSupported = paramBoolean;
  }
  
  public Boolean isGatewayOnNicSupported() {
    return this.gatewayOnNicSupported;
  }
  
  public void setGatewayOnNicSupported(Boolean paramBoolean) {
    this.gatewayOnNicSupported = paramBoolean;
  }
  
  public Boolean isUpitSupported() {
    return this.upitSupported;
  }
  
  public void setUpitSupported(Boolean paramBoolean) {
    this.upitSupported = paramBoolean;
  }
  
  public Boolean isCpuHwMmuSupported() {
    return this.cpuHwMmuSupported;
  }
  
  public void setCpuHwMmuSupported(Boolean paramBoolean) {
    this.cpuHwMmuSupported = paramBoolean;
  }
  
  public Boolean isEncryptedVMotionSupported() {
    return this.encryptedVMotionSupported;
  }
  
  public void setEncryptedVMotionSupported(Boolean paramBoolean) {
    this.encryptedVMotionSupported = paramBoolean;
  }
  
  public Boolean isEncryptionChangeOnAddRemoveSupported() {
    return this.encryptionChangeOnAddRemoveSupported;
  }
  
  public void setEncryptionChangeOnAddRemoveSupported(Boolean paramBoolean) {
    this.encryptionChangeOnAddRemoveSupported = paramBoolean;
  }
  
  public Boolean isEncryptionHotOperationSupported() {
    return this.encryptionHotOperationSupported;
  }
  
  public void setEncryptionHotOperationSupported(Boolean paramBoolean) {
    this.encryptionHotOperationSupported = paramBoolean;
  }
  
  public Boolean isEncryptionWithSnapshotsSupported() {
    return this.encryptionWithSnapshotsSupported;
  }
  
  public void setEncryptionWithSnapshotsSupported(Boolean paramBoolean) {
    this.encryptionWithSnapshotsSupported = paramBoolean;
  }
  
  public Boolean isEncryptionFaultToleranceSupported() {
    return this.encryptionFaultToleranceSupported;
  }
  
  public void setEncryptionFaultToleranceSupported(Boolean paramBoolean) {
    this.encryptionFaultToleranceSupported = paramBoolean;
  }
  
  public Boolean isEncryptionMemorySaveSupported() {
    return this.encryptionMemorySaveSupported;
  }
  
  public void setEncryptionMemorySaveSupported(Boolean paramBoolean) {
    this.encryptionMemorySaveSupported = paramBoolean;
  }
  
  public Boolean isEncryptionRDMSupported() {
    return this.encryptionRDMSupported;
  }
  
  public void setEncryptionRDMSupported(Boolean paramBoolean) {
    this.encryptionRDMSupported = paramBoolean;
  }
  
  public Boolean isEncryptionVFlashSupported() {
    return this.encryptionVFlashSupported;
  }
  
  public void setEncryptionVFlashSupported(Boolean paramBoolean) {
    this.encryptionVFlashSupported = paramBoolean;
  }
  
  public Boolean isEncryptionCBRCSupported() {
    return this.encryptionCBRCSupported;
  }
  
  public void setEncryptionCBRCSupported(Boolean paramBoolean) {
    this.encryptionCBRCSupported = paramBoolean;
  }
  
  public Boolean isEncryptionHBRSupported() {
    return this.encryptionHBRSupported;
  }
  
  public void setEncryptionHBRSupported(Boolean paramBoolean) {
    this.encryptionHBRSupported = paramBoolean;
  }
  
  public Boolean isFtEfiSupported() {
    return this.ftEfiSupported;
  }
  
  public void setFtEfiSupported(Boolean paramBoolean) {
    this.ftEfiSupported = paramBoolean;
  }
  
  public String getUnmapMethodSupported() {
    return this.unmapMethodSupported;
  }
  
  public void setUnmapMethodSupported(String paramString) {
    this.unmapMethodSupported = paramString;
  }
  
  public Integer getMaxMemMBPerFtVm() {
    return this.maxMemMBPerFtVm;
  }
  
  public void setMaxMemMBPerFtVm(Integer paramInteger) {
    this.maxMemMBPerFtVm = paramInteger;
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
  
  public Boolean isVmCreateDateSupported() {
    return this.vmCreateDateSupported;
  }
  
  public void setVmCreateDateSupported(Boolean paramBoolean) {
    this.vmCreateDateSupported = paramBoolean;
  }
  
  public Boolean isVmfs3EOLSupported() {
    return this.vmfs3EOLSupported;
  }
  
  public void setVmfs3EOLSupported(Boolean paramBoolean) {
    this.vmfs3EOLSupported = paramBoolean;
  }
  
  public Boolean isFtVmcpSupported() {
    return this.ftVmcpSupported;
  }
  
  public void setFtVmcpSupported(Boolean paramBoolean) {
    this.ftVmcpSupported = paramBoolean;
  }
  
  public Boolean isQuickBootSupported() {
    return this.quickBootSupported;
  }
  
  public void setQuickBootSupported(Boolean paramBoolean) {
    this.quickBootSupported = paramBoolean;
  }
  
  public Boolean isAssignableHardwareSupported() {
    return this.assignableHardwareSupported;
  }
  
  public void setAssignableHardwareSupported(Boolean paramBoolean) {
    this.assignableHardwareSupported = paramBoolean;
  }
  
  public Boolean isUseFeatureReqsForOldHWv() {
    return this.useFeatureReqsForOldHWv;
  }
  
  public void setUseFeatureReqsForOldHWv(Boolean paramBoolean) {
    this.useFeatureReqsForOldHWv = paramBoolean;
  }
  
  public Boolean isMarkPerenniallyReservedSupported() {
    return this.markPerenniallyReservedSupported;
  }
  
  public void setMarkPerenniallyReservedSupported(Boolean paramBoolean) {
    this.markPerenniallyReservedSupported = paramBoolean;
  }
  
  public Boolean isHppPspSupported() {
    return this.hppPspSupported;
  }
  
  public void setHppPspSupported(Boolean paramBoolean) {
    this.hppPspSupported = paramBoolean;
  }
  
  public Boolean isDeviceRebindWithoutRebootSupported() {
    return this.deviceRebindWithoutRebootSupported;
  }
  
  public void setDeviceRebindWithoutRebootSupported(Boolean paramBoolean) {
    this.deviceRebindWithoutRebootSupported = paramBoolean;
  }
  
  public Boolean isStoragePolicyChangeSupported() {
    return this.storagePolicyChangeSupported;
  }
  
  public void setStoragePolicyChangeSupported(Boolean paramBoolean) {
    this.storagePolicyChangeSupported = paramBoolean;
  }
  
  public Boolean isPrecisionTimeProtocolSupported() {
    return this.precisionTimeProtocolSupported;
  }
  
  public void setPrecisionTimeProtocolSupported(Boolean paramBoolean) {
    this.precisionTimeProtocolSupported = paramBoolean;
  }
  
  public Boolean isRemoteDeviceVMotionSupported() {
    return this.remoteDeviceVMotionSupported;
  }
  
  public void setRemoteDeviceVMotionSupported(Boolean paramBoolean) {
    this.remoteDeviceVMotionSupported = paramBoolean;
  }
  
  public Integer getMaxSupportedVmMemory() {
    return this.maxSupportedVmMemory;
  }
  
  public void setMaxSupportedVmMemory(Integer paramInteger) {
    this.maxSupportedVmMemory = paramInteger;
  }
}
