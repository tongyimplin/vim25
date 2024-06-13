package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecBackingSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDiskConfigSpec;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConfigSpec", propOrder = {"operation", "fileOperation", "device", "profile", "backing"})
@XmlSeeAlso({VirtualDiskConfigSpec.class})
public class VirtualDeviceConfigSpec extends DynamicData {
  protected VirtualDeviceConfigSpecOperation operation;
  
  protected VirtualDeviceConfigSpecFileOperation fileOperation;
  
  @XmlElement(required = true)
  protected VirtualDevice device;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected VirtualDeviceConfigSpecBackingSpec backing;
  
  public VirtualDeviceConfigSpecOperation getOperation() {
    return this.operation;
  }
  
  public void setOperation(VirtualDeviceConfigSpecOperation paramVirtualDeviceConfigSpecOperation) {
    this.operation = paramVirtualDeviceConfigSpecOperation;
  }
  
  public VirtualDeviceConfigSpecFileOperation getFileOperation() {
    return this.fileOperation;
  }
  
  public void setFileOperation(VirtualDeviceConfigSpecFileOperation paramVirtualDeviceConfigSpecFileOperation) {
    this.fileOperation = paramVirtualDeviceConfigSpecFileOperation;
  }
  
  public VirtualDevice getDevice() {
    return this.device;
  }
  
  public void setDevice(VirtualDevice paramVirtualDevice) {
    this.device = paramVirtualDevice;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public VirtualDeviceConfigSpecBackingSpec getBacking() {
    return this.backing;
  }
  
  public void setBacking(VirtualDeviceConfigSpecBackingSpec paramVirtualDeviceConfigSpecBackingSpec) {
    this.backing = paramVirtualDeviceConfigSpecBackingSpec;
  }
}
