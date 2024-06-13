package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.LatencySensitivity;
import com.vmware.vim25.ManagedByInfo;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.ReplicationConfigSpec;
import com.vmware.vim25.ResourceAllocationInfo;
import com.vmware.vim25.ScheduledHardwareUpgradeInfo;
import com.vmware.vim25.ToolsConfigInfo;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualMachineAffinityInfo;
import com.vmware.vim25.VirtualMachineBootOptions;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineConsolePreferences;
import com.vmware.vim25.VirtualMachineCpuIdInfoSpec;
import com.vmware.vim25.VirtualMachineDefaultPowerOpInfo;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineFlagInfo;
import com.vmware.vim25.VirtualMachineGuestMonitoringModeInfo;
import com.vmware.vim25.VirtualMachineNetworkShaperInfo;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineSgxInfo;
import com.vmware.vim25.VirtualMachineVcpuConfig;
import com.vmware.vim25.VmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigSpec", propOrder = {"changeVersion", "name", "version", "createDate", "uuid", "instanceUuid", "npivNodeWorldWideName", "npivPortWorldWideName", "npivWorldWideNameType", "npivDesiredNodeWwns", "npivDesiredPortWwns", "npivTemporaryDisabled", "npivOnNonRdmDisks", "npivWorldWideNameOp", "locationId", "guestId", "alternateGuestName", "annotation", "files", "tools", "flags", "consolePreferences", "powerOpInfo", "numCPUs", "vcpuConfig", "numCoresPerSocket", "memoryMB", "memoryHotAddEnabled", "cpuHotAddEnabled", "cpuHotRemoveEnabled", "virtualICH7MPresent", "virtualSMCPresent", "deviceChange", "cpuAllocation", "memoryAllocation", "latencySensitivity", "cpuAffinity", "memoryAffinity", "networkShaper", "cpuFeatureMask", "extraConfig", "swapPlacement", "bootOptions", "vAppConfig", "ftInfo", "repConfig", "vAppConfigRemoved", "vAssertsEnabled", "changeTrackingEnabled", "firmware", "maxMksConnections", "guestAutoLockEnabled", "managedBy", "memoryReservationLockedToMax", "nestedHVEnabled", "vpmcEnabled", "scheduledHardwareUpgradeInfo", "vmProfile", "messageBusTunnelEnabled", "crypto", "migrateEncryption", "sgxInfo", "guestMonitoringModeInfo"})
public class VirtualMachineConfigSpec extends DynamicData {
  protected String changeVersion;
  
  protected String name;
  
  protected String version;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createDate;
  
  protected String uuid;
  
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
  
  protected String npivWorldWideNameOp;
  
  protected String locationId;
  
  protected String guestId;
  
  protected String alternateGuestName;
  
  protected String annotation;
  
  protected VirtualMachineFileInfo files;
  
  protected ToolsConfigInfo tools;
  
  protected VirtualMachineFlagInfo flags;
  
  protected VirtualMachineConsolePreferences consolePreferences;
  
  protected VirtualMachineDefaultPowerOpInfo powerOpInfo;
  
  protected Integer numCPUs;
  
  protected List<VirtualMachineVcpuConfig> vcpuConfig;
  
  protected Integer numCoresPerSocket;
  
  protected Long memoryMB;
  
  protected Boolean memoryHotAddEnabled;
  
  protected Boolean cpuHotAddEnabled;
  
  protected Boolean cpuHotRemoveEnabled;
  
  protected Boolean virtualICH7MPresent;
  
  protected Boolean virtualSMCPresent;
  
  protected List<VirtualDeviceConfigSpec> deviceChange;
  
  protected ResourceAllocationInfo cpuAllocation;
  
  protected ResourceAllocationInfo memoryAllocation;
  
  protected LatencySensitivity latencySensitivity;
  
  protected VirtualMachineAffinityInfo cpuAffinity;
  
  protected VirtualMachineAffinityInfo memoryAffinity;
  
  protected VirtualMachineNetworkShaperInfo networkShaper;
  
  protected List<VirtualMachineCpuIdInfoSpec> cpuFeatureMask;
  
  protected List<OptionValue> extraConfig;
  
  protected String swapPlacement;
  
  protected VirtualMachineBootOptions bootOptions;
  
  protected VmConfigSpec vAppConfig;
  
  protected FaultToleranceConfigInfo ftInfo;
  
  protected ReplicationConfigSpec repConfig;
  
  protected Boolean vAppConfigRemoved;
  
  protected Boolean vAssertsEnabled;
  
  protected Boolean changeTrackingEnabled;
  
  protected String firmware;
  
  protected Integer maxMksConnections;
  
  protected Boolean guestAutoLockEnabled;
  
  protected ManagedByInfo managedBy;
  
  protected Boolean memoryReservationLockedToMax;
  
  protected Boolean nestedHVEnabled;
  
