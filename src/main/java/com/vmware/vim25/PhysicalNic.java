package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FcoeConfig;
import com.vmware.vim25.PhysicalNic;
import com.vmware.vim25.PhysicalNicLinkInfo;
import com.vmware.vim25.PhysicalNicSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNic", propOrder = {"key", "device", "pci", "driver", "linkSpeed", "validLinkSpecification", "spec", "wakeOnLanSupported", "mac", "fcoeConfiguration", "vmDirectPathGen2Supported", "vmDirectPathGen2SupportedMode", "resourcePoolSchedulerAllowed", "resourcePoolSchedulerDisallowedReason", "autoNegotiateSupported", "enhancedNetworkingStackSupported", "ensInterruptSupported", "rdmaDevice"})
public class PhysicalNic extends DynamicData {
  protected String key;
  
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String pci;
  
  protected String driver;
  
  protected PhysicalNicLinkInfo linkSpeed;
  
  protected List<PhysicalNicLinkInfo> validLinkSpecification;
  
  @XmlElement(required = true)
  protected PhysicalNicSpec spec;
  
  protected boolean wakeOnLanSupported;
  
  @XmlElement(required = true)
  protected String mac;
  
  protected FcoeConfig fcoeConfiguration;
  
  protected Boolean vmDirectPathGen2Supported;
  
  protected String vmDirectPathGen2SupportedMode;
  
  protected Boolean resourcePoolSchedulerAllowed;
  
  protected List<String> resourcePoolSchedulerDisallowedReason;
  
  protected Boolean autoNegotiateSupported;
  
  protected Boolean enhancedNetworkingStackSupported;
  
  protected Boolean ensInterruptSupported;
  
  protected String rdmaDevice;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getPci() {
    return this.pci;
  }
  
  public void setPci(String paramString) {
    this.pci = paramString;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public void setDriver(String paramString) {
    this.driver = paramString;
  }
  
  public PhysicalNicLinkInfo getLinkSpeed() {
    return this.linkSpeed;
  }
  
  public void setLinkSpeed(PhysicalNicLinkInfo paramPhysicalNicLinkInfo) {
    this.linkSpeed = paramPhysicalNicLinkInfo;
  }
  
  public List<PhysicalNicLinkInfo> getValidLinkSpecification() {
    if (this.validLinkSpecification == null)
      this.validLinkSpecification = new ArrayList<>(); 
    return this.validLinkSpecification;
  }
  
  public PhysicalNicSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(PhysicalNicSpec paramPhysicalNicSpec) {
    this.spec = paramPhysicalNicSpec;
  }
  
  public boolean isWakeOnLanSupported() {
    return this.wakeOnLanSupported;
  }
  
  public void setWakeOnLanSupported(boolean paramBoolean) {
    this.wakeOnLanSupported = paramBoolean;
  }
  
  public String getMac() {
    return this.mac;
  }
  
  public void setMac(String paramString) {
    this.mac = paramString;
  }
  
  public FcoeConfig getFcoeConfiguration() {
    return this.fcoeConfiguration;
  }
  
  public void setFcoeConfiguration(FcoeConfig paramFcoeConfig) {
    this.fcoeConfiguration = paramFcoeConfig;
  }
  
  public Boolean isVmDirectPathGen2Supported() {
    return this.vmDirectPathGen2Supported;
  }
  
  public void setVmDirectPathGen2Supported(Boolean paramBoolean) {
    this.vmDirectPathGen2Supported = paramBoolean;
  }
  
  public String getVmDirectPathGen2SupportedMode() {
    return this.vmDirectPathGen2SupportedMode;
  }
  
  public void setVmDirectPathGen2SupportedMode(String paramString) {
    this.vmDirectPathGen2SupportedMode = paramString;
  }
  
  public Boolean isResourcePoolSchedulerAllowed() {
    return this.resourcePoolSchedulerAllowed;
  }
  
  public void setResourcePoolSchedulerAllowed(Boolean paramBoolean) {
    this.resourcePoolSchedulerAllowed = paramBoolean;
  }
  
  public List<String> getResourcePoolSchedulerDisallowedReason() {
    if (this.resourcePoolSchedulerDisallowedReason == null)
      this.resourcePoolSchedulerDisallowedReason = new ArrayList<>(); 
    return this.resourcePoolSchedulerDisallowedReason;
  }
  
  public Boolean isAutoNegotiateSupported() {
    return this.autoNegotiateSupported;
  }
  
  public void setAutoNegotiateSupported(Boolean paramBoolean) {
    this.autoNegotiateSupported = paramBoolean;
  }
  
  public Boolean isEnhancedNetworkingStackSupported() {
    return this.enhancedNetworkingStackSupported;
  }
  
  public void setEnhancedNetworkingStackSupported(Boolean paramBoolean) {
    this.enhancedNetworkingStackSupported = paramBoolean;
  }
  
  public Boolean isEnsInterruptSupported() {
    return this.ensInterruptSupported;
  }
  
  public void setEnsInterruptSupported(Boolean paramBoolean) {
    this.ensInterruptSupported = paramBoolean;
  }
  
  public String getRdmaDevice() {
    return this.rdmaDevice;
  }
  
  public void setRdmaDevice(String paramString) {
    this.rdmaDevice = paramString;
  }
}
