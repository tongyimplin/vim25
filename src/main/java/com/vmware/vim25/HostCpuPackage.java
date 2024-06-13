package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.HostCpuPackage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuPackage", propOrder = {"index", "vendor", "hz", "busHz", "description", "threadId", "cpuFeature"})
public class HostCpuPackage extends DynamicData {
  protected short index;
  
  @XmlElement(required = true)
  protected String vendor;
  
  protected long hz;
  
  protected long busHz;
  
  @XmlElement(required = true)
  protected String description;
  
  @XmlElement(type = Short.class)
  protected List<Short> threadId;
  
  protected List<HostCpuIdInfo> cpuFeature;
  
  public short getIndex() {
    return this.index;
  }
  
  public void setIndex(short paramShort) {
    this.index = paramShort;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public long getHz() {
    return this.hz;
  }
  
  public void setHz(long paramLong) {
    this.hz = paramLong;
  }
  
  public long getBusHz() {
    return this.busHz;
  }
  
  public void setBusHz(long paramLong) {
    this.busHz = paramLong;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public List<Short> getThreadId() {
    if (this.threadId == null)
      this.threadId = new ArrayList<>(); 
    return this.threadId;
  }
  
  public List<HostCpuIdInfo> getCpuFeature() {
    if (this.cpuFeature == null)
      this.cpuFeature = new ArrayList<>(); 
    return this.cpuFeature;
  }
}
