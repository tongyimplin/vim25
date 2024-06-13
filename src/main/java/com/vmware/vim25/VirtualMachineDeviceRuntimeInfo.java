package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDeviceRuntimeInfo;
import com.vmware.vim25.VirtualMachineDeviceRuntimeInfoDeviceRuntimeState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDeviceRuntimeInfo", propOrder = {"runtimeState", "key"})
public class VirtualMachineDeviceRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected VirtualMachineDeviceRuntimeInfoDeviceRuntimeState runtimeState;
  
  protected int key;
  
  public VirtualMachineDeviceRuntimeInfoDeviceRuntimeState getRuntimeState() {
    return this.runtimeState;
  }
  
  public void setRuntimeState(VirtualMachineDeviceRuntimeInfoDeviceRuntimeState paramVirtualMachineDeviceRuntimeInfoDeviceRuntimeState) {
    this.runtimeState = paramVirtualMachineDeviceRuntimeInfoDeviceRuntimeState;
  }
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
}