  @XmlElement(name = "vPMCEnabled")
  protected Boolean vpmcEnabled;
  
  protected ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
  
  protected List<VirtualMachineProfileSpec> vmProfile;
  
  protected Boolean messageBusTunnelEnabled;
  
  protected CryptoSpec crypto;
  
  protected String migrateEncryption;
  
  protected VirtualMachineSgxInfo sgxInfo;
  
  protected VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
  
  public String getChangeVersion() {
    return this.changeVersion;
  }
  
  public void setChangeVersion(String paramString) {
    this.changeVersion = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public XMLGregorianCalendar getCreateDate() {
    return this.createDate;
  }
  
  public void setCreateDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createDate = paramXMLGregorianCalendar;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
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
  
  public String getNpivWorldWideNameOp() {
    return this.npivWorldWideNameOp;
  }
  
  public void setNpivWorldWideNameOp(String paramString) {
    this.npivWorldWideNameOp = paramString;
  }
  
  public String getLocationId() {
    return this.locationId;
  }
  
  public void setLocationId(String paramString) {
    this.locationId = paramString;
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
  
  public VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
    return this.powerOpInfo;
  }
  
  public void setPowerOpInfo(VirtualMachineDefaultPowerOpInfo paramVirtualMachineDefaultPowerOpInfo) {
    this.powerOpInfo = paramVirtualMachineDefaultPowerOpInfo;
  }
  
  public Integer getNumCPUs() {
    return this.numCPUs;
  }
  
  public void setNumCPUs(Integer paramInteger) {
    this.numCPUs = paramInteger;
  }
  
  public List<VirtualMachineVcpuConfig> getVcpuConfig() {
    if (this.vcpuConfig == null)
      this.vcpuConfig = new ArrayList<>(); 
    return this.vcpuConfig;
  }
  
  public Integer getNumCoresPerSocket() {
    return this.numCoresPerSocket;
  }
  
  public void setNumCoresPerSocket(Integer paramInteger) {
    this.numCoresPerSocket = paramInteger;
  }
  
  public Long getMemoryMB() {
    return this.memoryMB;
  }
  
  public void setMemoryMB(Long paramLong) {
    this.memoryMB = paramLong;
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
  
  public Boolean isVirtualICH7MPresent() {
    return this.virtualICH7MPresent;
  }
  
  public void setVirtualICH7MPresent(Boolean paramBoolean) {
    this.virtualICH7MPresent = paramBoolean;
  }
  
  public Boolean isVirtualSMCPresent() {
    return this.virtualSMCPresent;
  }
  
  public void setVirtualSMCPresent(Boolean paramBoolean) {
    this.virtualSMCPresent = paramBoolean;
  }
  
  public List<VirtualDeviceConfigSpec> getDeviceChange() {
    if (this.deviceChange == null)
      this.deviceChange = new ArrayList<>(); 
    return this.deviceChange;
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
  
  public List<VirtualMachineCpuIdInfoSpec> getCpuFeatureMask() {
    if (this.cpuFeatureMask == null)
      this.cpuFeatureMask = new ArrayList<>(); 
    return this.cpuFeatureMask;
  }
  
  public List<OptionValue> getExtraConfig() {
    if (this.extraConfig == null)
      this.extraConfig = new ArrayList<>(); 
    return this.extraConfig;
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
  
  public VmConfigSpec getVAppConfig() {
    return this.vAppConfig;
  }
  
  public void setVAppConfig(VmConfigSpec paramVmConfigSpec) {
    this.vAppConfig = paramVmConfigSpec;
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
  
  public Boolean isVAppConfigRemoved() {
    return this.vAppConfigRemoved;
  }
  
  public void setVAppConfigRemoved(Boolean paramBoolean) {
    this.vAppConfigRemoved = paramBoolean;
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
  
  public List<VirtualMachineProfileSpec> getVmProfile() {
    if (this.vmProfile == null)
      this.vmProfile = new ArrayList<>(); 
    return this.vmProfile;
  }
  
  public Boolean isMessageBusTunnelEnabled() {
    return this.messageBusTunnelEnabled;
  }
  
  public void setMessageBusTunnelEnabled(Boolean paramBoolean) {
    this.messageBusTunnelEnabled = paramBoolean;
  }
  
  public CryptoSpec getCrypto() {
    return this.crypto;
  }
  
  public void setCrypto(CryptoSpec paramCryptoSpec) {
    this.crypto = paramCryptoSpec;
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
  
  public VirtualMachineGuestMonitoringModeInfo getGuestMonitoringModeInfo() {
    return this.guestMonitoringModeInfo;
  }
  
  public void setGuestMonitoringModeInfo(VirtualMachineGuestMonitoringModeInfo paramVirtualMachineGuestMonitoringModeInfo) {
    this.guestMonitoringModeInfo = paramVirtualMachineGuestMonitoringModeInfo;
  }
}
