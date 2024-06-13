package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.DvsHostVNicProfile;
import com.vmware.vim25.DvsServiceConsoleVNicProfile;
import com.vmware.vim25.DvsVNicProfile;
import com.vmware.vim25.IpAddressProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsVNicProfile", propOrder = {"key", "ipConfig"})
@XmlSeeAlso({DvsServiceConsoleVNicProfile.class, DvsHostVNicProfile.class})
public class DvsVNicProfile extends ApplyProfile {
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
