package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDiscoveryProperties", propOrder = {"iSnsDiscoveryEnabled", "iSnsDiscoveryMethod", "iSnsHost", "slpDiscoveryEnabled", "slpDiscoveryMethod", "slpHost", "staticTargetDiscoveryEnabled", "sendTargetsDiscoveryEnabled"})
public class HostInternetScsiHbaDiscoveryProperties extends DynamicData {
  protected boolean iSnsDiscoveryEnabled;
  
  protected String iSnsDiscoveryMethod;
  
  protected String iSnsHost;
  
  protected boolean slpDiscoveryEnabled;
  
  protected String slpDiscoveryMethod;
  
  protected String slpHost;
  
  protected boolean staticTargetDiscoveryEnabled;
  
  protected boolean sendTargetsDiscoveryEnabled;
  
  public boolean isISnsDiscoveryEnabled() {
    return this.iSnsDiscoveryEnabled;
  }
  
  public void setISnsDiscoveryEnabled(boolean paramBoolean) {
    this.iSnsDiscoveryEnabled = paramBoolean;
  }
  
  public String getISnsDiscoveryMethod() {
    return this.iSnsDiscoveryMethod;
  }
  
  public void setISnsDiscoveryMethod(String paramString) {
    this.iSnsDiscoveryMethod = paramString;
  }
  
  public String getISnsHost() {
    return this.iSnsHost;
  }
  
  public void setISnsHost(String paramString) {
    this.iSnsHost = paramString;
  }
  
  public boolean isSlpDiscoveryEnabled() {
    return this.slpDiscoveryEnabled;
  }
  
  public void setSlpDiscoveryEnabled(boolean paramBoolean) {
    this.slpDiscoveryEnabled = paramBoolean;
  }
  
  public String getSlpDiscoveryMethod() {
    return this.slpDiscoveryMethod;
  }
  
  public void setSlpDiscoveryMethod(String paramString) {
    this.slpDiscoveryMethod = paramString;
  }
  
  public String getSlpHost() {
    return this.slpHost;
  }
  
  public void setSlpHost(String paramString) {
    this.slpHost = paramString;
  }
  
  public boolean isStaticTargetDiscoveryEnabled() {
    return this.staticTargetDiscoveryEnabled;
  }
  
  public void setStaticTargetDiscoveryEnabled(boolean paramBoolean) {
    this.staticTargetDiscoveryEnabled = paramBoolean;
  }
  
  public boolean isSendTargetsDiscoveryEnabled() {
    return this.sendTargetsDiscoveryEnabled;
  }
  
  public void setSendTargetsDiscoveryEnabled(boolean paramBoolean) {
    this.sendTargetsDiscoveryEnabled = paramBoolean;
  }
}
