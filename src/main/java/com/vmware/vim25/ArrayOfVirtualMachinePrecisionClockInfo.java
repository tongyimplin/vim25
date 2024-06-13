package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachinePrecisionClockInfo;
import com.vmware.vim25.VirtualMachinePrecisionClockInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePrecisionClockInfo", propOrder = {"virtualMachinePrecisionClockInfo"})
public class ArrayOfVirtualMachinePrecisionClockInfo {
  @XmlElement(name = "VirtualMachinePrecisionClockInfo")
  protected List<VirtualMachinePrecisionClockInfo> virtualMachinePrecisionClockInfo;
  
  public List<VirtualMachinePrecisionClockInfo> getVirtualMachinePrecisionClockInfo() {
    if (this.virtualMachinePrecisionClockInfo == null)
      this.virtualMachinePrecisionClockInfo = new ArrayList<>(); 
    return this.virtualMachinePrecisionClockInfo;
  }
}
