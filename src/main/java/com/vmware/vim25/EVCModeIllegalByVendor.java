package com.vmware.vim25;

import com.vmware.vim25.EVCConfigFault;
import com.vmware.vim25.EVCModeIllegalByVendor;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCModeIllegalByVendor", propOrder = {"clusterCPUVendor", "modeCPUVendor"})
public class EVCModeIllegalByVendor extends EVCConfigFault {
  @XmlElement(required = true)
  protected String clusterCPUVendor;
  
  @XmlElement(required = true)
  protected String modeCPUVendor;
  
  public String getClusterCPUVendor() {
    return this.clusterCPUVendor;
  }
  
  public void setClusterCPUVendor(String paramString) {
    this.clusterCPUVendor = paramString;
  }
  
  public String getModeCPUVendor() {
    return this.modeCPUVendor;
  }
  
  public void setModeCPUVendor(String paramString) {
    this.modeCPUVendor = paramString;
  }
}
