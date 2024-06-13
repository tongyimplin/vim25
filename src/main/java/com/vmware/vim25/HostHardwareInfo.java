package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostBIOSInfo;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.HostCpuInfo;
import com.vmware.vim25.HostCpuPackage;
import com.vmware.vim25.HostCpuPowerManagementInfo;
import com.vmware.vim25.HostHardwareInfo;
import com.vmware.vim25.HostNumaInfo;
import com.vmware.vim25.HostPciDevice;
import com.vmware.vim25.HostPersistentMemoryInfo;
import com.vmware.vim25.HostReliableMemoryInfo;
import com.vmware.vim25.HostSgxInfo;
import com.vmware.vim25.HostSystemInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareInfo", propOrder = {"systemInfo", "cpuPowerManagementInfo", "cpuInfo", "cpuPkg", "memorySize", "numaInfo", "smcPresent", "pciDevice", "cpuFeature", "biosInfo", "reliableMemoryInfo", "persistentMemoryInfo", "sgxInfo"})
public class HostHardwareInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostSystemInfo systemInfo;
  
  protected HostCpuPowerManagementInfo cpuPowerManagementInfo;
  
  @XmlElement(required = true)
  protected HostCpuInfo cpuInfo;
  
  @XmlElement(required = true)
  protected List<HostCpuPackage> cpuPkg;
  
  protected long memorySize;
  
  protected HostNumaInfo numaInfo;
  
  protected Boolean smcPresent;
  
  protected List<HostPciDevice> pciDevice;
  
  protected List<HostCpuIdInfo> cpuFeature;
  
  protected HostBIOSInfo biosInfo;
  
  protected HostReliableMemoryInfo reliableMemoryInfo;
  
  protected HostPersistentMemoryInfo persistentMemoryInfo;
  
  protected HostSgxInfo sgxInfo;
  
  public HostSystemInfo getSystemInfo() {
    return this.systemInfo;
  }
  
  public void setSystemInfo(HostSystemInfo paramHostSystemInfo) {
    this.systemInfo = paramHostSystemInfo;
  }
  
  public HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
    return this.cpuPowerManagementInfo;
  }
  
  public void setCpuPowerManagementInfo(HostCpuPowerManagementInfo paramHostCpuPowerManagementInfo) {
    this.cpuPowerManagementInfo = paramHostCpuPowerManagementInfo;
  }
  
  public HostCpuInfo getCpuInfo() {
    return this.cpuInfo;
  }
  
  public void setCpuInfo(HostCpuInfo paramHostCpuInfo) {
    this.cpuInfo = paramHostCpuInfo;
  }
  
  public List<HostCpuPackage> getCpuPkg() {
    if (this.cpuPkg == null)
      this.cpuPkg = new ArrayList<>(); 
    return this.cpuPkg;
  }
  
  public long getMemorySize() {
    return this.memorySize;
  }
  
  public void setMemorySize(long paramLong) {
    this.memorySize = paramLong;
  }
  
  public HostNumaInfo getNumaInfo() {
    return this.numaInfo;
  }
  
  public void setNumaInfo(HostNumaInfo paramHostNumaInfo) {
    this.numaInfo = paramHostNumaInfo;
  }
  
  public Boolean isSmcPresent() {
    return this.smcPresent;
  }
  
  public void setSmcPresent(Boolean paramBoolean) {
    this.smcPresent = paramBoolean;
  }
  
  public List<HostPciDevice> getPciDevice() {
    if (this.pciDevice == null)
      this.pciDevice = new ArrayList<>(); 
    return this.pciDevice;
  }
  
  public List<HostCpuIdInfo> getCpuFeature() {
    if (this.cpuFeature == null)
      this.cpuFeature = new ArrayList<>(); 
    return this.cpuFeature;
  }
  
  public HostBIOSInfo getBiosInfo() {
    return this.biosInfo;
  }
  
  public void setBiosInfo(HostBIOSInfo paramHostBIOSInfo) {
    this.biosInfo = paramHostBIOSInfo;
  }
  
  public HostReliableMemoryInfo getReliableMemoryInfo() {
    return this.reliableMemoryInfo;
  }
  
  public void setReliableMemoryInfo(HostReliableMemoryInfo paramHostReliableMemoryInfo) {
    this.reliableMemoryInfo = paramHostReliableMemoryInfo;
  }
  
  public HostPersistentMemoryInfo getPersistentMemoryInfo() {
    return this.persistentMemoryInfo;
  }
  
  public void setPersistentMemoryInfo(HostPersistentMemoryInfo paramHostPersistentMemoryInfo) {
    this.persistentMemoryInfo = paramHostPersistentMemoryInfo;
  }
  
  public HostSgxInfo getSgxInfo() {
    return this.sgxInfo;
  }
  
  public void setSgxInfo(HostSgxInfo paramHostSgxInfo) {
    this.sgxInfo = paramHostSgxInfo;
  }
}
