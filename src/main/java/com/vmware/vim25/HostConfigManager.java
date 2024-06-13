package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConfigManager;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigManager", propOrder = {"cpuScheduler", "datastoreSystem", "memoryManager", "storageSystem", "networkSystem", "vmotionSystem", "virtualNicManager", "serviceSystem", "firewallSystem", "advancedOption", "diagnosticSystem", "autoStartManager", "snmpSystem", "dateTimeSystem", "patchManager", "imageConfigManager", "bootDeviceSystem", "firmwareSystem", "healthStatusSystem", "pciPassthruSystem", "licenseManager", "kernelModuleSystem", "authenticationManager", "powerSystem", "cacheConfigurationManager", "esxAgentHostManager", "iscsiManager", "vFlashManager", "vsanSystem", "messageBusProxy", "userDirectory", "accountManager", "hostAccessManager", "graphicsManager", "vsanInternalSystem", "certificateManager", "cryptoManager", "nvdimmSystem", "assignableHardwareManager"})
public class HostConfigManager extends DynamicData {
  protected ManagedObjectReference cpuScheduler;
  
  protected ManagedObjectReference datastoreSystem;
  
  protected ManagedObjectReference memoryManager;
  
  protected ManagedObjectReference storageSystem;
  
  protected ManagedObjectReference networkSystem;
  
  protected ManagedObjectReference vmotionSystem;
  
  protected ManagedObjectReference virtualNicManager;
  
  protected ManagedObjectReference serviceSystem;
  
  protected ManagedObjectReference firewallSystem;
  
  protected ManagedObjectReference advancedOption;
  
  protected ManagedObjectReference diagnosticSystem;
  
  protected ManagedObjectReference autoStartManager;
  
  protected ManagedObjectReference snmpSystem;
  
  protected ManagedObjectReference dateTimeSystem;
  
  protected ManagedObjectReference patchManager;
  
  protected ManagedObjectReference imageConfigManager;
  
  protected ManagedObjectReference bootDeviceSystem;
  
  protected ManagedObjectReference firmwareSystem;
  
  protected ManagedObjectReference healthStatusSystem;
  
  protected ManagedObjectReference pciPassthruSystem;
  
  protected ManagedObjectReference licenseManager;
  
  protected ManagedObjectReference kernelModuleSystem;
  
  protected ManagedObjectReference authenticationManager;
  
  protected ManagedObjectReference powerSystem;
  
  protected ManagedObjectReference cacheConfigurationManager;
  
  protected ManagedObjectReference esxAgentHostManager;
  
  protected ManagedObjectReference iscsiManager;
  
  protected ManagedObjectReference vFlashManager;
  
  protected ManagedObjectReference vsanSystem;
  
  protected ManagedObjectReference messageBusProxy;
  
  protected ManagedObjectReference userDirectory;
  
  protected ManagedObjectReference accountManager;
  
  protected ManagedObjectReference hostAccessManager;
  
  protected ManagedObjectReference graphicsManager;
  
  protected ManagedObjectReference vsanInternalSystem;
  
  protected ManagedObjectReference certificateManager;
  
  protected ManagedObjectReference cryptoManager;
  
  protected ManagedObjectReference nvdimmSystem;
  
  protected ManagedObjectReference assignableHardwareManager;
  
  public ManagedObjectReference getCpuScheduler() {
    return this.cpuScheduler;
  }
  
