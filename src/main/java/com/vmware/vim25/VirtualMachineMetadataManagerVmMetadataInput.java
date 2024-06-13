package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadata;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataInput;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataInput", propOrder = {"operation", "vmMetadata"})
public class VirtualMachineMetadataManagerVmMetadataInput extends DynamicData {
  @XmlElement(required = true)
  protected String operation;
  
  @XmlElement(required = true)
  protected VirtualMachineMetadataManagerVmMetadata vmMetadata;
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
  
  public VirtualMachineMetadataManagerVmMetadata getVmMetadata() {
    return this.vmMetadata;
  }
  
  public void setVmMetadata(VirtualMachineMetadataManagerVmMetadata paramVirtualMachineMetadataManagerVmMetadata) {
    this.vmMetadata = paramVirtualMachineMetadataManagerVmMetadata;
  }
}
