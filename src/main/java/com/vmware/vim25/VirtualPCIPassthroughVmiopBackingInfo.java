package com.vmware.vim25;

import com.vmware.vim25.VirtualPCIPassthroughPluginBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughVmiopBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughVmiopBackingInfo", propOrder = {"vgpu"})
public class VirtualPCIPassthroughVmiopBackingInfo extends VirtualPCIPassthroughPluginBackingInfo {
  protected String vgpu;
  
  public String getVgpu() {
    return this.vgpu;
  }
  
  public void setVgpu(String paramString) {
    this.vgpu = paramString;
  }
}