  public void setCpuScheduler(ManagedObjectReference paramManagedObjectReference) {
    this.cpuScheduler = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastoreSystem() {
    return this.datastoreSystem;
  }
  
  public void setDatastoreSystem(ManagedObjectReference paramManagedObjectReference) {
    this.datastoreSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getMemoryManager() {
    return this.memoryManager;
  }
  
  public void setMemoryManager(ManagedObjectReference paramManagedObjectReference) {
    this.memoryManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getStorageSystem() {
    return this.storageSystem;
  }
  
  public void setStorageSystem(ManagedObjectReference paramManagedObjectReference) {
    this.storageSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getNetworkSystem() {
    return this.networkSystem;
  }
  
  public void setNetworkSystem(ManagedObjectReference paramManagedObjectReference) {
    this.networkSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVmotionSystem() {
    return this.vmotionSystem;
  }
  
  public void setVmotionSystem(ManagedObjectReference paramManagedObjectReference) {
    this.vmotionSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVirtualNicManager() {
    return this.virtualNicManager;
  }
  
  public void setVirtualNicManager(ManagedObjectReference paramManagedObjectReference) {
    this.virtualNicManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getServiceSystem() {
    return this.serviceSystem;
  }
  
  public void setServiceSystem(ManagedObjectReference paramManagedObjectReference) {
    this.serviceSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFirewallSystem() {
    return this.firewallSystem;
  }
  
  public void setFirewallSystem(ManagedObjectReference paramManagedObjectReference) {
    this.firewallSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAdvancedOption() {
    return this.advancedOption;
  }
  
  public void setAdvancedOption(ManagedObjectReference paramManagedObjectReference) {
    this.advancedOption = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDiagnosticSystem() {
    return this.diagnosticSystem;
  }
  
  public void setDiagnosticSystem(ManagedObjectReference paramManagedObjectReference) {
    this.diagnosticSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAutoStartManager() {
    return this.autoStartManager;
  }
  
  public void setAutoStartManager(ManagedObjectReference paramManagedObjectReference) {
    this.autoStartManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSnmpSystem() {
    return this.snmpSystem;
  }
  
  public void setSnmpSystem(ManagedObjectReference paramManagedObjectReference) {
    this.snmpSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDateTimeSystem() {
    return this.dateTimeSystem;
  }
  
  public void setDateTimeSystem(ManagedObjectReference paramManagedObjectReference) {
    this.dateTimeSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPatchManager() {
    return this.patchManager;
  }
  
  public void setPatchManager(ManagedObjectReference paramManagedObjectReference) {
    this.patchManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getImageConfigManager() {
    return this.imageConfigManager;
  }
  
  public void setImageConfigManager(ManagedObjectReference paramManagedObjectReference) {
    this.imageConfigManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getBootDeviceSystem() {
    return this.bootDeviceSystem;
  }
  
  public void setBootDeviceSystem(ManagedObjectReference paramManagedObjectReference) {
    this.bootDeviceSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFirmwareSystem() {
    return this.firmwareSystem;
  }
  
  public void setFirmwareSystem(ManagedObjectReference paramManagedObjectReference) {
    this.firmwareSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHealthStatusSystem() {
    return this.healthStatusSystem;
  }
  
  public void setHealthStatusSystem(ManagedObjectReference paramManagedObjectReference) {
    this.healthStatusSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPciPassthruSystem() {
    return this.pciPassthruSystem;
  }
  
  public void setPciPassthruSystem(ManagedObjectReference paramManagedObjectReference) {
    this.pciPassthruSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getLicenseManager() {
    return this.licenseManager;
  }
  
  public void setLicenseManager(ManagedObjectReference paramManagedObjectReference) {
    this.licenseManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getKernelModuleSystem() {
    return this.kernelModuleSystem;
  }
  
  public void setKernelModuleSystem(ManagedObjectReference paramManagedObjectReference) {
    this.kernelModuleSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAuthenticationManager() {
    return this.authenticationManager;
  }
  
  public void setAuthenticationManager(ManagedObjectReference paramManagedObjectReference) {
    this.authenticationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPowerSystem() {
    return this.powerSystem;
  }
  
  public void setPowerSystem(ManagedObjectReference paramManagedObjectReference) {
    this.powerSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCacheConfigurationManager() {
    return this.cacheConfigurationManager;
  }
  
  public void setCacheConfigurationManager(ManagedObjectReference paramManagedObjectReference) {
    this.cacheConfigurationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEsxAgentHostManager() {
    return this.esxAgentHostManager;
  }
  
  public void setEsxAgentHostManager(ManagedObjectReference paramManagedObjectReference) {
    this.esxAgentHostManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getIscsiManager() {
    return this.iscsiManager;
  }
  
  public void setIscsiManager(ManagedObjectReference paramManagedObjectReference) {
    this.iscsiManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVFlashManager() {
    return this.vFlashManager;
  }
  
  public void setVFlashManager(ManagedObjectReference paramManagedObjectReference) {
    this.vFlashManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVsanSystem() {
    return this.vsanSystem;
  }
  
  public void setVsanSystem(ManagedObjectReference paramManagedObjectReference) {
    this.vsanSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getMessageBusProxy() {
    return this.messageBusProxy;
  }
  
  public void setMessageBusProxy(ManagedObjectReference paramManagedObjectReference) {
    this.messageBusProxy = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getUserDirectory() {
    return this.userDirectory;
  }
  
  public void setUserDirectory(ManagedObjectReference paramManagedObjectReference) {
    this.userDirectory = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAccountManager() {
    return this.accountManager;
  }
  
  public void setAccountManager(ManagedObjectReference paramManagedObjectReference) {
    this.accountManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHostAccessManager() {
    return this.hostAccessManager;
  }
  
  public void setHostAccessManager(ManagedObjectReference paramManagedObjectReference) {
    this.hostAccessManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getGraphicsManager() {
    return this.graphicsManager;
  }
  
  public void setGraphicsManager(ManagedObjectReference paramManagedObjectReference) {
    this.graphicsManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVsanInternalSystem() {
    return this.vsanInternalSystem;
  }
  
  public void setVsanInternalSystem(ManagedObjectReference paramManagedObjectReference) {
    this.vsanInternalSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCertificateManager() {
    return this.certificateManager;
  }
  
  public void setCertificateManager(ManagedObjectReference paramManagedObjectReference) {
    this.certificateManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCryptoManager() {
    return this.cryptoManager;
  }
  
  public void setCryptoManager(ManagedObjectReference paramManagedObjectReference) {
    this.cryptoManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getNvdimmSystem() {
    return this.nvdimmSystem;
  }
  
  public void setNvdimmSystem(ManagedObjectReference paramManagedObjectReference) {
    this.nvdimmSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAssignableHardwareManager() {
    return this.assignableHardwareManager;
  }
  
  public void setAssignableHardwareManager(ManagedObjectReference paramManagedObjectReference) {
    this.assignableHardwareManager = paramManagedObjectReference;
  }
}
