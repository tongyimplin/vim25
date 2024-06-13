package com.vmware.vim25;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAssignableHardwareBinding;
import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.HostAuthenticationManagerInfo;
import com.vmware.vim25.HostAutoStartManagerConfig;
import com.vmware.vim25.HostCacheConfigurationInfo;
import com.vmware.vim25.HostConfigInfo;
import com.vmware.vim25.HostDatastoreSystemCapabilities;
import com.vmware.vim25.HostDateTimeInfo;
import com.vmware.vim25.HostDeploymentInfo;
import com.vmware.vim25.HostDiagnosticPartition;
import com.vmware.vim25.HostFeatureCapability;
import com.vmware.vim25.HostFeatureVersionInfo;
import com.vmware.vim25.HostFileSystemVolumeInfo;
import com.vmware.vim25.HostFirewallInfo;
import com.vmware.vim25.HostFlagInfo;
import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.HostGraphicsInfo;
import com.vmware.vim25.HostHyperThreadScheduleInfo;
import com.vmware.vim25.HostIoFilterInfo;
import com.vmware.vim25.HostIpmiInfo;
import com.vmware.vim25.HostLockdownMode;
import com.vmware.vim25.HostMultipathStateInfo;
import com.vmware.vim25.HostNetCapabilities;
import com.vmware.vim25.HostNetOffloadCapabilities;
import com.vmware.vim25.HostNetworkInfo;
import com.vmware.vim25.HostPciPassthruInfo;
import com.vmware.vim25.HostServiceInfo;
import com.vmware.vim25.HostSharedGpuCapabilities;
import com.vmware.vim25.HostSriovDevicePoolInfo;
import com.vmware.vim25.HostSslThumbprintInfo;
import com.vmware.vim25.HostStorageDeviceInfo;
import com.vmware.vim25.HostSystemResourceInfo;
import com.vmware.vim25.HostSystemSwapConfiguration;
import com.vmware.vim25.HostVFlashManagerVFlashConfigInfo;
import com.vmware.vim25.HostVMotionInfo;
import com.vmware.vim25.HostVirtualNicManagerInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OptionDef;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.PowerSystemCapability;
import com.vmware.vim25.PowerSystemInfo;
import com.vmware.vim25.ServiceConsoleReservationInfo;
import com.vmware.vim25.VirtualMachineMemoryReservationInfo;
import com.vmware.vim25.VsanHostConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigInfo", propOrder = {"host", "product", "deploymentInfo", "hyperThread", "consoleReservation", "virtualMachineReservation", "storageDevice", "multipathState", "fileSystemVolume", "systemFile", "network", "vmotion", "virtualNicManagerInfo", "capabilities", "datastoreCapabilities", "offloadCapabilities", "service", "firewall", "autoStart", "activeDiagnosticPartition", "option", "optionDef", "datastorePrincipal", "localSwapDatastore", "systemSwapConfiguration", "systemResources", "dateTimeInfo", "flags", "adminDisabled", "lockdownMode", "ipmi", "sslThumbprintInfo", "sslThumbprintData", "certificate", "pciPassthruInfo", "authenticationManagerInfo", "featureVersion", "powerSystemCapability", "powerSystemInfo", "cacheConfigurationInfo", "wakeOnLanCapable", "featureCapability", "maskedFeatureCapability", "vFlashConfigInfo", "vsanHostConfig", "domainList", "scriptCheckSum", "hostConfigCheckSum", "descriptionTreeCheckSum", "graphicsInfo", "sharedPassthruGpuTypes", "graphicsConfig", "sharedGpuCapabilities", "ioFilterInfo", "sriovDevicePool", "assignableHardwareBinding", "assignableHardwareConfig"})
public class HostConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected AboutInfo product;
  
  protected HostDeploymentInfo deploymentInfo;
  
  protected HostHyperThreadScheduleInfo hyperThread;
  
  protected ServiceConsoleReservationInfo consoleReservation;
  
  protected VirtualMachineMemoryReservationInfo virtualMachineReservation;
  
  protected HostStorageDeviceInfo storageDevice;
  
  protected HostMultipathStateInfo multipathState;
  
  protected HostFileSystemVolumeInfo fileSystemVolume;
  
  protected List<String> systemFile;
  
  protected HostNetworkInfo network;
  
  protected HostVMotionInfo vmotion;
  
  protected HostVirtualNicManagerInfo virtualNicManagerInfo;
  
  protected HostNetCapabilities capabilities;
  
  protected HostDatastoreSystemCapabilities datastoreCapabilities;
  
  protected HostNetOffloadCapabilities offloadCapabilities;
  
  protected HostServiceInfo service;
  
  protected HostFirewallInfo firewall;
  
  protected HostAutoStartManagerConfig autoStart;
  
  protected HostDiagnosticPartition activeDiagnosticPartition;
  
  protected List<OptionValue> option;
  
  protected List<OptionDef> optionDef;
  
  protected String datastorePrincipal;
  
  protected ManagedObjectReference localSwapDatastore;
  
  protected HostSystemSwapConfiguration systemSwapConfiguration;
  
  protected HostSystemResourceInfo systemResources;
  
  protected HostDateTimeInfo dateTimeInfo;
  
  protected HostFlagInfo flags;
  
  protected Boolean adminDisabled;
  
  protected HostLockdownMode lockdownMode;
  
  protected HostIpmiInfo ipmi;
  
  protected HostSslThumbprintInfo sslThumbprintInfo;
  
  protected List<HostSslThumbprintInfo> sslThumbprintData;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> certificate;
  
  protected List<HostPciPassthruInfo> pciPassthruInfo;
  
  protected HostAuthenticationManagerInfo authenticationManagerInfo;
  
  protected List<HostFeatureVersionInfo> featureVersion;
  
  protected PowerSystemCapability powerSystemCapability;
  
  protected PowerSystemInfo powerSystemInfo;
  
  protected List<HostCacheConfigurationInfo> cacheConfigurationInfo;
  
  protected Boolean wakeOnLanCapable;
  
  protected List<HostFeatureCapability> featureCapability;
  
  protected List<HostFeatureCapability> maskedFeatureCapability;
  
  protected HostVFlashManagerVFlashConfigInfo vFlashConfigInfo;
  
  protected VsanHostConfigInfo vsanHostConfig;
  
  protected List<String> domainList;
  
  protected byte[] scriptCheckSum;
  
  protected byte[] hostConfigCheckSum;
  
  protected byte[] descriptionTreeCheckSum;
  
  protected List<HostGraphicsInfo> graphicsInfo;
  
  protected List<String> sharedPassthruGpuTypes;
  
  protected HostGraphicsConfig graphicsConfig;
  
  protected List<HostSharedGpuCapabilities> sharedGpuCapabilities;
  
  protected List<HostIoFilterInfo> ioFilterInfo;
  
  protected List<HostSriovDevicePoolInfo> sriovDevicePool;
  
  protected List<HostAssignableHardwareBinding> assignableHardwareBinding;
  
  protected HostAssignableHardwareConfig assignableHardwareConfig;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public AboutInfo getProduct() {
    return this.product;
  }
  
  public void setProduct(AboutInfo paramAboutInfo) {
    this.product = paramAboutInfo;
  }
  
  public HostDeploymentInfo getDeploymentInfo() {
    return this.deploymentInfo;
  }
  
  public void setDeploymentInfo(HostDeploymentInfo paramHostDeploymentInfo) {
    this.deploymentInfo = paramHostDeploymentInfo;
  }
  
  public HostHyperThreadScheduleInfo getHyperThread() {
    return this.hyperThread;
  }
  
  public void setHyperThread(HostHyperThreadScheduleInfo paramHostHyperThreadScheduleInfo) {
    this.hyperThread = paramHostHyperThreadScheduleInfo;
  }
  
  public ServiceConsoleReservationInfo getConsoleReservation() {
    return this.consoleReservation;
  }
  
  public void setConsoleReservation(ServiceConsoleReservationInfo paramServiceConsoleReservationInfo) {
    this.consoleReservation = paramServiceConsoleReservationInfo;
  }
  
  public VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
    return this.virtualMachineReservation;
  }
  
  public void setVirtualMachineReservation(VirtualMachineMemoryReservationInfo paramVirtualMachineMemoryReservationInfo) {
    this.virtualMachineReservation = paramVirtualMachineMemoryReservationInfo;
  }
  
  public HostStorageDeviceInfo getStorageDevice() {
    return this.storageDevice;
  }
  
  public void setStorageDevice(HostStorageDeviceInfo paramHostStorageDeviceInfo) {
    this.storageDevice = paramHostStorageDeviceInfo;
  }
  
  public HostMultipathStateInfo getMultipathState() {
    return this.multipathState;
  }
  
  public void setMultipathState(HostMultipathStateInfo paramHostMultipathStateInfo) {
    this.multipathState = paramHostMultipathStateInfo;
  }
  
  public HostFileSystemVolumeInfo getFileSystemVolume() {
    return this.fileSystemVolume;
  }
  
  public void setFileSystemVolume(HostFileSystemVolumeInfo paramHostFileSystemVolumeInfo) {
    this.fileSystemVolume = paramHostFileSystemVolumeInfo;
  }
  
  public List<String> getSystemFile() {
    if (this.systemFile == null)
      this.systemFile = new ArrayList<>(); 
    return this.systemFile;
  }
  
  public HostNetworkInfo getNetwork() {
    return this.network;
  }
  
  public void setNetwork(HostNetworkInfo paramHostNetworkInfo) {
    this.network = paramHostNetworkInfo;
  }
  
  public HostVMotionInfo getVmotion() {
    return this.vmotion;
  }
  
  public void setVmotion(HostVMotionInfo paramHostVMotionInfo) {
    this.vmotion = paramHostVMotionInfo;
  }
  
  public HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
    return this.virtualNicManagerInfo;
  }
  
  public void setVirtualNicManagerInfo(HostVirtualNicManagerInfo paramHostVirtualNicManagerInfo) {
    this.virtualNicManagerInfo = paramHostVirtualNicManagerInfo;
  }
  
  public HostNetCapabilities getCapabilities() {
    return this.capabilities;
  }
  
  public void setCapabilities(HostNetCapabilities paramHostNetCapabilities) {
    this.capabilities = paramHostNetCapabilities;
  }
  
  public HostDatastoreSystemCapabilities getDatastoreCapabilities() {
    return this.datastoreCapabilities;
  }
  
  public void setDatastoreCapabilities(HostDatastoreSystemCapabilities paramHostDatastoreSystemCapabilities) {
    this.datastoreCapabilities = paramHostDatastoreSystemCapabilities;
  }
  
  public HostNetOffloadCapabilities getOffloadCapabilities() {
    return this.offloadCapabilities;
  }
  
  public void setOffloadCapabilities(HostNetOffloadCapabilities paramHostNetOffloadCapabilities) {
    this.offloadCapabilities = paramHostNetOffloadCapabilities;
  }
  
  public HostServiceInfo getService() {
    return this.service;
  }
  
  public void setService(HostServiceInfo paramHostServiceInfo) {
    this.service = paramHostServiceInfo;
  }
  
  public HostFirewallInfo getFirewall() {
    return this.firewall;
  }
  
  public void setFirewall(HostFirewallInfo paramHostFirewallInfo) {
    this.firewall = paramHostFirewallInfo;
  }
  
  public HostAutoStartManagerConfig getAutoStart() {
    return this.autoStart;
  }
  
  public void setAutoStart(HostAutoStartManagerConfig paramHostAutoStartManagerConfig) {
    this.autoStart = paramHostAutoStartManagerConfig;
  }
  
  public HostDiagnosticPartition getActiveDiagnosticPartition() {
    return this.activeDiagnosticPartition;
  }
  
  public void setActiveDiagnosticPartition(HostDiagnosticPartition paramHostDiagnosticPartition) {
    this.activeDiagnosticPartition = paramHostDiagnosticPartition;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
  
  public List<OptionDef> getOptionDef() {
    if (this.optionDef == null)
      this.optionDef = new ArrayList<>(); 
    return this.optionDef;
  }
  
  public String getDatastorePrincipal() {
    return this.datastorePrincipal;
  }
  
  public void setDatastorePrincipal(String paramString) {
    this.datastorePrincipal = paramString;
  }
  
  public ManagedObjectReference getLocalSwapDatastore() {
    return this.localSwapDatastore;
  }
  
  public void setLocalSwapDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.localSwapDatastore = paramManagedObjectReference;
  }
  
  public HostSystemSwapConfiguration getSystemSwapConfiguration() {
    return this.systemSwapConfiguration;
  }
  
  public void setSystemSwapConfiguration(HostSystemSwapConfiguration paramHostSystemSwapConfiguration) {
    this.systemSwapConfiguration = paramHostSystemSwapConfiguration;
  }
  
  public HostSystemResourceInfo getSystemResources() {
    return this.systemResources;
  }
  
  public void setSystemResources(HostSystemResourceInfo paramHostSystemResourceInfo) {
    this.systemResources = paramHostSystemResourceInfo;
  }
  
  public HostDateTimeInfo getDateTimeInfo() {
    return this.dateTimeInfo;
  }
  
  public void setDateTimeInfo(HostDateTimeInfo paramHostDateTimeInfo) {
    this.dateTimeInfo = paramHostDateTimeInfo;
  }
  
  public HostFlagInfo getFlags() {
    return this.flags;
  }
  
  public void setFlags(HostFlagInfo paramHostFlagInfo) {
    this.flags = paramHostFlagInfo;
  }
  
  public Boolean isAdminDisabled() {
    return this.adminDisabled;
  }
  
  public void setAdminDisabled(Boolean paramBoolean) {
    this.adminDisabled = paramBoolean;
  }
  
  public HostLockdownMode getLockdownMode() {
    return this.lockdownMode;
  }
  
  public void setLockdownMode(HostLockdownMode paramHostLockdownMode) {
    this.lockdownMode = paramHostLockdownMode;
  }
  
  public HostIpmiInfo getIpmi() {
    return this.ipmi;
  }
  
  public void setIpmi(HostIpmiInfo paramHostIpmiInfo) {
    this.ipmi = paramHostIpmiInfo;
  }
  
  public HostSslThumbprintInfo getSslThumbprintInfo() {
    return this.sslThumbprintInfo;
  }
  
  public void setSslThumbprintInfo(HostSslThumbprintInfo paramHostSslThumbprintInfo) {
    this.sslThumbprintInfo = paramHostSslThumbprintInfo;
  }
  
  public List<HostSslThumbprintInfo> getSslThumbprintData() {
    if (this.sslThumbprintData == null)
      this.sslThumbprintData = new ArrayList<>(); 
    return this.sslThumbprintData;
  }
  
  public List<Byte> getCertificate() {
    if (this.certificate == null)
      this.certificate = new ArrayList<>(); 
    return this.certificate;
  }
  
  public List<HostPciPassthruInfo> getPciPassthruInfo() {
    if (this.pciPassthruInfo == null)
      this.pciPassthruInfo = new ArrayList<>(); 
    return this.pciPassthruInfo;
  }
  
  public HostAuthenticationManagerInfo getAuthenticationManagerInfo() {
    return this.authenticationManagerInfo;
  }
  
  public void setAuthenticationManagerInfo(HostAuthenticationManagerInfo paramHostAuthenticationManagerInfo) {
    this.authenticationManagerInfo = paramHostAuthenticationManagerInfo;
  }
  
  public List<HostFeatureVersionInfo> getFeatureVersion() {
    if (this.featureVersion == null)
      this.featureVersion = new ArrayList<>(); 
    return this.featureVersion;
  }
  
  public PowerSystemCapability getPowerSystemCapability() {
    return this.powerSystemCapability;
  }
  
  public void setPowerSystemCapability(PowerSystemCapability paramPowerSystemCapability) {
    this.powerSystemCapability = paramPowerSystemCapability;
  }
  
  public PowerSystemInfo getPowerSystemInfo() {
    return this.powerSystemInfo;
  }
  
  public void setPowerSystemInfo(PowerSystemInfo paramPowerSystemInfo) {
    this.powerSystemInfo = paramPowerSystemInfo;
  }
  
  public List<HostCacheConfigurationInfo> getCacheConfigurationInfo() {
    if (this.cacheConfigurationInfo == null)
      this.cacheConfigurationInfo = new ArrayList<>(); 
    return this.cacheConfigurationInfo;
  }
  
  public Boolean isWakeOnLanCapable() {
    return this.wakeOnLanCapable;
  }
  
  public void setWakeOnLanCapable(Boolean paramBoolean) {
    this.wakeOnLanCapable = paramBoolean;
  }
  
  public List<HostFeatureCapability> getFeatureCapability() {
    if (this.featureCapability == null)
      this.featureCapability = new ArrayList<>(); 
    return this.featureCapability;
  }
  
  public List<HostFeatureCapability> getMaskedFeatureCapability() {
    if (this.maskedFeatureCapability == null)
      this.maskedFeatureCapability = new ArrayList<>(); 
    return this.maskedFeatureCapability;
  }
  
  public HostVFlashManagerVFlashConfigInfo getVFlashConfigInfo() {
    return this.vFlashConfigInfo;
  }
  
  public void setVFlashConfigInfo(HostVFlashManagerVFlashConfigInfo paramHostVFlashManagerVFlashConfigInfo) {
    this.vFlashConfigInfo = paramHostVFlashManagerVFlashConfigInfo;
  }
  
  public VsanHostConfigInfo getVsanHostConfig() {
    return this.vsanHostConfig;
  }
  
  public void setVsanHostConfig(VsanHostConfigInfo paramVsanHostConfigInfo) {
    this.vsanHostConfig = paramVsanHostConfigInfo;
  }
  
  public List<String> getDomainList() {
    if (this.domainList == null)
      this.domainList = new ArrayList<>(); 
    return this.domainList;
  }
  
  public byte[] getScriptCheckSum() {
    return this.scriptCheckSum;
  }
  
  public void setScriptCheckSum(byte[] paramArrayOfbyte) {
    this.scriptCheckSum = paramArrayOfbyte;
  }
  
  public byte[] getHostConfigCheckSum() {
    return this.hostConfigCheckSum;
  }
  
  public void setHostConfigCheckSum(byte[] paramArrayOfbyte) {
    this.hostConfigCheckSum = paramArrayOfbyte;
  }
  
  public byte[] getDescriptionTreeCheckSum() {
    return this.descriptionTreeCheckSum;
  }
  
  public void setDescriptionTreeCheckSum(byte[] paramArrayOfbyte) {
    this.descriptionTreeCheckSum = paramArrayOfbyte;
  }
  
  public List<HostGraphicsInfo> getGraphicsInfo() {
    if (this.graphicsInfo == null)
      this.graphicsInfo = new ArrayList<>(); 
    return this.graphicsInfo;
  }
  
  public List<String> getSharedPassthruGpuTypes() {
    if (this.sharedPassthruGpuTypes == null)
      this.sharedPassthruGpuTypes = new ArrayList<>(); 
    return this.sharedPassthruGpuTypes;
  }
  
  public HostGraphicsConfig getGraphicsConfig() {
    return this.graphicsConfig;
  }
  
  public void setGraphicsConfig(HostGraphicsConfig paramHostGraphicsConfig) {
    this.graphicsConfig = paramHostGraphicsConfig;
  }
  
  public List<HostSharedGpuCapabilities> getSharedGpuCapabilities() {
    if (this.sharedGpuCapabilities == null)
      this.sharedGpuCapabilities = new ArrayList<>(); 
    return this.sharedGpuCapabilities;
  }
  
  public List<HostIoFilterInfo> getIoFilterInfo() {
    if (this.ioFilterInfo == null)
      this.ioFilterInfo = new ArrayList<>(); 
    return this.ioFilterInfo;
  }
  
  public List<HostSriovDevicePoolInfo> getSriovDevicePool() {
    if (this.sriovDevicePool == null)
      this.sriovDevicePool = new ArrayList<>(); 
    return this.sriovDevicePool;
  }
  
  public List<HostAssignableHardwareBinding> getAssignableHardwareBinding() {
    if (this.assignableHardwareBinding == null)
      this.assignableHardwareBinding = new ArrayList<>(); 
    return this.assignableHardwareBinding;
  }
  
  public HostAssignableHardwareConfig getAssignableHardwareConfig() {
    return this.assignableHardwareConfig;
  }
  
  public void setAssignableHardwareConfig(HostAssignableHardwareConfig paramHostAssignableHardwareConfig) {
    this.assignableHardwareConfig = paramHostAssignableHardwareConfig;
  }
}
