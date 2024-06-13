package com.vmware.vim25;

import com.vmware.vim25.DVSNetworkResourceManagementCapability;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNetworkResourceManagementCapability", propOrder = {"networkResourceManagementSupported", "networkResourcePoolHighShareValue", "qosSupported", "userDefinedNetworkResourcePoolsSupported", "networkResourceControlVersion3Supported", "userDefinedInfraTrafficPoolSupported"})
public class DVSNetworkResourceManagementCapability extends DynamicData {
  protected boolean networkResourceManagementSupported;
  
  protected int networkResourcePoolHighShareValue;
  
  protected boolean qosSupported;
  
  protected boolean userDefinedNetworkResourcePoolsSupported;
  
  protected Boolean networkResourceControlVersion3Supported;
  
  protected Boolean userDefinedInfraTrafficPoolSupported;
  
  public boolean isNetworkResourceManagementSupported() {
    return this.networkResourceManagementSupported;
  }
  
  public void setNetworkResourceManagementSupported(boolean paramBoolean) {
    this.networkResourceManagementSupported = paramBoolean;
  }
  
  public int getNetworkResourcePoolHighShareValue() {
    return this.networkResourcePoolHighShareValue;
  }
  
  public void setNetworkResourcePoolHighShareValue(int paramInt) {
    this.networkResourcePoolHighShareValue = paramInt;
  }
  
  public boolean isQosSupported() {
    return this.qosSupported;
  }
  
  public void setQosSupported(boolean paramBoolean) {
    this.qosSupported = paramBoolean;
  }
  
  public boolean isUserDefinedNetworkResourcePoolsSupported() {
    return this.userDefinedNetworkResourcePoolsSupported;
  }
  
  public void setUserDefinedNetworkResourcePoolsSupported(boolean paramBoolean) {
    this.userDefinedNetworkResourcePoolsSupported = paramBoolean;
  }
  
  public Boolean isNetworkResourceControlVersion3Supported() {
    return this.networkResourceControlVersion3Supported;
  }
  
  public void setNetworkResourceControlVersion3Supported(Boolean paramBoolean) {
    this.networkResourceControlVersion3Supported = paramBoolean;
  }
  
  public Boolean isUserDefinedInfraTrafficPoolSupported() {
    return this.userDefinedInfraTrafficPoolSupported;
  }
  
  public void setUserDefinedInfraTrafficPoolSupported(Boolean paramBoolean) {
    this.userDefinedInfraTrafficPoolSupported = paramBoolean;
  }
}
