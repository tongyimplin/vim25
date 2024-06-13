package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OpaqueNetworkTargetInfo;
import com.vmware.vim25.VirtualMachineCdromInfo;
import com.vmware.vim25.VirtualMachineDatastoreInfo;
import com.vmware.vim25.VirtualMachineDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineFloppyInfo;
import com.vmware.vim25.VirtualMachineNetworkInfo;
import com.vmware.vim25.VirtualMachineParallelInfo;
import com.vmware.vim25.VirtualMachinePciPassthroughInfo;
import com.vmware.vim25.VirtualMachinePciSharedGpuPassthroughInfo;
import com.vmware.vim25.VirtualMachinePrecisionClockInfo;
import com.vmware.vim25.VirtualMachineScsiPassthroughInfo;
import com.vmware.vim25.VirtualMachineSerialInfo;
import com.vmware.vim25.VirtualMachineSgxTargetInfo;
import com.vmware.vim25.VirtualMachineSoundInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import com.vmware.vim25.VirtualMachineUsbInfo;
import com.vmware.vim25.VirtualMachineVFlashModuleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineTargetInfo", propOrder = {"name", "configurationTag"})
@XmlSeeAlso({VirtualMachineDynamicPassthroughInfo.class, VirtualMachinePciSharedGpuPassthroughInfo.class, VirtualMachineCdromInfo.class, VirtualMachineVFlashModuleInfo.class, VirtualMachineFloppyInfo.class, VirtualMachineScsiPassthroughInfo.class, OpaqueNetworkTargetInfo.class, VirtualMachineSoundInfo.class, VirtualMachineDiskDeviceInfo.class, VirtualMachineParallelInfo.class, VirtualMachineUsbInfo.class, VirtualMachineDatastoreInfo.class, VirtualMachineSerialInfo.class, VirtualMachineSgxTargetInfo.class, VirtualMachinePrecisionClockInfo.class, VirtualMachineNetworkInfo.class, VirtualMachinePciPassthroughInfo.class})
public class VirtualMachineTargetInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected List<String> configurationTag;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<String> getConfigurationTag() {
    if (this.configurationTag == null)
      this.configurationTag = new ArrayList<>(); 
    return this.configurationTag;
  }
}
