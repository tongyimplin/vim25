package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineSoundInfo;
import com.vmware.vim25.VirtualMachineSoundInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSoundInfo", propOrder = {"virtualMachineSoundInfo"})
public class ArrayOfVirtualMachineSoundInfo {
  @XmlElement(name = "VirtualMachineSoundInfo")
  protected List<VirtualMachineSoundInfo> virtualMachineSoundInfo;
  
  public List<VirtualMachineSoundInfo> getVirtualMachineSoundInfo() {
    if (this.virtualMachineSoundInfo == null)
      this.virtualMachineSoundInfo = new ArrayList<>(); 
    return this.virtualMachineSoundInfo;
  }
}
