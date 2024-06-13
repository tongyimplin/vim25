package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskConfigurationResult;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskConfigurationResult", propOrder = {"devicePath", "success", "fault"})
public class HostDiskConfigurationResult extends DynamicData {
  protected String devicePath;
  
  protected Boolean success;
  
  protected LocalizedMethodFault fault;
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public Boolean isSuccess() {
    return this.success;
  }
  
  public void setSuccess(Boolean paramBoolean) {
    this.success = paramBoolean;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
