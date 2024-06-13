package com.vmware.vim25;

import com.vmware.vim25.StringOption;
import com.vmware.vim25.VirtualPCIPassthroughPluginBackingOption;
import com.vmware.vim25.VirtualPCIPassthroughVmiopBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughVmiopBackingOption", propOrder = {"vgpu", "maxInstances"})
public class VirtualPCIPassthroughVmiopBackingOption extends VirtualPCIPassthroughPluginBackingOption {
  @XmlElement(required = true)
  protected StringOption vgpu;
  
  protected int maxInstances;
  
  public StringOption getVgpu() {
    return this.vgpu;
  }
  
  public void setVgpu(StringOption paramStringOption) {
    this.vgpu = paramStringOption;
  }
  
  public int getMaxInstances() {
    return this.maxInstances;
  }
  
  public void setMaxInstances(int paramInt) {
    this.maxInstances = paramInt;
  }
}
