package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMemberHealthCheckResult;
import com.vmware.vim25.HostMemberUplinkHealthCheckResult;
import com.vmware.vim25.VMwareDVSTeamingHealthCheckResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemberHealthCheckResult", propOrder = {"summary"})
@XmlSeeAlso({HostMemberUplinkHealthCheckResult.class, VMwareDVSTeamingHealthCheckResult.class})
public class HostMemberHealthCheckResult extends DynamicData {
  protected String summary;
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
}
