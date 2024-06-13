package com.vmware.vim25;

import com.vmware.vim25.ConfigTarget;
import com.vmware.vim25.DistributedVirtualPortgroupInfo;
import com.vmware.vim25.DistributedVirtualSwitchInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OpaqueNetworkTargetInfo;
import com.vmware.vim25.ResourcePoolRuntimeInfo;
import com.vmware.vim25.VirtualMachineCdromInfo;
import com.vmware.vim25.VirtualMachineDatastoreInfo;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineFloppyInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo;
import com.vmware.vim25.VirtualMachineNetworkInfo;
import com.vmware.vim25.VirtualMachineParallelInfo;
import com.vmware.vim25.VirtualMachinePciPassthroughInfo;
import com.vmware.vim25.VirtualMachinePciSharedGpuPassthroughInfo;
import com.vmware.vim25.VirtualMachinePrecisionClockInfo;
import com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineScsiPassthroughInfo;
import com.vmware.vim25.VirtualMachineSerialInfo;
import com.vmware.vim25.VirtualMachineSgxTargetInfo;
import com.vmware.vim25.VirtualMachineSoundInfo;
import com.vmware.vim25.VirtualMachineSriovInfo;
import com.vmware.vim25.VirtualMachineUsbInfo;
import com.vmware.vim25.VirtualMachineVFlashModuleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigTarget", propOrder = {"numCpus", "numCpuCores", "numNumaNodes", "maxCpusPerHost", "smcPresent", "datastore", "network", "opaqueNetwork", "distributedVirtualPortgroup", "distributedVirtualSwitch", "cdRom", "serial", "parallel", "sound", "usb", "floppy", "legacyNetworkInfo", "scsiPassthrough", "scsiDisk", "ideDisk", "maxMemMBOptimalPerf", "supportedMaxMemMB", "resourcePool", "autoVmotion", "pciPassthrough", "sriov", "vFlashModule", "sharedGpuPassthroughTypes", "availablePersistentMemoryReservationMB", "dynamicPassthrough", "sgxTargetInfo", "precisionClockInfo"})
public class ConfigTarget extends DynamicData {
  protected int numCpus;
  
  protected int numCpuCores;
  
  protected int numNumaNodes;
  
  protected Integer maxCpusPerHost;
  
  protected Boolean smcPresent;
  
  protected List<VirtualMachineDatastoreInfo> datastore;
  
  protected List<VirtualMachineNetworkInfo> network;
  
  protected List<OpaqueNetworkTargetInfo> opaqueNetwork;
  
  protected List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup;
  
  protected List<DistributedVirtualSwitchInfo> distributedVirtualSwitch;
  
  protected List<VirtualMachineCdromInfo> cdRom;
  
  protected List<VirtualMachineSerialInfo> serial;
  
  protected List<VirtualMachineParallelInfo> parallel;
  
  protected List<VirtualMachineSoundInfo> sound;
  
  protected List<VirtualMachineUsbInfo> usb;
  
  protected List<VirtualMachineFloppyInfo> floppy;
  
  protected List<VirtualMachineLegacyNetworkSwitchInfo> legacyNetworkInfo;
  
  protected List<VirtualMachineScsiPassthroughInfo> scsiPassthrough;
  
  protected List<VirtualMachineScsiDiskDeviceInfo> scsiDisk;
  
  protected List<VirtualMachineIdeDiskDeviceInfo> ideDisk;
  
  protected int maxMemMBOptimalPerf;
  
  protected Integer supportedMaxMemMB;
  
  protected ResourcePoolRuntimeInfo resourcePool;
  
  protected Boolean autoVmotion;
  
  protected List<VirtualMachinePciPassthroughInfo> pciPassthrough;
  
  protected List<VirtualMachineSriovInfo> sriov;
  
  protected List<VirtualMachineVFlashModuleInfo> vFlashModule;
  
  protected List<VirtualMachinePciSharedGpuPassthroughInfo> sharedGpuPassthroughTypes;
  
  protected Long availablePersistentMemoryReservationMB;
  
  protected List<VirtualMachineDynamicPassthroughInfo> dynamicPassthrough;
  
  protected VirtualMachineSgxTargetInfo sgxTargetInfo;
  
  protected List<VirtualMachinePrecisionClockInfo> precisionClockInfo;
  
  public int getNumCpus() {
    return this.numCpus;
  }
  
  public void setNumCpus(int paramInt) {
    this.numCpus = paramInt;
  }
  
  public int getNumCpuCores() {
    return this.numCpuCores;
  }
  
  public void setNumCpuCores(int paramInt) {
    this.numCpuCores = paramInt;
  }
  
  public int getNumNumaNodes() {
    return this.numNumaNodes;
  }
  
  public void setNumNumaNodes(int paramInt) {
    this.numNumaNodes = paramInt;
  }
  
  public Integer getMaxCpusPerHost() {
    return this.maxCpusPerHost;
  }
  
  public void setMaxCpusPerHost(Integer paramInteger) {
    this.maxCpusPerHost = paramInteger;
  }
  
  public Boolean isSmcPresent() {
    return this.smcPresent;
  }
  
  public void setSmcPresent(Boolean paramBoolean) {
    this.smcPresent = paramBoolean;
  }
  
  public List<VirtualMachineDatastoreInfo> getDatastore() {
    if (this.datastore == null)
      this.datastore = new ArrayList<>(); 
    return this.datastore;
  }
  
  public List<VirtualMachineNetworkInfo> getNetwork() {
    if (this.network == null)
      this.network = new ArrayList<>(); 
    return this.network;
  }
  
