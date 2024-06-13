package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.ResourceConfigOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualHardwareOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardwareOption", propOrder = {"hwVersion", "virtualDeviceOption", "deviceListReadonly", "numCPU", "numCoresPerSocket", "numCpuReadonly", "memoryMB", "numPCIControllers", "numIDEControllers", "numUSBControllers", "numUSBXHCIControllers", "numSIOControllers", "numPS2Controllers", "licensingLimit", "numSupportedWwnPorts", "numSupportedWwnNodes", "resourceConfigOption", "numNVDIMMControllers", "numTPMDevices", "numWDTDevices", "numPrecisionClockDevices", "epcMemoryMB"})
public class VirtualHardwareOption extends DynamicData {
  protected int hwVersion;
  
  @XmlElement(required = true)
  protected List<VirtualDeviceOption> virtualDeviceOption;
  
  protected boolean deviceListReadonly;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> numCPU;
  
  protected IntOption numCoresPerSocket;
  
  protected boolean numCpuReadonly;
  
  @XmlElement(required = true)
  protected LongOption memoryMB;
  
  @XmlElement(required = true)
  protected IntOption numPCIControllers;
  
  @XmlElement(required = true)
  protected IntOption numIDEControllers;
  
  @XmlElement(required = true)
  protected IntOption numUSBControllers;
  
  protected IntOption numUSBXHCIControllers;
  
  @XmlElement(required = true)
  protected IntOption numSIOControllers;
  
  @XmlElement(required = true)
  protected IntOption numPS2Controllers;
  
  protected List<String> licensingLimit;
  
  protected IntOption numSupportedWwnPorts;
  
  protected IntOption numSupportedWwnNodes;
  
  protected ResourceConfigOption resourceConfigOption;
  
  protected IntOption numNVDIMMControllers;
  
  protected IntOption numTPMDevices;
  
  protected IntOption numWDTDevices;
  
  protected IntOption numPrecisionClockDevices;
  
  protected LongOption epcMemoryMB;
  
  public int getHwVersion() {
    return this.hwVersion;
  }
  
  public void setHwVersion(int paramInt) {
    this.hwVersion = paramInt;
  }
  
  public List<VirtualDeviceOption> getVirtualDeviceOption() {
    if (this.virtualDeviceOption == null)
      this.virtualDeviceOption = new ArrayList<>(); 
    return this.virtualDeviceOption;
  }
  
  public boolean isDeviceListReadonly() {
    return this.deviceListReadonly;
  }
  
  public void setDeviceListReadonly(boolean paramBoolean) {
    this.deviceListReadonly = paramBoolean;
  }
  
  public List<Integer> getNumCPU() {
    if (this.numCPU == null)
      this.numCPU = new ArrayList<>(); 
    return this.numCPU;
  }
  
  public IntOption getNumCoresPerSocket() {
    return this.numCoresPerSocket;
  }
  
  public void setNumCoresPerSocket(IntOption paramIntOption) {
    this.numCoresPerSocket = paramIntOption;
  }
  
  public boolean isNumCpuReadonly() {
    return this.numCpuReadonly;
  }
  
  public void setNumCpuReadonly(boolean paramBoolean) {
    this.numCpuReadonly = paramBoolean;
  }
  
  public LongOption getMemoryMB() {
    return this.memoryMB;
  }
  
  public void setMemoryMB(LongOption paramLongOption) {
    this.memoryMB = paramLongOption;
  }
  
  public IntOption getNumPCIControllers() {
    return this.numPCIControllers;
  }
  
  public void setNumPCIControllers(IntOption paramIntOption) {
    this.numPCIControllers = paramIntOption;
  }
  
  public IntOption getNumIDEControllers() {
    return this.numIDEControllers;
  }
  
  public void setNumIDEControllers(IntOption paramIntOption) {
    this.numIDEControllers = paramIntOption;
  }
  
  public IntOption getNumUSBControllers() {
    return this.numUSBControllers;
  }
  
  public void setNumUSBControllers(IntOption paramIntOption) {
    this.numUSBControllers = paramIntOption;
  }
  
  public IntOption getNumUSBXHCIControllers() {
    return this.numUSBXHCIControllers;
  }
  
  public void setNumUSBXHCIControllers(IntOption paramIntOption) {
    this.numUSBXHCIControllers = paramIntOption;
  }
  
  public IntOption getNumSIOControllers() {
    return this.numSIOControllers;
  }
  
  public void setNumSIOControllers(IntOption paramIntOption) {
    this.numSIOControllers = paramIntOption;
  }
  
  public IntOption getNumPS2Controllers() {
    return this.numPS2Controllers;
  }
  
  public void setNumPS2Controllers(IntOption paramIntOption) {
    this.numPS2Controllers = paramIntOption;
  }
  
  public List<String> getLicensingLimit() {
    if (this.licensingLimit == null)
      this.licensingLimit = new ArrayList<>(); 
    return this.licensingLimit;
  }
  
  public IntOption getNumSupportedWwnPorts() {
    return this.numSupportedWwnPorts;
  }
  
  public void setNumSupportedWwnPorts(IntOption paramIntOption) {
    this.numSupportedWwnPorts = paramIntOption;
  }
  
  public IntOption getNumSupportedWwnNodes() {
    return this.numSupportedWwnNodes;
  }
  
  public void setNumSupportedWwnNodes(IntOption paramIntOption) {
    this.numSupportedWwnNodes = paramIntOption;
  }
  
  public ResourceConfigOption getResourceConfigOption() {
    return this.resourceConfigOption;
  }
  
  public void setResourceConfigOption(ResourceConfigOption paramResourceConfigOption) {
    this.resourceConfigOption = paramResourceConfigOption;
  }
  
  public IntOption getNumNVDIMMControllers() {
    return this.numNVDIMMControllers;
  }
  
  public void setNumNVDIMMControllers(IntOption paramIntOption) {
    this.numNVDIMMControllers = paramIntOption;
  }
  
  public IntOption getNumTPMDevices() {
    return this.numTPMDevices;
  }
  
  public void setNumTPMDevices(IntOption paramIntOption) {
    this.numTPMDevices = paramIntOption;
  }
  
  public IntOption getNumWDTDevices() {
    return this.numWDTDevices;
  }
  
  public void setNumWDTDevices(IntOption paramIntOption) {
    this.numWDTDevices = paramIntOption;
  }
  
  public IntOption getNumPrecisionClockDevices() {
    return this.numPrecisionClockDevices;
  }
  
  public void setNumPrecisionClockDevices(IntOption paramIntOption) {
    this.numPrecisionClockDevices = paramIntOption;
  }
  
  public LongOption getEpcMemoryMB() {
    return this.epcMemoryMB;
  }
  
  public void setEpcMemoryMB(LongOption paramLongOption) {
    this.epcMemoryMB = paramLongOption;
  }
}
