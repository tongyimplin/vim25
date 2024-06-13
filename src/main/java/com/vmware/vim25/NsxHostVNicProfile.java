package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.IpAddressProfile;
import com.vmware.vim25.NsxHostVNicProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsxHostVNicProfile", propOrder = {"key", "ipConfig"})
public class NsxHostVNicProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected IpAddressProfile ipConfig;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public IpAddressProfile getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(IpAddressProfile paramIpAddressProfile) {
    this.ipConfig = paramIpAddressProfile;
  }
}
