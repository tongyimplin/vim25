package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostGraphicsInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsInfo", propOrder = {"deviceName", "vendorName", "pciId", "graphicsType", "memorySizeInKB", "vm"})
public class HostGraphicsInfo extends DynamicData {
  @XmlElement(required = true)
  protected String deviceName;
  
  @XmlElement(required = true)
  protected String vendorName;
  
  @XmlElement(required = true)
  protected String pciId;
  
  @XmlElement(required = true)
  protected String graphicsType;
  
  protected long memorySizeInKB;
  
  protected List<ManagedObjectReference> vm;
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public String getVendorName() {
    return this.vendorName;
  }
  
  public void setVendorName(String paramString) {
    this.vendorName = paramString;
  }
  
  public String getPciId() {
    return this.pciId;
  }
  
  public void setPciId(String paramString) {
    this.pciId = paramString;
  }
  
  public String getGraphicsType() {
    return this.graphicsType;
  }
  
  public void setGraphicsType(String paramString) {
    this.graphicsType = paramString;
  }
  
  public long getMemorySizeInKB() {
    return this.memorySizeInKB;
  }
  
  public void setMemorySizeInKB(long paramLong) {
    this.memorySizeInKB = paramLong;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
}
