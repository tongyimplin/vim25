package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMemberHealthCheckResult;
import com.vmware.vim25.HostMemberRuntimeInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemberRuntimeInfo", propOrder = {"host", "status", "statusDetail", "nsxtStatus", "nsxtStatusDetail", "healthCheckResult"})
public class HostMemberRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected String status;
  
  protected String statusDetail;
  
  protected String nsxtStatus;
  
  protected String nsxtStatusDetail;
  
  protected List<HostMemberHealthCheckResult> healthCheckResult;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public String getStatusDetail() {
    return this.statusDetail;
  }
  
  public void setStatusDetail(String paramString) {
    this.statusDetail = paramString;
  }
  
  public String getNsxtStatus() {
    return this.nsxtStatus;
  }
  
  public void setNsxtStatus(String paramString) {
    this.nsxtStatus = paramString;
  }
  
  public String getNsxtStatusDetail() {
    return this.nsxtStatusDetail;
  }
  
  public void setNsxtStatusDetail(String paramString) {
    this.nsxtStatusDetail = paramString;
  }
  
  public List<HostMemberHealthCheckResult> getHealthCheckResult() {
    if (this.healthCheckResult == null)
      this.healthCheckResult = new ArrayList<>(); 
    return this.healthCheckResult;
  }
}
