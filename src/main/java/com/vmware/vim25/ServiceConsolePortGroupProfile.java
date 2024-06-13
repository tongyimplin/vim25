package com.vmware.vim25;

import com.vmware.vim25.IpAddressProfile;
import com.vmware.vim25.PortGroupProfile;
import com.vmware.vim25.ServiceConsolePortGroupProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConsolePortGroupProfile", propOrder = {"ipConfig"})
public class ServiceConsolePortGroupProfile extends PortGroupProfile {
  @XmlElement(required = true)
  protected IpAddressProfile ipConfig;
  
  public IpAddressProfile getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(IpAddressProfile paramIpAddressProfile) {
    this.ipConfig = paramIpAddressProfile;
  }
}
