package com.vmware.vim25;

import com.vmware.vim25.HostHostBusAdapter;
import com.vmware.vim25.HostInternetScsiHba;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import com.vmware.vim25.HostInternetScsiHbaDigestCapabilities;
import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties;
import com.vmware.vim25.HostInternetScsiHbaIPCapabilities;
import com.vmware.vim25.HostInternetScsiHbaIPProperties;
import com.vmware.vim25.HostInternetScsiHbaNetworkBindingSupportType;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaSendTarget;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.OptionDef;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHba", propOrder = {"isSoftwareBased", "canBeDisabled", "networkBindingSupport", "discoveryCapabilities", "discoveryProperties", "authenticationCapabilities", "authenticationProperties", "digestCapabilities", "digestProperties", "ipCapabilities", "ipProperties", "supportedAdvancedOptions", "advancedOptions", "iScsiName", "iScsiAlias", "configuredSendTarget", "configuredStaticTarget", "maxSpeedMb", "currentSpeedMb"})
public class HostInternetScsiHba extends HostHostBusAdapter {
  protected boolean isSoftwareBased;
  
  protected Boolean canBeDisabled;
  
  protected HostInternetScsiHbaNetworkBindingSupportType networkBindingSupport;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaDiscoveryProperties discoveryProperties;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaAuthenticationProperties authenticationProperties;
  
  protected HostInternetScsiHbaDigestCapabilities digestCapabilities;
  
  protected HostInternetScsiHbaDigestProperties digestProperties;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaIPCapabilities ipCapabilities;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaIPProperties ipProperties;
  
  protected List<OptionDef> supportedAdvancedOptions;
  
  protected List<HostInternetScsiHbaParamValue> advancedOptions;
  
  @XmlElement(required = true)
  protected String iScsiName;
  
  protected String iScsiAlias;
  
  protected List<HostInternetScsiHbaSendTarget> configuredSendTarget;
  
  protected List<HostInternetScsiHbaStaticTarget> configuredStaticTarget;
  
  protected Integer maxSpeedMb;
  
  protected Integer currentSpeedMb;
  
  public boolean isIsSoftwareBased() {
    return this.isSoftwareBased;
  }
  
  public void setIsSoftwareBased(boolean paramBoolean) {
    this.isSoftwareBased = paramBoolean;
  }
  
  public Boolean isCanBeDisabled() {
    return this.canBeDisabled;
  }
  
  public void setCanBeDisabled(Boolean paramBoolean) {
    this.canBeDisabled = paramBoolean;
  }
  
  public HostInternetScsiHbaNetworkBindingSupportType getNetworkBindingSupport() {
    return this.networkBindingSupport;
  }
  
  public void setNetworkBindingSupport(HostInternetScsiHbaNetworkBindingSupportType paramHostInternetScsiHbaNetworkBindingSupportType) {
    this.networkBindingSupport = paramHostInternetScsiHbaNetworkBindingSupportType;
  }
  
  public HostInternetScsiHbaDiscoveryCapabilities getDiscoveryCapabilities() {
    return this.discoveryCapabilities;
  }
  
  public void setDiscoveryCapabilities(HostInternetScsiHbaDiscoveryCapabilities paramHostInternetScsiHbaDiscoveryCapabilities) {
    this.discoveryCapabilities = paramHostInternetScsiHbaDiscoveryCapabilities;
  }
  
  public HostInternetScsiHbaDiscoveryProperties getDiscoveryProperties() {
    return this.discoveryProperties;
  }
  
  public void setDiscoveryProperties(HostInternetScsiHbaDiscoveryProperties paramHostInternetScsiHbaDiscoveryProperties) {
    this.discoveryProperties = paramHostInternetScsiHbaDiscoveryProperties;
  }
  
  public HostInternetScsiHbaAuthenticationCapabilities getAuthenticationCapabilities() {
    return this.authenticationCapabilities;
  }
  
  public void setAuthenticationCapabilities(HostInternetScsiHbaAuthenticationCapabilities paramHostInternetScsiHbaAuthenticationCapabilities) {
    this.authenticationCapabilities = paramHostInternetScsiHbaAuthenticationCapabilities;
  }
  
  public HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
    return this.authenticationProperties;
  }
  
  public void setAuthenticationProperties(HostInternetScsiHbaAuthenticationProperties paramHostInternetScsiHbaAuthenticationProperties) {
    this.authenticationProperties = paramHostInternetScsiHbaAuthenticationProperties;
  }
  
  public HostInternetScsiHbaDigestCapabilities getDigestCapabilities() {
    return this.digestCapabilities;
  }
  
  public void setDigestCapabilities(HostInternetScsiHbaDigestCapabilities paramHostInternetScsiHbaDigestCapabilities) {
    this.digestCapabilities = paramHostInternetScsiHbaDigestCapabilities;
  }
  
  public HostInternetScsiHbaDigestProperties getDigestProperties() {
    return this.digestProperties;
  }
  
  public void setDigestProperties(HostInternetScsiHbaDigestProperties paramHostInternetScsiHbaDigestProperties) {
    this.digestProperties = paramHostInternetScsiHbaDigestProperties;
  }
  
  public HostInternetScsiHbaIPCapabilities getIpCapabilities() {
    return this.ipCapabilities;
  }
  
  public void setIpCapabilities(HostInternetScsiHbaIPCapabilities paramHostInternetScsiHbaIPCapabilities) {
    this.ipCapabilities = paramHostInternetScsiHbaIPCapabilities;
  }
  
  public HostInternetScsiHbaIPProperties getIpProperties() {
    return this.ipProperties;
  }
  
  public void setIpProperties(HostInternetScsiHbaIPProperties paramHostInternetScsiHbaIPProperties) {
    this.ipProperties = paramHostInternetScsiHbaIPProperties;
  }
  
  public List<OptionDef> getSupportedAdvancedOptions() {
    if (this.supportedAdvancedOptions == null)
      this.supportedAdvancedOptions = new ArrayList<>(); 
    return this.supportedAdvancedOptions;
  }
  
  public List<HostInternetScsiHbaParamValue> getAdvancedOptions() {
    if (this.advancedOptions == null)
      this.advancedOptions = new ArrayList<>(); 
    return this.advancedOptions;
  }
  
  public String getIScsiName() {
    return this.iScsiName;
  }
  
  public void setIScsiName(String paramString) {
    this.iScsiName = paramString;
  }
  
  public String getIScsiAlias() {
    return this.iScsiAlias;
  }
  
  public void setIScsiAlias(String paramString) {
    this.iScsiAlias = paramString;
  }
  
  public List<HostInternetScsiHbaSendTarget> getConfiguredSendTarget() {
    if (this.configuredSendTarget == null)
      this.configuredSendTarget = new ArrayList<>(); 
    return this.configuredSendTarget;
  }
  
  public List<HostInternetScsiHbaStaticTarget> getConfiguredStaticTarget() {
    if (this.configuredStaticTarget == null)
      this.configuredStaticTarget = new ArrayList<>(); 
    return this.configuredStaticTarget;
  }
  
  public Integer getMaxSpeedMb() {
    return this.maxSpeedMb;
  }
  
  public void setMaxSpeedMb(Integer paramInteger) {
    this.maxSpeedMb = paramInteger;
  }
  
  public Integer getCurrentSpeedMb() {
    return this.currentSpeedMb;
  }
  
  public void setCurrentSpeedMb(Integer paramInteger) {
    this.currentSpeedMb = paramInteger;
  }
}
