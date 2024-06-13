package com.vmware.vim25;

import com.vmware.vim25.HostMemberHealthCheckResult;
import com.vmware.vim25.HostMemberUplinkHealthCheckResult;
import com.vmware.vim25.VMwareDVSMtuHealthCheckResult;
import com.vmware.vim25.VMwareDVSVlanHealthCheckResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemberUplinkHealthCheckResult", propOrder = {"uplinkPortKey"})
@XmlSeeAlso({VMwareDVSVlanHealthCheckResult.class, VMwareDVSMtuHealthCheckResult.class})
public class HostMemberUplinkHealthCheckResult extends HostMemberHealthCheckResult {
  @XmlElement(required = true)
  protected String uplinkPortKey;
  
  public String getUplinkPortKey() {
    return this.uplinkPortKey;
  }
  
  public void setUplinkPortKey(String paramString) {
    this.uplinkPortKey = paramString;
  }
}
