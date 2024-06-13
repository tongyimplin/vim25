package com.vmware.vim25;

import com.vmware.vim25.HostMemberHealthCheckResult;
import com.vmware.vim25.VMwareDVSTeamingHealthCheckResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSTeamingHealthCheckResult", propOrder = {"teamingStatus"})
public class VMwareDVSTeamingHealthCheckResult extends HostMemberHealthCheckResult {
  @XmlElement(required = true)
  protected String teamingStatus;
  
  public String getTeamingStatus() {
    return this.teamingStatus;
  }
  
  public void setTeamingStatus(String paramString) {
    this.teamingStatus = paramString;
  }
}
