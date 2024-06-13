package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineVMCIDeviceFilterInfo;
import com.vmware.vim25.VirtualMachineVMCIDeviceFilterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceFilterInfo", propOrder = {"filters"})
public class VirtualMachineVMCIDeviceFilterInfo extends DynamicData {
  protected List<VirtualMachineVMCIDeviceFilterSpec> filters;
  
  public List<VirtualMachineVMCIDeviceFilterSpec> getFilters() {
    if (this.filters == null)
      this.filters = new ArrayList<>(); 
    return this.filters;
  }
}
