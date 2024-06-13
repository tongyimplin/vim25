package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostMemberHealthCheckResult;
import com.vmware.vim25.HostMemberHealthCheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMemberHealthCheckResult", propOrder = {"hostMemberHealthCheckResult"})
public class ArrayOfHostMemberHealthCheckResult {
  @XmlElement(name = "HostMemberHealthCheckResult")
  protected List<HostMemberHealthCheckResult> hostMemberHealthCheckResult;
  
  public List<HostMemberHealthCheckResult> getHostMemberHealthCheckResult() {
    if (this.hostMemberHealthCheckResult == null)
      this.hostMemberHealthCheckResult = new ArrayList<>(); 
    return this.hostMemberHealthCheckResult;
  }
}
