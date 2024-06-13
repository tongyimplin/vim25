package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCpuPowerManagementInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuPowerManagementInfo", propOrder = {"currentPolicy", "hardwareSupport"})
public class HostCpuPowerManagementInfo extends DynamicData {
  protected String currentPolicy;
  
  protected String hardwareSupport;
  
  public String getCurrentPolicy() {
    return this.currentPolicy;
  }
  
  public void setCurrentPolicy(String paramString) {
    this.currentPolicy = paramString;
  }
  
  public String getHardwareSupport() {
    return this.hardwareSupport;
  }
  
  public void setHardwareSupport(String paramString) {
    this.hardwareSupport = paramString;
  }
}
