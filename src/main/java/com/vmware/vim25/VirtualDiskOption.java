package com.vmware.vim25;

import com.vmware.vim25.LongOption;
import com.vmware.vim25.StorageIOAllocationOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualDiskOption;
import com.vmware.vim25.VirtualDiskOptionVFlashCacheConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskOption", propOrder = {"capacityInKB", "ioAllocationOption", "vFlashCacheConfigOption"})
public class VirtualDiskOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected LongOption capacityInKB;
  
  protected StorageIOAllocationOption ioAllocationOption;
  
  protected VirtualDiskOptionVFlashCacheConfigOption vFlashCacheConfigOption;
  
  public LongOption getCapacityInKB() {
    return this.capacityInKB;
  }
  
  public void setCapacityInKB(LongOption paramLongOption) {
    this.capacityInKB = paramLongOption;
  }
  
  public StorageIOAllocationOption getIoAllocationOption() {
    return this.ioAllocationOption;
  }
  
  public void setIoAllocationOption(StorageIOAllocationOption paramStorageIOAllocationOption) {
    this.ioAllocationOption = paramStorageIOAllocationOption;
  }
  
  public VirtualDiskOptionVFlashCacheConfigOption getVFlashCacheConfigOption() {
    return this.vFlashCacheConfigOption;
  }
  
  public void setVFlashCacheConfigOption(VirtualDiskOptionVFlashCacheConfigOption paramVirtualDiskOptionVFlashCacheConfigOption) {
    this.vFlashCacheConfigOption = paramVirtualDiskOptionVFlashCacheConfigOption;
  }
}
