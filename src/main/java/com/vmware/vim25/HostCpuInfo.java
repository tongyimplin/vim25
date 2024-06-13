package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCpuInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuInfo", propOrder = {"numCpuPackages", "numCpuCores", "numCpuThreads", "hz"})
public class HostCpuInfo extends DynamicData {
  protected short numCpuPackages;
  
  protected short numCpuCores;
  
  protected short numCpuThreads;
  
  protected long hz;
  
  public short getNumCpuPackages() {
    return this.numCpuPackages;
  }
  
  public void setNumCpuPackages(short paramShort) {
    this.numCpuPackages = paramShort;
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
  
  public long getHz() {
    return this.hz;
  }
  
  public void setHz(long paramLong) {
    this.hz = paramLong;
  }
}
