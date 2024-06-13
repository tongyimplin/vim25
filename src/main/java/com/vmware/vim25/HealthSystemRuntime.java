package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HealthSystemRuntime;
import com.vmware.vim25.HostHardwareStatusInfo;
import com.vmware.vim25.HostSystemHealthInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthSystemRuntime", propOrder = {"systemHealthInfo", "hardwareStatusInfo"})
public class HealthSystemRuntime extends DynamicData {
  protected HostSystemHealthInfo systemHealthInfo;
  
  protected HostHardwareStatusInfo hardwareStatusInfo;
  
  public HostSystemHealthInfo getSystemHealthInfo() {
    return this.systemHealthInfo;
  }
  
  public void setSystemHealthInfo(HostSystemHealthInfo paramHostSystemHealthInfo) {
    this.systemHealthInfo = paramHostSystemHealthInfo;
  }
  
  public HostHardwareStatusInfo getHardwareStatusInfo() {
    return this.hardwareStatusInfo;
  }
  
  public void setHardwareStatusInfo(HostHardwareStatusInfo paramHostHardwareStatusInfo) {
    this.hardwareStatusInfo = paramHostHardwareStatusInfo;
  }
}
