package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadata;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataResult", propOrder = {"vmMetadata", "error"})
public class VirtualMachineMetadataManagerVmMetadataResult extends DynamicData {
  @XmlElement(required = true)
  protected VirtualMachineMetadataManagerVmMetadata vmMetadata;
  
  protected LocalizedMethodFault error;
  
  public VirtualMachineMetadataManagerVmMetadata getVmMetadata() {
    return this.vmMetadata;
  }
  
  public void setVmMetadata(VirtualMachineMetadataManagerVmMetadata paramVirtualMachineMetadataManagerVmMetadata) {
    this.vmMetadata = paramVirtualMachineMetadataManagerVmMetadata;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
}
