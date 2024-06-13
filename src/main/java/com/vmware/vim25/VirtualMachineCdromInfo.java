package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineCdromInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCdromInfo", propOrder = {"description"})
public class VirtualMachineCdromInfo extends VirtualMachineTargetInfo {
  protected String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
