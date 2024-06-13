package com.vmware.vim25;

import com.vmware.vim25.HostPortGroupProfile;
import com.vmware.vim25.IpAddressProfile;
import com.vmware.vim25.PortGroupProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPortGroupProfile", propOrder = {"ipConfig"})
public class HostPortGroupProfile extends PortGroupProfile {
  @XmlElement(required = true)
  protected IpAddressProfile ipConfig;
  
  public IpAddressProfile getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(IpAddressProfile paramIpAddressProfile) {
    this.ipConfig = paramIpAddressProfile;
  }
}