  public List<OpaqueNetworkTargetInfo> getOpaqueNetwork() {
    if (this.opaqueNetwork == null)
      this.opaqueNetwork = new ArrayList<>(); 
    return this.opaqueNetwork;
  }
  
  public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroup() {
    if (this.distributedVirtualPortgroup == null)
      this.distributedVirtualPortgroup = new ArrayList<>(); 
    return this.distributedVirtualPortgroup;
  }
  
  public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitch() {
    if (this.distributedVirtualSwitch == null)
      this.distributedVirtualSwitch = new ArrayList<>(); 
    return this.distributedVirtualSwitch;
  }
  
  public List<VirtualMachineCdromInfo> getCdRom() {
    if (this.cdRom == null)
      this.cdRom = new ArrayList<>(); 
    return this.cdRom;
  }
  
  public List<VirtualMachineSerialInfo> getSerial() {
    if (this.serial == null)
      this.serial = new ArrayList<>(); 
    return this.serial;
  }
  
  public List<VirtualMachineParallelInfo> getParallel() {
    if (this.parallel == null)
      this.parallel = new ArrayList<>(); 
    return this.parallel;
  }
  
  public List<VirtualMachineSoundInfo> getSound() {
    if (this.sound == null)
      this.sound = new ArrayList<>(); 
    return this.sound;
  }
  
  public List<VirtualMachineUsbInfo> getUsb() {
    if (this.usb == null)
      this.usb = new ArrayList<>(); 
    return this.usb;
  }
  
  public List<VirtualMachineFloppyInfo> getFloppy() {
    if (this.floppy == null)
      this.floppy = new ArrayList<>(); 
    return this.floppy;
  }
  
  public List<VirtualMachineLegacyNetworkSwitchInfo> getLegacyNetworkInfo() {
    if (this.legacyNetworkInfo == null)
      this.legacyNetworkInfo = new ArrayList<>(); 
    return this.legacyNetworkInfo;
  }
  
  public List<VirtualMachineScsiPassthroughInfo> getScsiPassthrough() {
    if (this.scsiPassthrough == null)
      this.scsiPassthrough = new ArrayList<>(); 
    return this.scsiPassthrough;
  }
  
  public List<VirtualMachineScsiDiskDeviceInfo> getScsiDisk() {
    if (this.scsiDisk == null)
      this.scsiDisk = new ArrayList<>(); 
    return this.scsiDisk;
  }
  
  public List<VirtualMachineIdeDiskDeviceInfo> getIdeDisk() {
    if (this.ideDisk == null)
      this.ideDisk = new ArrayList<>(); 
    return this.ideDisk;
  }
  
  public int getMaxMemMBOptimalPerf() {
    return this.maxMemMBOptimalPerf;
  }
  
  public void setMaxMemMBOptimalPerf(int paramInt) {
    this.maxMemMBOptimalPerf = paramInt;
  }
  
  public Integer getSupportedMaxMemMB() {
    return this.supportedMaxMemMB;
  }
  
  public void setSupportedMaxMemMB(Integer paramInteger) {
    this.supportedMaxMemMB = paramInteger;
  }
  
  public ResourcePoolRuntimeInfo getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ResourcePoolRuntimeInfo paramResourcePoolRuntimeInfo) {
    this.resourcePool = paramResourcePoolRuntimeInfo;
  }
  
  public Boolean isAutoVmotion() {
    return this.autoVmotion;
  }
  
  public void setAutoVmotion(Boolean paramBoolean) {
    this.autoVmotion = paramBoolean;
  }
  
  public List<VirtualMachinePciPassthroughInfo> getPciPassthrough() {
    if (this.pciPassthrough == null)
      this.pciPassthrough = new ArrayList<>(); 
    return this.pciPassthrough;
  }
  
  public List<VirtualMachineSriovInfo> getSriov() {
    if (this.sriov == null)
      this.sriov = new ArrayList<>(); 
    return this.sriov;
  }
  
  public List<VirtualMachineVFlashModuleInfo> getVFlashModule() {
    if (this.vFlashModule == null)
      this.vFlashModule = new ArrayList<>(); 
    return this.vFlashModule;
  }
  
  public List<VirtualMachinePciSharedGpuPassthroughInfo> getSharedGpuPassthroughTypes() {
    if (this.sharedGpuPassthroughTypes == null)
      this.sharedGpuPassthroughTypes = new ArrayList<>(); 
    return this.sharedGpuPassthroughTypes;
  }
  
  public Long getAvailablePersistentMemoryReservationMB() {
    return this.availablePersistentMemoryReservationMB;
  }
  
  public void setAvailablePersistentMemoryReservationMB(Long paramLong) {
    this.availablePersistentMemoryReservationMB = paramLong;
  }
  
  public List<VirtualMachineDynamicPassthroughInfo> getDynamicPassthrough() {
    if (this.dynamicPassthrough == null)
      this.dynamicPassthrough = new ArrayList<>(); 
    return this.dynamicPassthrough;
  }
  
  public VirtualMachineSgxTargetInfo getSgxTargetInfo() {
    return this.sgxTargetInfo;
  }
  
  public void setSgxTargetInfo(VirtualMachineSgxTargetInfo paramVirtualMachineSgxTargetInfo) {
    this.sgxTargetInfo = paramVirtualMachineSgxTargetInfo;
  }
  
  public List<VirtualMachinePrecisionClockInfo> getPrecisionClockInfo() {
    if (this.precisionClockInfo == null)
      this.precisionClockInfo = new ArrayList<>(); 
    return this.precisionClockInfo;
  }
}
