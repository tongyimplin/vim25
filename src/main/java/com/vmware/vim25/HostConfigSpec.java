package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostActiveDirectory;
import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.HostFirewallConfig;
import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.HostLicenseSpec;
import com.vmware.vim25.HostMemorySpec;
import com.vmware.vim25.HostNasVolumeConfig;
import com.vmware.vim25.HostNetworkConfig;
import com.vmware.vim25.HostSecuritySpec;
import com.vmware.vim25.HostServiceConfig;
import com.vmware.vim25.HostStorageDeviceInfo;
import com.vmware.vim25.HostVirtualNicManagerNicTypeSelection;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigSpec", propOrder = {"nasDatastore", "network", "nicTypeSelection", "service", "firewall", "option", "datastorePrincipal", "datastorePrincipalPasswd", "datetime", "storageDevice", "license", "security", "userAccount", "usergroupAccount", "memory", "activeDirectory", "genericConfig", "graphicsConfig", "assignableHardwareConfig"})
public class HostConfigSpec extends DynamicData {
  protected List<HostNasVolumeConfig> nasDatastore;
  
  protected HostNetworkConfig network;
  
  protected List<HostVirtualNicManagerNicTypeSelection> nicTypeSelection;
  
  protected List<HostServiceConfig> service;
  
  protected HostFirewallConfig firewall;
  
  protected List<OptionValue> option;
  
  protected String datastorePrincipal;
  
  protected String datastorePrincipalPasswd;
  
  protected HostDateTimeConfig datetime;
  
  protected HostStorageDeviceInfo storageDevice;
  
  protected HostLicenseSpec license;
  
  protected HostSecuritySpec security;
  
  protected List<HostAccountSpec> userAccount;
  
  protected List<HostAccountSpec> usergroupAccount;
  
  protected HostMemorySpec memory;
  
  protected List<HostActiveDirectory> activeDirectory;
  
  protected List<KeyAnyValue> genericConfig;
  
  protected HostGraphicsConfig graphicsConfig;
  
  protected HostAssignableHardwareConfig assignableHardwareConfig;
  
  public List<HostNasVolumeConfig> getNasDatastore() {
    if (this.nasDatastore == null)
      this.nasDatastore = new ArrayList<>(); 
    return this.nasDatastore;
  }
  
  public HostNetworkConfig getNetwork() {
    return this.network;
  }
  
  public void setNetwork(HostNetworkConfig paramHostNetworkConfig) {
    this.network = paramHostNetworkConfig;
  }
  
  public List<HostVirtualNicManagerNicTypeSelection> getNicTypeSelection() {
    if (this.nicTypeSelection == null)
      this.nicTypeSelection = new ArrayList<>(); 
    return this.nicTypeSelection;
  }
  
  public List<HostServiceConfig> getService() {
    if (this.service == null)
      this.service = new ArrayList<>(); 
    return this.service;
  }
  
  public HostFirewallConfig getFirewall() {
    return this.firewall;
  }
  
  public void setFirewall(HostFirewallConfig paramHostFirewallConfig) {
    this.firewall = paramHostFirewallConfig;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
  
  public String getDatastorePrincipal() {
    return this.datastorePrincipal;
  }
  
  public void setDatastorePrincipal(String paramString) {
    this.datastorePrincipal = paramString;
  }
  
  public String getDatastorePrincipalPasswd() {
    return this.datastorePrincipalPasswd;
  }
  
  public void setDatastorePrincipalPasswd(String paramString) {
    this.datastorePrincipalPasswd = paramString;
  }
  
  public HostDateTimeConfig getDatetime() {
    return this.datetime;
  }
  
  public void setDatetime(HostDateTimeConfig paramHostDateTimeConfig) {
    this.datetime = paramHostDateTimeConfig;
  }
  
  public HostStorageDeviceInfo getStorageDevice() {
    return this.storageDevice;
  }
  
  public void setStorageDevice(HostStorageDeviceInfo paramHostStorageDeviceInfo) {
    this.storageDevice = paramHostStorageDeviceInfo;
  }
  
  public HostLicenseSpec getLicense() {
    return this.license;
  }
  
  public void setLicense(HostLicenseSpec paramHostLicenseSpec) {
    this.license = paramHostLicenseSpec;
  }
  
  public HostSecuritySpec getSecurity() {
    return this.security;
  }
  
  public void setSecurity(HostSecuritySpec paramHostSecuritySpec) {
    this.security = paramHostSecuritySpec;
  }
  
  public List<HostAccountSpec> getUserAccount() {
    if (this.userAccount == null)
      this.userAccount = new ArrayList<>(); 
    return this.userAccount;
  }
  
  public List<HostAccountSpec> getUsergroupAccount() {
    if (this.usergroupAccount == null)
      this.usergroupAccount = new ArrayList<>(); 
    return this.usergroupAccount;
  }
  
  public HostMemorySpec getMemory() {
    return this.memory;
  }
  
  public void setMemory(HostMemorySpec paramHostMemorySpec) {
    this.memory = paramHostMemorySpec;
  }
  
  public List<HostActiveDirectory> getActiveDirectory() {
    if (this.activeDirectory == null)
      this.activeDirectory = new ArrayList<>(); 
    return this.activeDirectory;
  }
  
  public List<KeyAnyValue> getGenericConfig() {
    if (this.genericConfig == null)
      this.genericConfig = new ArrayList<>(); 
    return this.genericConfig;
  }
  
  public HostGraphicsConfig getGraphicsConfig() {
    return this.graphicsConfig;
  }
  
  public void setGraphicsConfig(HostGraphicsConfig paramHostGraphicsConfig) {
    this.graphicsConfig = paramHostGraphicsConfig;
  }
  
  public HostAssignableHardwareConfig getAssignableHardwareConfig() {
    return this.assignableHardwareConfig;
  }
  
  public void setAssignableHardwareConfig(HostAssignableHardwareConfig paramHostAssignableHardwareConfig) {
    this.assignableHardwareConfig = paramHostAssignableHardwareConfig;
  }
}
