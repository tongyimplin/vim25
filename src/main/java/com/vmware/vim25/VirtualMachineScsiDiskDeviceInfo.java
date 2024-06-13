package com.vmware.vim25;

import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.VirtualMachineDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineScsiDiskDeviceInfo", propOrder = {"disk", "transportHint", "lunNumber"})
public class VirtualMachineScsiDiskDeviceInfo extends VirtualMachineDiskDeviceInfo {
  protected HostScsiDisk disk;
  
  protected String transportHint;
  
  protected Integer lunNumber;
  
  public HostScsiDisk getDisk() {
    return this.disk;
  }
  
  public void setDisk(HostScsiDisk paramHostScsiDisk) {
    this.disk = paramHostScsiDisk;
  }
  
  public String getTransportHint() {
    return this.transportHint;
  }
  
  public void setTransportHint(String paramString) {
    this.transportHint = paramString;
  }
  
  public Integer getLunNumber() {
    return this.lunNumber;
  }
  
  public void setLunNumber(Integer paramInteger) {
    this.lunNumber = paramInteger;
  }
}
