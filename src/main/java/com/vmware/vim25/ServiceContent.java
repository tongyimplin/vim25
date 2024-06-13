package com.vmware.vim25;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceContent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceContent", propOrder = {"rootFolder", "propertyCollector", "viewManager", "about", "setting", "userDirectory", "sessionManager", "authorizationManager", "serviceManager", "perfManager", "scheduledTaskManager", "alarmManager", "eventManager", "taskManager", "extensionManager", "customizationSpecManager", "guestCustomizationManager", "customFieldsManager", "accountManager", "diagnosticManager", "licenseManager", "searchIndex", "fileManager", "datastoreNamespaceManager", "virtualDiskManager", "virtualizationManager", "snmpSystem", "vmProvisioningChecker", "vmCompatibilityChecker", "ovfManager", "ipPoolManager", "dvSwitchManager", "hostProfileManager", "clusterProfileManager", "complianceManager", "localizationManager", "storageResourceManager", "guestOperationsManager", "overheadMemoryManager", "certificateManager", "ioFilterManager", "vStorageObjectManager", "hostSpecManager", "cryptoManager", "healthUpdateManager", "failoverClusterConfigurator", "failoverClusterManager", "tenantManager", "siteInfoManager", "storageQueryManager"})
public class ServiceContent extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference rootFolder;
  
  @XmlElement(required = true)
  protected ManagedObjectReference propertyCollector;
  
  protected ManagedObjectReference viewManager;
  
  @XmlElement(required = true)
  protected AboutInfo about;
  
  protected ManagedObjectReference setting;
  
  protected ManagedObjectReference userDirectory;
  
  protected ManagedObjectReference sessionManager;
  
  protected ManagedObjectReference authorizationManager;
  
  protected ManagedObjectReference serviceManager;
  
  protected ManagedObjectReference perfManager;
  
  protected ManagedObjectReference scheduledTaskManager;
  
  protected ManagedObjectReference alarmManager;
  
  protected ManagedObjectReference eventManager;
  
  protected ManagedObjectReference taskManager;
  
  protected ManagedObjectReference extensionManager;
  
  protected ManagedObjectReference customizationSpecManager;
  
  protected ManagedObjectReference guestCustomizationManager;
  
  protected ManagedObjectReference customFieldsManager;
  
  protected ManagedObjectReference accountManager;
  
  protected ManagedObjectReference diagnosticManager;
  
  protected ManagedObjectReference licenseManager;
  
  protected ManagedObjectReference searchIndex;
  
  protected ManagedObjectReference fileManager;
  
  protected ManagedObjectReference datastoreNamespaceManager;
  
  protected ManagedObjectReference virtualDiskManager;
  
  protected ManagedObjectReference virtualizationManager;
  
  protected ManagedObjectReference snmpSystem;
  
  protected ManagedObjectReference vmProvisioningChecker;
  
  protected ManagedObjectReference vmCompatibilityChecker;
  
  protected ManagedObjectReference ovfManager;
  
  protected ManagedObjectReference ipPoolManager;
  
  protected ManagedObjectReference dvSwitchManager;
  
  protected ManagedObjectReference hostProfileManager;
  
  protected ManagedObjectReference clusterProfileManager;
  
  protected ManagedObjectReference complianceManager;
  
  protected ManagedObjectReference localizationManager;
  
  protected ManagedObjectReference storageResourceManager;
  
  protected ManagedObjectReference guestOperationsManager;
  
  protected ManagedObjectReference overheadMemoryManager;
  
  protected ManagedObjectReference certificateManager;
  
  protected ManagedObjectReference ioFilterManager;
  
  protected ManagedObjectReference vStorageObjectManager;
  
  protected ManagedObjectReference hostSpecManager;
  
  protected ManagedObjectReference cryptoManager;
  
  protected ManagedObjectReference healthUpdateManager;
  
  protected ManagedObjectReference failoverClusterConfigurator;
  
  protected ManagedObjectReference failoverClusterManager;
  
  protected ManagedObjectReference tenantManager;
  
  protected ManagedObjectReference siteInfoManager;
  
  protected ManagedObjectReference storageQueryManager;
  
  public ManagedObjectReference getRootFolder() {
    return this.rootFolder;
  }
  
  public void setRootFolder(ManagedObjectReference paramManagedObjectReference) {
    this.rootFolder = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPropertyCollector() {
    return this.propertyCollector;
  }
  
  public void setPropertyCollector(ManagedObjectReference paramManagedObjectReference) {
    this.propertyCollector = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getViewManager() {
    return this.viewManager;
  }
  
  public void setViewManager(ManagedObjectReference paramManagedObjectReference) {
    this.viewManager = paramManagedObjectReference;
  }
  
  public AboutInfo getAbout() {
    return this.about;
  }
  
  public void setAbout(AboutInfo paramAboutInfo) {
    this.about = paramAboutInfo;
  }
  
  public ManagedObjectReference getSetting() {
    return this.setting;
  }
  
  public void setSetting(ManagedObjectReference paramManagedObjectReference) {
    this.setting = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getUserDirectory() {
    return this.userDirectory;
  }
  
  public void setUserDirectory(ManagedObjectReference paramManagedObjectReference) {
    this.userDirectory = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSessionManager() {
    return this.sessionManager;
  }
  
  public void setSessionManager(ManagedObjectReference paramManagedObjectReference) {
    this.sessionManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAuthorizationManager() {
    return this.authorizationManager;
  }
  
  public void setAuthorizationManager(ManagedObjectReference paramManagedObjectReference) {
    this.authorizationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getServiceManager() {
    return this.serviceManager;
  }
  
  public void setServiceManager(ManagedObjectReference paramManagedObjectReference) {
    this.serviceManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPerfManager() {
    return this.perfManager;
  }
  
  public void setPerfManager(ManagedObjectReference paramManagedObjectReference) {
    this.perfManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getScheduledTaskManager() {
    return this.scheduledTaskManager;
  }
  
  public void setScheduledTaskManager(ManagedObjectReference paramManagedObjectReference) {
    this.scheduledTaskManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAlarmManager() {
    return this.alarmManager;
  }
  
  public void setAlarmManager(ManagedObjectReference paramManagedObjectReference) {
    this.alarmManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEventManager() {
    return this.eventManager;
  }
  
  public void setEventManager(ManagedObjectReference paramManagedObjectReference) {
    this.eventManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getTaskManager() {
    return this.taskManager;
  }
  
  public void setTaskManager(ManagedObjectReference paramManagedObjectReference) {
    this.taskManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getExtensionManager() {
    return this.extensionManager;
  }
  
  public void setExtensionManager(ManagedObjectReference paramManagedObjectReference) {
    this.extensionManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCustomizationSpecManager() {
    return this.customizationSpecManager;
  }
  
  public void setCustomizationSpecManager(ManagedObjectReference paramManagedObjectReference) {
    this.customizationSpecManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getGuestCustomizationManager() {
    return this.guestCustomizationManager;
  }
  
  public void setGuestCustomizationManager(ManagedObjectReference paramManagedObjectReference) {
    this.guestCustomizationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCustomFieldsManager() {
    return this.customFieldsManager;
  }
  
  public void setCustomFieldsManager(ManagedObjectReference paramManagedObjectReference) {
    this.customFieldsManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAccountManager() {
    return this.accountManager;
  }
  
  public void setAccountManager(ManagedObjectReference paramManagedObjectReference) {
    this.accountManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDiagnosticManager() {
    return this.diagnosticManager;
  }
  
  public void setDiagnosticManager(ManagedObjectReference paramManagedObjectReference) {
    this.diagnosticManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getLicenseManager() {
    return this.licenseManager;
  }
  
  public void setLicenseManager(ManagedObjectReference paramManagedObjectReference) {
    this.licenseManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSearchIndex() {
    return this.searchIndex;
  }
  
  public void setSearchIndex(ManagedObjectReference paramManagedObjectReference) {
    this.searchIndex = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFileManager() {
    return this.fileManager;
  }
  
  public void setFileManager(ManagedObjectReference paramManagedObjectReference) {
    this.fileManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastoreNamespaceManager() {
    return this.datastoreNamespaceManager;
  }
  
  public void setDatastoreNamespaceManager(ManagedObjectReference paramManagedObjectReference) {
    this.datastoreNamespaceManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVirtualDiskManager() {
    return this.virtualDiskManager;
  }
  
  public void setVirtualDiskManager(ManagedObjectReference paramManagedObjectReference) {
    this.virtualDiskManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVirtualizationManager() {
    return this.virtualizationManager;
  }
  
  public void setVirtualizationManager(ManagedObjectReference paramManagedObjectReference) {
    this.virtualizationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSnmpSystem() {
    return this.snmpSystem;
  }
  
  public void setSnmpSystem(ManagedObjectReference paramManagedObjectReference) {
    this.snmpSystem = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVmProvisioningChecker() {
    return this.vmProvisioningChecker;
  }
  
  public void setVmProvisioningChecker(ManagedObjectReference paramManagedObjectReference) {
    this.vmProvisioningChecker = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVmCompatibilityChecker() {
    return this.vmCompatibilityChecker;
  }
  
  public void setVmCompatibilityChecker(ManagedObjectReference paramManagedObjectReference) {
    this.vmCompatibilityChecker = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getOvfManager() {
    return this.ovfManager;
  }
  
  public void setOvfManager(ManagedObjectReference paramManagedObjectReference) {
    this.ovfManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getIpPoolManager() {
    return this.ipPoolManager;
  }
  
  public void setIpPoolManager(ManagedObjectReference paramManagedObjectReference) {
    this.ipPoolManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDvSwitchManager() {
    return this.dvSwitchManager;
  }
  
  public void setDvSwitchManager(ManagedObjectReference paramManagedObjectReference) {
    this.dvSwitchManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHostProfileManager() {
    return this.hostProfileManager;
  }
  
  public void setHostProfileManager(ManagedObjectReference paramManagedObjectReference) {
    this.hostProfileManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getClusterProfileManager() {
    return this.clusterProfileManager;
  }
  
  public void setClusterProfileManager(ManagedObjectReference paramManagedObjectReference) {
    this.clusterProfileManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getComplianceManager() {
    return this.complianceManager;
  }
  
  public void setComplianceManager(ManagedObjectReference paramManagedObjectReference) {
    this.complianceManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getLocalizationManager() {
    return this.localizationManager;
  }
  
  public void setLocalizationManager(ManagedObjectReference paramManagedObjectReference) {
    this.localizationManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getStorageResourceManager() {
    return this.storageResourceManager;
  }
  
  public void setStorageResourceManager(ManagedObjectReference paramManagedObjectReference) {
    this.storageResourceManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getGuestOperationsManager() {
    return this.guestOperationsManager;
  }
  
  public void setGuestOperationsManager(ManagedObjectReference paramManagedObjectReference) {
    this.guestOperationsManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getOverheadMemoryManager() {
    return this.overheadMemoryManager;
  }
  
  public void setOverheadMemoryManager(ManagedObjectReference paramManagedObjectReference) {
    this.overheadMemoryManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCertificateManager() {
    return this.certificateManager;
  }
  
  public void setCertificateManager(ManagedObjectReference paramManagedObjectReference) {
    this.certificateManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getIoFilterManager() {
    return this.ioFilterManager;
  }
  
  public void setIoFilterManager(ManagedObjectReference paramManagedObjectReference) {
    this.ioFilterManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVStorageObjectManager() {
    return this.vStorageObjectManager;
  }
  
  public void setVStorageObjectManager(ManagedObjectReference paramManagedObjectReference) {
    this.vStorageObjectManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHostSpecManager() {
    return this.hostSpecManager;
  }
  
  public void setHostSpecManager(ManagedObjectReference paramManagedObjectReference) {
    this.hostSpecManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCryptoManager() {
    return this.cryptoManager;
  }
  
  public void setCryptoManager(ManagedObjectReference paramManagedObjectReference) {
    this.cryptoManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHealthUpdateManager() {
    return this.healthUpdateManager;
  }
  
  public void setHealthUpdateManager(ManagedObjectReference paramManagedObjectReference) {
    this.healthUpdateManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFailoverClusterConfigurator() {
    return this.failoverClusterConfigurator;
  }
  
  public void setFailoverClusterConfigurator(ManagedObjectReference paramManagedObjectReference) {
    this.failoverClusterConfigurator = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFailoverClusterManager() {
    return this.failoverClusterManager;
  }
  
  public void setFailoverClusterManager(ManagedObjectReference paramManagedObjectReference) {
    this.failoverClusterManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getTenantManager() {
    return this.tenantManager;
  }
  
  public void setTenantManager(ManagedObjectReference paramManagedObjectReference) {
    this.tenantManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSiteInfoManager() {
    return this.siteInfoManager;
  }
  
  public void setSiteInfoManager(ManagedObjectReference paramManagedObjectReference) {
    this.siteInfoManager = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getStorageQueryManager() {
    return this.storageQueryManager;
  }
  
  public void setStorageQueryManager(ManagedObjectReference paramManagedObjectReference) {
    this.storageQueryManager = paramManagedObjectReference;
  }
}
