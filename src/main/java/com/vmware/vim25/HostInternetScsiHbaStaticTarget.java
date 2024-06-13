package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.OptionDef;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaStaticTarget", propOrder = {"address", "port", "iScsiName", "discoveryMethod", "authenticationProperties", "digestProperties", "supportedAdvancedOptions", "advancedOptions", "parent"})
public class HostInternetScsiHbaStaticTarget extends DynamicData {
  @XmlElement(required = true)
  protected String address;
  
  protected Integer port;
  
  @XmlElement(required = true)
  protected String iScsiName;
  
  protected String discoveryMethod;
  
  protected HostInternetScsiHbaAuthenticationProperties authenticationProperties;
  
  protected HostInternetScsiHbaDigestProperties digestProperties;
  
  protected List<OptionDef> supportedAdvancedOptions;
  
  protected List<HostInternetScsiHbaParamValue> advancedOptions;
  
  protected String parent;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
  }
  
  public String getIScsiName() {
    return this.iScsiName;
  }
  
  public void setIScsiName(String paramString) {
    this.iScsiName = paramString;
  }
  
  public String getDiscoveryMethod() {
    return this.discoveryMethod;
  }
  
  public void setDiscoveryMethod(String paramString) {
    this.discoveryMethod = paramString;
  }
  
  public HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
    return this.authenticationProperties;
  }
  
  public void setAuthenticationProperties(HostInternetScsiHbaAuthenticationProperties paramHostInternetScsiHbaAuthenticationProperties) {
    this.authenticationProperties = paramHostInternetScsiHbaAuthenticationProperties;
  }
  
  public HostInternetScsiHbaDigestProperties getDigestProperties() {
    return this.digestProperties;
  }
  
  public void setDigestProperties(HostInternetScsiHbaDigestProperties paramHostInternetScsiHbaDigestProperties) {
    this.digestProperties = paramHostInternetScsiHbaDigestProperties;
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
  
  public String getParent() {
    return this.parent;
  }
  
  public void setParent(String paramString) {
    this.parent = paramString;
  }
}
