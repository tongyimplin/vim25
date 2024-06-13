package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult", propOrder = {"diskUuid", "success", "failureReason"})
public class HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult extends DynamicData {
  @XmlElement(required = true)
  protected String diskUuid;
  
  protected boolean success;
  
  protected String failureReason;
  
  public String getDiskUuid() {
    return this.diskUuid;
  }
  
  public void setDiskUuid(String paramString) {
    this.diskUuid = paramString;
  }
  
  public boolean isSuccess() {
    return this.success;
  }
  
  public void setSuccess(boolean paramBoolean) {
    this.success = paramBoolean;
  }
  
  public String getFailureReason() {
    return this.failureReason;
  }
  
  public void setFailureReason(String paramString) {
    this.failureReason = paramString;
  }
}
