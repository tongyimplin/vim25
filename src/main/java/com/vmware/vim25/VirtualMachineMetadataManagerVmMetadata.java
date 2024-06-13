package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadata;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadata", propOrder = {"vmId", "metadata"})
public class VirtualMachineMetadataManagerVmMetadata extends DynamicData {
  @XmlElement(required = true)
  protected String vmId;
  
  protected String metadata;
  
  public String getVmId() {
    return this.vmId;
  }
  
  public void setVmId(String paramString) {
    this.vmId = paramString;
  }
  
  public String getMetadata() {
    return this.metadata;
  }
  
  public void setMetadata(String paramString) {
    this.metadata = paramString;
  }
}
