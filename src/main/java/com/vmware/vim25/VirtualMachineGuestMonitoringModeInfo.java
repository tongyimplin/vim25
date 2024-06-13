package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineGuestMonitoringModeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestMonitoringModeInfo", propOrder = {"gmmFile", "gmmAppliance"})
public class VirtualMachineGuestMonitoringModeInfo extends DynamicData {
  protected String gmmFile;
  
  protected String gmmAppliance;
  
  public String getGmmFile() {
    return this.gmmFile;
  }
  
  public void setGmmFile(String paramString) {
    this.gmmFile = paramString;
  }
  
  public String getGmmAppliance() {
    return this.gmmAppliance;
  }
  
  public void setGmmAppliance(String paramString) {
    this.gmmAppliance = paramString;
  }
}
