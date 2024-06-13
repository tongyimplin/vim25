package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughDeviceBackingInfo;
import com.vmware.vim25.VirtualSriovEthernetCardSriovBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSriovEthernetCardSriovBackingInfo", propOrder = {"physicalFunctionBacking", "virtualFunctionBacking", "virtualFunctionIndex"})
public class VirtualSriovEthernetCardSriovBackingInfo extends VirtualDeviceBackingInfo {
  protected VirtualPCIPassthroughDeviceBackingInfo physicalFunctionBacking;
  
  protected VirtualPCIPassthroughDeviceBackingInfo virtualFunctionBacking;
  
  protected Integer virtualFunctionIndex;
  
  public VirtualPCIPassthroughDeviceBackingInfo getPhysicalFunctionBacking() {
    return this.physicalFunctionBacking;
  }
  
  public void setPhysicalFunctionBacking(VirtualPCIPassthroughDeviceBackingInfo paramVirtualPCIPassthroughDeviceBackingInfo) {
    this.physicalFunctionBacking = paramVirtualPCIPassthroughDeviceBackingInfo;
  }
  
  public VirtualPCIPassthroughDeviceBackingInfo getVirtualFunctionBacking() {
    return this.virtualFunctionBacking;
  }
  
  public void setVirtualFunctionBacking(VirtualPCIPassthroughDeviceBackingInfo paramVirtualPCIPassthroughDeviceBackingInfo) {
    this.virtualFunctionBacking = paramVirtualPCIPassthroughDeviceBackingInfo;
  }
  
  public Integer getVirtualFunctionIndex() {
    return this.virtualFunctionIndex;
  }
  
  public void setVirtualFunctionIndex(Integer paramInteger) {
    this.virtualFunctionIndex = paramInteger;
  }
}
