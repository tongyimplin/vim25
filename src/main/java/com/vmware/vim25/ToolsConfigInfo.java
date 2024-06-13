package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ToolsConfigInfo;
import com.vmware.vim25.ToolsConfigInfoToolsLastInstallInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolsConfigInfo", propOrder = {"toolsVersion", "toolsInstallType", "afterPowerOn", "afterResume", "beforeGuestStandby", "beforeGuestShutdown", "beforeGuestReboot", "toolsUpgradePolicy", "pendingCustomization", "customizationKeyId", "syncTimeWithHost", "lastInstallInfo"})
public class ToolsConfigInfo extends DynamicData {
  protected Integer toolsVersion;
  
  protected String toolsInstallType;
  
  protected Boolean afterPowerOn;
  
  protected Boolean afterResume;
  
  protected Boolean beforeGuestStandby;
  
  protected Boolean beforeGuestShutdown;
  
  protected Boolean beforeGuestReboot;
  
  protected String toolsUpgradePolicy;
  
  protected String pendingCustomization;
  
  protected CryptoKeyId customizationKeyId;
  
  protected Boolean syncTimeWithHost;
  
  protected ToolsConfigInfoToolsLastInstallInfo lastInstallInfo;
  
  public Integer getToolsVersion() {
    return this.toolsVersion;
  }
  
  public void setToolsVersion(Integer paramInteger) {
    this.toolsVersion = paramInteger;
  }
  
  public String getToolsInstallType() {
    return this.toolsInstallType;
  }
  
  public void setToolsInstallType(String paramString) {
    this.toolsInstallType = paramString;
  }
  
  public Boolean isAfterPowerOn() {
    return this.afterPowerOn;
  }
  
  public void setAfterPowerOn(Boolean paramBoolean) {
    this.afterPowerOn = paramBoolean;
  }
  
  public Boolean isAfterResume() {
    return this.afterResume;
  }
  
  public void setAfterResume(Boolean paramBoolean) {
    this.afterResume = paramBoolean;
  }
  
  public Boolean isBeforeGuestStandby() {
    return this.beforeGuestStandby;
  }
  
  public void setBeforeGuestStandby(Boolean paramBoolean) {
    this.beforeGuestStandby = paramBoolean;
  }
  
  public Boolean isBeforeGuestShutdown() {
    return this.beforeGuestShutdown;
  }
  
  public void setBeforeGuestShutdown(Boolean paramBoolean) {
    this.beforeGuestShutdown = paramBoolean;
  }
  
  public Boolean isBeforeGuestReboot() {
    return this.beforeGuestReboot;
  }
  
  public void setBeforeGuestReboot(Boolean paramBoolean) {
    this.beforeGuestReboot = paramBoolean;
  }
  
  public String getToolsUpgradePolicy() {
    return this.toolsUpgradePolicy;
  }
  
  public void setToolsUpgradePolicy(String paramString) {
    this.toolsUpgradePolicy = paramString;
  }
  
  public String getPendingCustomization() {
    return this.pendingCustomization;
  }
  
  public void setPendingCustomization(String paramString) {
    this.pendingCustomization = paramString;
  }
  
  public CryptoKeyId getCustomizationKeyId() {
    return this.customizationKeyId;
  }
  
  public void setCustomizationKeyId(CryptoKeyId paramCryptoKeyId) {
    this.customizationKeyId = paramCryptoKeyId;
  }
  
  public Boolean isSyncTimeWithHost() {
    return this.syncTimeWithHost;
  }
  
  public void setSyncTimeWithHost(Boolean paramBoolean) {
    this.syncTimeWithHost = paramBoolean;
  }
  
  public ToolsConfigInfoToolsLastInstallInfo getLastInstallInfo() {
    return this.lastInstallInfo;
  }
  
  public void setLastInstallInfo(ToolsConfigInfoToolsLastInstallInfo paramToolsConfigInfoToolsLastInstallInfo) {
    this.lastInstallInfo = paramToolsConfigInfoToolsLastInstallInfo;
  }
}
