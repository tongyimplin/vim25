package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualMachineVMCIDeviceOption;
import com.vmware.vim25.VirtualMachineVMCIDeviceOptionFilterSpecOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceOption", propOrder = {"allowUnrestrictedCommunication", "filterSpecOption", "filterSupported"})
public class VirtualMachineVMCIDeviceOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected BoolOption allowUnrestrictedCommunication;
  
  protected VirtualMachineVMCIDeviceOptionFilterSpecOption filterSpecOption;
  
  protected BoolOption filterSupported;
  
  public BoolOption getAllowUnrestrictedCommunication() {
    return this.allowUnrestrictedCommunication;
  }
  
  public void setAllowUnrestrictedCommunication(BoolOption paramBoolOption) {
    this.allowUnrestrictedCommunication = paramBoolOption;
  }
  
  public VirtualMachineVMCIDeviceOptionFilterSpecOption getFilterSpecOption() {
    return this.filterSpecOption;
  }
  
  public void setFilterSpecOption(VirtualMachineVMCIDeviceOptionFilterSpecOption paramVirtualMachineVMCIDeviceOptionFilterSpecOption) {
    this.filterSpecOption = paramVirtualMachineVMCIDeviceOptionFilterSpecOption;
  }
  
  public BoolOption getFilterSupported() {
    return this.filterSupported;
  }
  
  public void setFilterSupported(BoolOption paramBoolOption) {
    this.filterSupported = paramBoolOption;
  }
}
