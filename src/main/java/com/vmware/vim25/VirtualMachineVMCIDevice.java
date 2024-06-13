package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualMachineVMCIDevice;
import com.vmware.vim25.VirtualMachineVMCIDeviceFilterInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDevice", propOrder = {"id", "allowUnrestrictedCommunication", "filterEnable", "filterInfo"})
public class VirtualMachineVMCIDevice extends VirtualDevice {
  protected Long id;
  
  protected Boolean allowUnrestrictedCommunication;
  
  protected Boolean filterEnable;
  
  protected VirtualMachineVMCIDeviceFilterInfo filterInfo;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(Long paramLong) {
    this.id = paramLong;
  }
  
  public Boolean isAllowUnrestrictedCommunication() {
    return this.allowUnrestrictedCommunication;
  }
  
  public void setAllowUnrestrictedCommunication(Boolean paramBoolean) {
    this.allowUnrestrictedCommunication = paramBoolean;
  }
  
  public Boolean isFilterEnable() {
    return this.filterEnable;
  }
  
  public void setFilterEnable(Boolean paramBoolean) {
    this.filterEnable = paramBoolean;
  }
  
  public VirtualMachineVMCIDeviceFilterInfo getFilterInfo() {
    return this.filterInfo;
  }
  
  public void setFilterInfo(VirtualMachineVMCIDeviceFilterInfo paramVirtualMachineVMCIDeviceFilterInfo) {
    this.filterInfo = paramVirtualMachineVMCIDeviceFilterInfo;
  }
}
