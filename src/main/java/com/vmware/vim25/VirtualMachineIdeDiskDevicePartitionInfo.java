package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineIdeDiskDevicePartitionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineIdeDiskDevicePartitionInfo", propOrder = {"id", "capacity"})
public class VirtualMachineIdeDiskDevicePartitionInfo extends DynamicData {
  protected int id;
  
  protected int capacity;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public int getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(int paramInt) {
    this.capacity = paramInt;
  }
}
