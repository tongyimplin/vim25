package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineLegacyNetworkSwitchInfo;
import com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineLegacyNetworkSwitchInfo", propOrder = {"virtualMachineLegacyNetworkSwitchInfo"})
public class ArrayOfVirtualMachineLegacyNetworkSwitchInfo {
  @XmlElement(name = "VirtualMachineLegacyNetworkSwitchInfo")
  protected List<VirtualMachineLegacyNetworkSwitchInfo> virtualMachineLegacyNetworkSwitchInfo;
  
  public List<VirtualMachineLegacyNetworkSwitchInfo> getVirtualMachineLegacyNetworkSwitchInfo() {
    if (this.virtualMachineLegacyNetworkSwitchInfo == null)
      this.virtualMachineLegacyNetworkSwitchInfo = new ArrayList<>(); 
    return this.virtualMachineLegacyNetworkSwitchInfo;
  }
}
