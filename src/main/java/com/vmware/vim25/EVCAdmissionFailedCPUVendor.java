package com.vmware.vim25;

import com.vmware.vim25.EVCAdmissionFailed;
import com.vmware.vim25.EVCAdmissionFailedCPUVendor;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCAdmissionFailedCPUVendor", propOrder = {"clusterCPUVendor", "hostCPUVendor"})
public class EVCAdmissionFailedCPUVendor extends EVCAdmissionFailed {
  @XmlElement(required = true)
  protected String clusterCPUVendor;
  
  @XmlElement(required = true)
  protected String hostCPUVendor;
  
  public String getClusterCPUVendor() {
    return this.clusterCPUVendor;
  }
  
  public void setClusterCPUVendor(String paramString) {
    this.clusterCPUVendor = paramString;
  }
  
  public String getHostCPUVendor() {
    return this.hostCPUVendor;
  }
  
  public void setHostCPUVendor(String paramString) {
    this.hostCPUVendor = paramString;
  }
}
