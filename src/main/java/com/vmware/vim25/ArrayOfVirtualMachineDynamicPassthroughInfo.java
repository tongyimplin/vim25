package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDynamicPassthroughInfo", propOrder = {"virtualMachineDynamicPassthroughInfo"})
public class ArrayOfVirtualMachineDynamicPassthroughInfo {
  @XmlElement(name = "VirtualMachineDynamicPassthroughInfo")
  protected List<VirtualMachineDynamicPassthroughInfo> virtualMachineDynamicPassthroughInfo;
  
  public List<VirtualMachineDynamicPassthroughInfo> getVirtualMachineDynamicPassthroughInfo() {
    if (this.virtualMachineDynamicPassthroughInfo == null)
      this.virtualMachineDynamicPassthroughInfo = new ArrayList<>(); 
    return this.virtualMachineDynamicPassthroughInfo;
  }
}
