package com.vmware.vim25;

import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
import com.vmware.vim25.VirtualMachineTargetInfo;
import com.vmware.vim25.VirtualMachineVFlashModuleInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVFlashModuleInfo", propOrder = {"vFlashModule"})
public class VirtualMachineVFlashModuleInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption vFlashModule;
  
  public HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption getVFlashModule() {
    return this.vFlashModule;
  }
  
  public void setVFlashModule(HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption paramHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption) {
    this.vFlashModule = paramHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
  }
}
