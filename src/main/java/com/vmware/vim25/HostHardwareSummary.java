package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostHardwareSummary;
import com.vmware.vim25.HostSystemIdentificationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareSummary", propOrder = {"vendor", "model", "uuid", "otherIdentifyingInfo", "memorySize", "cpuModel", "cpuMhz", "numCpuPkgs", "numCpuCores", "numCpuThreads", "numNics", "numHBAs"})
public class HostHardwareSummary extends DynamicData {
  @XmlElement(required = true)
  protected String vendor;
  
  @XmlElement(required = true)
  protected String model;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected List<HostSystemIdentificationInfo> otherIdentifyingInfo;
  
  protected long memorySize;
  
  @XmlElement(required = true)
  protected String cpuModel;
  
  protected int cpuMhz;
  
  protected short numCpuPkgs;
  
  protected short numCpuCores;
  
  protected short numCpuThreads;
  
  protected int numNics;
  
  protected int numHBAs;
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String paramString) {
    this.model = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<HostSystemIdentificationInfo> getOtherIdentifyingInfo() {
    if (this.otherIdentifyingInfo == null)
      this.otherIdentifyingInfo = new ArrayList<>(); 
    return this.otherIdentifyingInfo;
  }
  
  public long getMemorySize() {
    return this.memorySize;
  }
  
  public void setMemorySize(long paramLong) {
    this.memorySize = paramLong;
  }
  
  public String getCpuModel() {
    return this.cpuModel;
  }
  
  public void setCpuModel(String paramString) {
    this.cpuModel = paramString;
  }
  
  public int getCpuMhz() {
    return this.cpuMhz;
  }
  
  public void setCpuMhz(int paramInt) {
    this.cpuMhz = paramInt;
  }
  
  public short getNumCpuPkgs() {
    return this.numCpuPkgs;
  }
  
  public void setNumCpuPkgs(short paramShort) {
    this.numCpuPkgs = paramShort;
  }
  
  public short getNumCpuCores() {
    return this.numCpuCores;
  }
  
  public void setNumCpuCores(short paramShort) {
    this.numCpuCores = paramShort;
  }
  
  public short getNumCpuThreads() {
    return this.numCpuThreads;
  }
  
  public void setNumCpuThreads(short paramShort) {
    this.numCpuThreads = paramShort;
  }
  
  public int getNumNics() {
    return this.numNics;
  }
  
  public void setNumNics(int paramInt) {
    this.numNics = paramInt;
  }
  
  public int getNumHBAs() {
    return this.numHBAs;
  }
  
  public void setNumHBAs(int paramInt) {
    this.numHBAs = paramInt;
  }
}
