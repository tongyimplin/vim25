package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualCdrom;
import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceBusSlotInfo;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualFloppy;
import com.vmware.vim25.VirtualKeyboard;
import com.vmware.vim25.VirtualMachineVMCIDevice;
import com.vmware.vim25.VirtualMachineVMIROM;
import com.vmware.vim25.VirtualMachineVideoCard;
import com.vmware.vim25.VirtualNVDIMM;
import com.vmware.vim25.VirtualPCIPassthrough;
import com.vmware.vim25.VirtualParallelPort;
import com.vmware.vim25.VirtualPointingDevice;
import com.vmware.vim25.VirtualPrecisionClock;
import com.vmware.vim25.VirtualSCSIPassthrough;
import com.vmware.vim25.VirtualSerialPort;
import com.vmware.vim25.VirtualSoundCard;
import com.vmware.vim25.VirtualTPM;
import com.vmware.vim25.VirtualUSB;
import com.vmware.vim25.VirtualWDT;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevice", propOrder = {"key", "deviceInfo", "backing", "connectable", "slotInfo", "controllerKey", "unitNumber"})
@XmlSeeAlso({VirtualDisk.class, VirtualSCSIPassthrough.class, VirtualCdrom.class, VirtualPointingDevice.class, VirtualPCIPassthrough.class, VirtualFloppy.class, VirtualMachineVMIROM.class, VirtualMachineVMCIDevice.class, VirtualUSB.class, VirtualSoundCard.class, VirtualNVDIMM.class, VirtualMachineVideoCard.class, VirtualTPM.class, VirtualKeyboard.class, VirtualWDT.class, VirtualEthernetCard.class, VirtualSerialPort.class, VirtualParallelPort.class, VirtualController.class, VirtualPrecisionClock.class})
public class VirtualDevice extends DynamicData {
  protected int key;
  
  protected Description deviceInfo;
  
  protected VirtualDeviceBackingInfo backing;
  
  protected VirtualDeviceConnectInfo connectable;
  
  protected VirtualDeviceBusSlotInfo slotInfo;
  
  protected Integer controllerKey;
  
  protected Integer unitNumber;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public Description getDeviceInfo() {
    return this.deviceInfo;
  }
  
  public void setDeviceInfo(Description paramDescription) {
    this.deviceInfo = paramDescription;
  }
  
  public VirtualDeviceBackingInfo getBacking() {
    return this.backing;
  }
  
  public void setBacking(VirtualDeviceBackingInfo paramVirtualDeviceBackingInfo) {
    this.backing = paramVirtualDeviceBackingInfo;
  }
  
  public VirtualDeviceConnectInfo getConnectable() {
    return this.connectable;
  }
  
  public void setConnectable(VirtualDeviceConnectInfo paramVirtualDeviceConnectInfo) {
    this.connectable = paramVirtualDeviceConnectInfo;
  }
  
  public VirtualDeviceBusSlotInfo getSlotInfo() {
    return this.slotInfo;
  }
  
  public void setSlotInfo(VirtualDeviceBusSlotInfo paramVirtualDeviceBusSlotInfo) {
    this.slotInfo = paramVirtualDeviceBusSlotInfo;
  }
  
  public Integer getControllerKey() {
    return this.controllerKey;
  }
  
  public void setControllerKey(Integer paramInteger) {
    this.controllerKey = paramInteger;
  }
  
  public Integer getUnitNumber() {
    return this.unitNumber;
  }
  
  public void setUnitNumber(Integer paramInteger) {
    this.unitNumber = paramInteger;
  }
}
