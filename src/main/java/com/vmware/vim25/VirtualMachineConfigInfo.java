package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.LatencySensitivity;
import com.vmware.vim25.ManagedByInfo;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.ReplicationConfigSpec;
import com.vmware.vim25.ResourceAllocationInfo;
import com.vmware.vim25.ScheduledHardwareUpgradeInfo;
import com.vmware.vim25.ToolsConfigInfo;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualMachineAffinityInfo;
import com.vmware.vim25.VirtualMachineBootOptions;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair;
import com.vmware.vim25.VirtualMachineConfigInfoOverheadInfo;
import com.vmware.vim25.VirtualMachineConsolePreferences;
import com.vmware.vim25.VirtualMachineContentLibraryItemInfo;
import com.vmware.vim25.VirtualMachineDefaultPowerOpInfo;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineFlagInfo;
import com.vmware.vim25.VirtualMachineForkConfigInfo;
import com.vmware.vim25.VirtualMachineGuestIntegrityInfo;
import com.vmware.vim25.VirtualMachineGuestMonitoringModeInfo;
import com.vmware.vim25.VirtualMachineNetworkShaperInfo;
import com.vmware.vim25.VirtualMachineSgxInfo;
import com.vmware.vim25.VirtualMachineVcpuConfig;
import com.vmware.vim25.VmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigInfo", propOrder = {"changeVersion", "modified", "name", "guestFullName", "version", "uuid", "createDate", "instanceUuid", "npivNodeWorldWideName", "npivPortWorldWideName", "npivWorldWideNameType", "npivDesiredNodeWwns", "npivDesiredPortWwns", "npivTemporaryDisabled", "npivOnNonRdmDisks", "locationId", "template", "guestId", "alternateGuestName", "annotation", "files", "tools", "flags", "consolePreferences", "defaultPowerOps", "hardware", "vcpuConfig", "cpuAllocation", "memoryAllocation", "latencySensitivity", "memoryHotAddEnabled", "cpuHotAddEnabled", "cpuHotRemoveEnabled", "hotPlugMemoryLimit", "hotPlugMemoryIncrementSize", "cpuAffinity", "memoryAffinity", "networkShaper", "extraConfig", "cpuFeatureMask", "datastoreUrl", "swapPlacement", "bootOptions", "ftInfo", "repConfig", "vAppConfig", "vAssertsEnabled", "changeTrackingEnabled", "firmware", "maxMksConnections", "guestAutoLockEnabled", "managedBy", "memoryReservationLockedToMax", "initialOverhead", "nestedHVEnabled", "vpmcEnabled", "scheduledHardwareUpgradeInfo", "forkConfigInfo", "vFlashCacheReservation", "vmxConfigChecksum", "messageBusTunnelEnabled", "vmStorageObjectId", "swapStorageObjectId", "keyId", "guestIntegrityInfo", "migrateEncryption", "sgxInfo", "contentLibItemInfo", "guestMonitoringModeInfo"})
public class VirtualMachineConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String changeVersion;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar modified;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String guestFullName;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createDate;
  
  protected String instanceUuid;
  
  @XmlElement(type = Long.class)
  protected List<Long> npivNodeWorldWideName;
  
  @XmlElement(type = Long.class)
  protected List<Long> npivPortWorldWideName;
  
  protected String npivWorldWideNameType;
  
  protected Short npivDesiredNodeWwns;
  
  protected Short npivDesiredPortWwns;
  
  protected Boolean npivTemporaryDisabled;
  
  protected Boolean npivOnNonRdmDisks;
  
  protected String locationId;
  
  protected boolean template;
  
  @XmlElement(required = true)
  protected String guestId;
  
  @XmlElement(required = true)
  protected String alternateGuestName;
  
  protected String annotation;
  
  @XmlElement(required = true)
  protected VirtualMachineFileInfo files;
  
  protected ToolsConfigInfo tools;
  
  @XmlElement(required = true)
  protected VirtualMachineFlagInfo flags;
  
  protected VirtualMachineConsolePreferences consolePreferences;
  
  @XmlElement(required = true)
  protected VirtualMachineDefaultPowerOpInfo defaultPowerOps;
  
  @XmlElement(required = true)
  protected VirtualHardware hardware;
  
  protected List<VirtualMachineVcpuConfig> vcpuConfig;
  
  protected ResourceAllocationInfo cpuAllocation;
  
  protected ResourceAllocationInfo memoryAllocation;
  
  protected LatencySensitivity latencySensitivity;
  
  protected Boolean memoryHotAddEnabled;
  
  protected Boolean cpuHotAddEnabled;
  
  protected Boolean cpuHotRemoveEnabled;
  
  protected Long hotPlugMemoryLimit;
  
  protected Long hotPlugMemoryIncrementSize;
  
  protected VirtualMachineAffinityInfo cpuAffinity;
  
  protected VirtualMachineAffinityInfo memoryAffinity;
  
  protected VirtualMachineNetworkShaperInfo networkShaper;
  
  protected List<OptionValue> extraConfig;
  
  protected List<HostCpuIdInfo> cpuFeatureMask;
  
  protected List<VirtualMachineConfigInfoDatastoreUrlPair> datastoreUrl;
  
  protected String swapPlacement;
  
  protected VirtualMachineBootOptions bootOptions;
  
  protected FaultToleranceConfigInfo ftInfo;
  
  protected ReplicationConfigSpec repConfig;
  
  protected VmConfigInfo vAppConfig;
  
  protected Boolean vAssertsEnabled;
  
  protected Boolean changeTrackingEnabled;
  
  protected String firmware;
  
  protected Integer maxMksConnections;
  
  protected Boolean guestAutoLockEnabled;
  
  protected ManagedByInfo managedBy;
  
  protected Boolean memoryReservationLockedToMax;
  
  protected VirtualMachineConfigInfoOverheadInfo initialOverhead;
  
  protected Boolean nestedHVEnabled;
  
  @XmlElement(name = "vPMCEnabled")
  protected Boolean vpmcEnabled;
  
  protected ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
  
  protected VirtualMachineForkConfigInfo forkConfigInfo;
  
  protected Long vFlashCacheReservation;
  
  protected byte[] vmxConfigChecksum;
  
  protected Boolean messageBusTunnelEnabled;
  
  protected String vmStorageObjectId;
  
  protected String swapStorageObjectId;
  
  protected CryptoKeyId keyId;
  
  protected VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
  
  protected String migrateEncryption;
  
  protected VirtualMachineSgxInfo sgxInfo;
  
  protected VirtualMachineContentLibraryItemInfo contentLibItemInfo;
  
  protected VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
  
  public String getChangeVersion() {
    return this.changeVersion;
  }
  
  public void setChangeVersion(String paramString) {
    this.changeVersion = paramString;
  }
  
  public XMLGregorianCalendar getModified() {
    return this.modified;
  }
  
  public void setModified(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.modified = paramXMLGregorianCalendar;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getGuestFullName() {
    return this.guestFullName;
  }
  
  public void setGuestFullName(String paramString) {
    this.guestFullName = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public XMLGregorianCalendar getCreateDate() {
    return this.createDate;
  }
  
  public void setCreateDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createDate = paramXMLGregorianCalendar;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
  
  public List<Long> getNpivNodeWorldWideName() {
    if (this.npivNodeWorldWideName == null)
      this.npivNodeWorldWideName = new ArrayList<>(); 
    return this.npivNodeWorldWideName;
  }
  
  public List<Long> getNpivPortWorldWideName() {
    if (this.npivPortWorldWideName == null)
      this.npivPortWorldWideName = new ArrayList<>(); 
    return this.npivPortWorldWideName;
  }
  
  public String getNpivWorldWideNameType() {
    return this.npivWorldWideNameType;
  }
  
  public void setNpivWorldWideNameType(String paramString) {
    this.npivWorldWideNameType = paramString;
  }
  
  public Short getNpivDesiredNodeWwns() {
    return this.npivDesiredNodeWwns;
  }
  
  public void setNpivDesiredNodeWwns(Short paramShort) {
    this.npivDesiredNodeWwns = paramShort;
  }
  
  public Short getNpivDesiredPortWwns() {
    return this.npivDesiredPortWwns;
  }
  
  public void setNpivDesiredPortWwns(Short paramShort) {
    this.npivDesiredPortWwns = paramShort;
  }
  
  public Boolean isNpivTemporaryDisabled() {
    return this.npivTemporaryDisabled;
  }
  
  public void setNpivTemporaryDisabled(Boolean paramBoolean) {
    this.npivTemporaryDisabled = paramBoolean;
  }
  
  public Boolean isNpivOnNonRdmDisks() {
    return this.npivOnNonRdmDisks;
  }
  
  public void setNpivOnNonRdmDisks(Boolean paramBoolean) {
    this.npivOnNonRdmDisks = paramBoolean;
  }
  
  public String getLocationId() {
    return this.locationId;
  }
  
  public void setLocationId(String paramString) {
    this.locationId = paramString;
  }
  
  public boolean isTemplate() {
    return this.template;
  }
  
  public void setTemplate(boolean paramBoolean) {
    this.template = paramBoolean;
  }
  
  public String getGuestId() {
    return this.guestId;
  }
  
  public void setGuestId(String paramString) {
    this.guestId = paramString;
  }
  
  public String getAlternateGuestName() {
    return this.alternateGuestName;
  }
  
  public void setAlternateGuestName(String paramString) {
    this.alternateGuestName = paramString;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public VirtualMachineFileInfo getFiles() {
    return this.files;
  }
  
  public void setFiles(VirtualMachineFileInfo paramVirtualMachineFileInfo) {
    this.files = paramVirtualMachineFileInfo;
  }
  
  public ToolsConfigInfo getTools() {
    return this.tools;
  }
  
  public void setTools(ToolsConfigInfo paramToolsConfigInfo) {
    this.tools = paramToolsConfigInfo;
  }
  
  public VirtualMachineFlagInfo getFlags() {
    return this.flags;
  }
  
  public void setFlags(VirtualMachineFlagInfo paramVirtualMachineFlagInfo) {
    this.flags = paramVirtualMachineFlagInfo;
  }
  
  public VirtualMachineConsolePreferences getConsolePreferences() {
    return this.consolePreferences;
  }
  
  public void setConsolePreferences(VirtualMachineConsolePreferences paramVirtualMachineConsolePreferences) {
    this.consolePreferences = paramVirtualMachineConsolePreferences;
  }
  
  public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
    return this.defaultPowerOps;
  }
  
  public void setDefaultPowerOps(VirtualMachineDefaultPowerOpInfo paramVirtualMachineDefaultPowerOpInfo) {
    this.defaultPowerOps = paramVirtualMachineDefaultPowerOpInfo;
  }
  
  public VirtualHardware getHardware() {
    return this.hardware;
  }
  
  public void setHardware(VirtualHardware paramVirtualHardware) {
    this.hardware = paramVirtualHardware;
  }
  
  public List<VirtualMachineVcpuConfig> getVcpuConfig() {
    if (this.vcpuConfig == null)
      this.vcpuConfig = new ArrayList<>(); 
    return this.vcpuConfig;
  }
  
  public ResourceAllocationInfo getCpuAllocation() {
    return this.cpuAllocation;
  }
  
  public void setCpuAllocation(ResourceAllocationInfo paramResourceAllocationInfo) {
    this.cpuAllocation = paramResourceAllocationInfo;
  }
  
  public ResourceAllocationInfo getMemoryAllocation() {
    return this.memoryAllocation;
  }
  
  public void setMemoryAllocation(ResourceAllocationInfo paramResourceAllocationInfo) {
    this.memoryAllocation = paramResourceAllocationInfo;
  }
  
  public LatencySensitivity getLatencySensitivity() {
    return this.latencySensitivity;
  }
  
  public void setLatencySensitivity(LatencySensitivity paramLatencySensitivity) {
    this.latencySensitivity = paramLatencySensitivity;
  }
  
  public Boolean isMemoryHotAddEnabled() {
    return this.memoryHotAddEnabled;
  }
  
  public void setMemoryHotAddEnabled(Boolean paramBoolean) {
    this.memoryHotAddEnabled = paramBoolean;
  }
  
  public Boolean isCpuHotAddEnabled() {
    return this.cpuHotAddEnabled;
  }
  
  public void setCpuHotAddEnabled(Boolean paramBoolean) {
    this.cpuHotAddEnabled = paramBoolean;
  }
  
  public Boolean isCpuHotRemoveEnabled() {
    return this.cpuHotRemoveEnabled;
  }
  
  public void setCpuHotRemoveEnabled(Boolean paramBoolean) {
    this.cpuHotRemoveEnabled = paramBoolean;
  }
  
  public Long getHotPlugMemoryLimit() {
    return this.hotPlugMemoryLimit;
  }
  
  public void setHotPlugMemoryLimit(Long paramLong) {
    this.hotPlugMemoryLimit = paramLong;
  }
  
  public Long getHotPlugMemoryIncrementSize() {
    return this.hotPlugMemoryIncrementSize;
  }
  
  public void setHotPlugMemoryIncrementSize(Long paramLong) {
    this.hotPlugMemoryIncrementSize = paramLong;
  }
  
  public VirtualMachineAffinityInfo getCpuAffinity() {
    return this.cpuAffinity;
  }
  
  public void setCpuAffinity(VirtualMachineAffinityInfo paramVirtualMachineAffinityInfo) {
    this.cpuAffinity = paramVirtualMachineAffinityInfo;
  }
  
  public VirtualMachineAffinityInfo getMemoryAffinity() {
    return this.memoryAffinity;
  }
  
  public void setMemoryAffinity(VirtualMachineAffinityInfo paramVirtualMachineAffinityInfo) {
    this.memoryAffinity = paramVirtualMachineAffinityInfo;
  }
  
  public VirtualMachineNetworkShaperInfo getNetworkShaper() {
    return this.networkShaper;
  }
  
  public void setNetworkShaper(VirtualMachineNetworkShaperInfo paramVirtualMachineNetworkShaperInfo) {
    this.networkShaper = paramVirtualMachineNetworkShaperInfo;
  }
  
  public List<OptionValue> getExtraConfig() {
    if (this.extraConfig == null)
      this.extraConfig = new ArrayList<>(); 
    return this.extraConfig;
  }
  
  public List<HostCpuIdInfo> getCpuFeatureMask() {
    if (this.cpuFeatureMask == null)
      this.cpuFeatureMask = new ArrayList<>(); 
    return this.cpuFeatureMask;
  }
  
  public List<VirtualMachineConfigInfoDatastoreUrlPair> getDatastoreUrl() {
    if (this.datastoreUrl == null)
      this.datastoreUrl = new ArrayList<>(); 
    return this.datastoreUrl;
  }
  
  public String getSwapPlacement() {
    return this.swapPlacement;
  }
  
  public void setSwapPlacement(String paramString) {
    this.swapPlacement = paramString;
  }
  
  public VirtualMachineBootOptions getBootOptions() {
    return this.bootOptions;
  }
  
  public void setBootOptions(VirtualMachineBootOptions paramVirtualMachineBootOptions) {
    this.bootOptions = paramVirtualMachineBootOptions;
  }
  
  public FaultToleranceConfigInfo getFtInfo() {
    return this.ftInfo;
  }
  
  public void setFtInfo(FaultToleranceConfigInfo paramFaultToleranceConfigInfo) {
    this.ftInfo = paramFaultToleranceConfigInfo;
  }
  
  public ReplicationConfigSpec getRepConfig() {
    return this.repConfig;
  }
  
  public void setRepConfig(ReplicationConfigSpec paramReplicationConfigSpec) {
    this.repConfig = paramReplicationConfigSpec;
  }
  
  public VmConfigInfo getVAppConfig() {
    return this.vAppConfig;
  }
  
  public void setVAppConfig(VmConfigInfo paramVmConfigInfo) {
    this.vAppConfig = paramVmConfigInfo;
  }
  
  public Boolean isVAssertsEnabled() {
    return this.vAssertsEnabled;
  }
  
  public void setVAssertsEnabled(Boolean paramBoolean) {
    this.vAssertsEnabled = paramBoolean;
  }
  
  public Boolean isChangeTrackingEnabled() {
    return this.changeTrackingEnabled;
  }
  
  public void setChangeTrackingEnabled(Boolean paramBoolean) {
    this.changeTrackingEnabled = paramBoolean;
  }
  
  public String getFirmware() {
    return this.firmware;
  }
  
  public void setFirmware(String paramString) {
    this.firmware = paramString;
  }
  
  public Integer getMaxMksConnections() {
    return this.maxMksConnections;
  }
  
  public void setMaxMksConnections(Integer paramInteger) {
    this.maxMksConnections = paramInteger;
  }
  
  public Boolean isGuestAutoLockEnabled() {
    return this.guestAutoLockEnabled;
  }
  
  public void setGuestAutoLockEnabled(Boolean paramBoolean) {
    this.guestAutoLockEnabled = paramBoolean;
  }
  
  public ManagedByInfo getManagedBy() {
    return this.managedBy;
  }
  
  public void setManagedBy(ManagedByInfo paramManagedByInfo) {
    this.managedBy = paramManagedByInfo;
  }
  
  public Boolean isMemoryReservationLockedToMax() {
    return this.memoryReservationLockedToMax;
  }
  
  public void setMemoryReservationLockedToMax(Boolean paramBoolean) {
    this.memoryReservationLockedToMax = paramBoolean;
  }
  
  public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
    return this.initialOverhead;
  }
  
  public void setInitialOverhead(VirtualMachineConfigInfoOverheadInfo paramVirtualMachineConfigInfoOverheadInfo) {
    this.initialOverhead = paramVirtualMachineConfigInfoOverheadInfo;
  }
  
  public Boolean isNestedHVEnabled() {
    return this.nestedHVEnabled;
  }
  
  public void setNestedHVEnabled(Boolean paramBoolean) {
    this.nestedHVEnabled = paramBoolean;
  }
  
  public Boolean isVPMCEnabled() {
    return this.vpmcEnabled;
  }
  
  public void setVPMCEnabled(Boolean paramBoolean) {
    this.vpmcEnabled = paramBoolean;
  }
  
  public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
    return this.scheduledHardwareUpgradeInfo;
  }
  
  public void setScheduledHardwareUpgradeInfo(ScheduledHardwareUpgradeInfo paramScheduledHardwareUpgradeInfo) {
    this.scheduledHardwareUpgradeInfo = paramScheduledHardwareUpgradeInfo;
  }
  
  public VirtualMachineForkConfigInfo getForkConfigInfo() {
    return this.forkConfigInfo;
  }
  
  public void setForkConfigInfo(VirtualMachineForkConfigInfo paramVirtualMachineForkConfigInfo) {
    this.forkConfigInfo = paramVirtualMachineForkConfigInfo;
  }
  
  public Long getVFlashCacheReservation() {
    return this.vFlashCacheReservation;
  }
  
  public void setVFlashCacheReservation(Long paramLong) {
    this.vFlashCacheReservation = paramLong;
  }
  
  public byte[] getVmxConfigChecksum() {
    return this.vmxConfigChecksum;
  }
  
  public void setVmxConfigChecksum(byte[] paramArrayOfbyte) {
    this.vmxConfigChecksum = paramArrayOfbyte;
  }
  
  public Boolean isMessageBusTunnelEnabled() {
    return this.messageBusTunnelEnabled;
  }
  
  public void setMessageBusTunnelEnabled(Boolean paramBoolean) {
    this.messageBusTunnelEnabled = paramBoolean;
  }
  
  public String getVmStorageObjectId() {
    return this.vmStorageObjectId;
  }
  
  public void setVmStorageObjectId(String paramString) {
    this.vmStorageObjectId = paramString;
  }
  
  public String getSwapStorageObjectId() {
    return this.swapStorageObjectId;
  }
  
  public void setSwapStorageObjectId(String paramString) {
    this.swapStorageObjectId = paramString;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
  
  public VirtualMachineGuestIntegrityInfo getGuestIntegrityInfo() {
    return this.guestIntegrityInfo;
  }
  
  public void setGuestIntegrityInfo(VirtualMachineGuestIntegrityInfo paramVirtualMachineGuestIntegrityInfo) {
    this.guestIntegrityInfo = paramVirtualMachineGuestIntegrityInfo;
  }
  
  public String getMigrateEncryption() {
    return this.migrateEncryption;
  }
  
  public void setMigrateEncryption(String paramString) {
    this.migrateEncryption = paramString;
  }
  
  public VirtualMachineSgxInfo getSgxInfo() {
    return this.sgxInfo;
  }
  
  public void setSgxInfo(VirtualMachineSgxInfo paramVirtualMachineSgxInfo) {
    this.sgxInfo = paramVirtualMachineSgxInfo;
  }
  
  public VirtualMachineContentLibraryItemInfo getContentLibItemInfo() {
    return this.contentLibItemInfo;
  }
  
  public void setContentLibItemInfo(VirtualMachineContentLibraryItemInfo paramVirtualMachineContentLibraryItemInfo) {
    this.contentLibItemInfo = paramVirtualMachineContentLibraryItemInfo;
  }
  
  public VirtualMachineGuestMonitoringModeInfo getGuestMonitoringModeInfo() {
    return this.guestMonitoringModeInfo;
  }
  
  public void setGuestMonitoringModeInfo(VirtualMachineGuestMonitoringModeInfo paramVirtualMachineGuestMonitoringModeInfo) {
    this.guestMonitoringModeInfo = paramVirtualMachineGuestMonitoringModeInfo;
  }
}
