package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHostVmkNicInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostVmkNicInfo", propOrder = {"nicSpec", "service"})
public class ClusterComputeResourceHostVmkNicInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostVirtualNicSpec nicSpec;
  
  @XmlElement(required = true)
  protected String service;
  
  public HostVirtualNicSpec getNicSpec() {
    return this.nicSpec;
  }
  
  public void setNicSpec(HostVirtualNicSpec paramHostVirtualNicSpec) {
    this.nicSpec = paramHostVirtualNicSpec;
  }
  
  public String getService() {
    return this.service;
  }
  
  public void setService(String paramString) {
    this.service = paramString;
  }
}
