package com.vmware.vim25;

import com.vmware.vim25.DatastoreCapability;
import com.vmware.vim25.DatastoreSummary;
import com.vmware.vim25.VirtualMachineDatastoreInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDatastoreInfo", propOrder = {"datastore", "capability", "maxFileSize", "maxVirtualDiskCapacity", "maxPhysicalRDMFileSize", "maxVirtualRDMFileSize", "mode", "vStorageSupport"})
public class VirtualMachineDatastoreInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected DatastoreSummary datastore;
  
  @XmlElement(required = true)
  protected DatastoreCapability capability;
  
  protected long maxFileSize;
  
  protected Long maxVirtualDiskCapacity;
  
  protected Long maxPhysicalRDMFileSize;
  
  protected Long maxVirtualRDMFileSize;
  
  @XmlElement(required = true)
  protected String mode;
  
  protected String vStorageSupport;
  
  public DatastoreSummary getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreSummary paramDatastoreSummary) {
    this.datastore = paramDatastoreSummary;
  }
  
  public DatastoreCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(DatastoreCapability paramDatastoreCapability) {
    this.capability = paramDatastoreCapability;
  }
  
  public long getMaxFileSize() {
    return this.maxFileSize;
  }
  
  public void setMaxFileSize(long paramLong) {
    this.maxFileSize = paramLong;
  }
  
  public Long getMaxVirtualDiskCapacity() {
    return this.maxVirtualDiskCapacity;
  }
  
  public void setMaxVirtualDiskCapacity(Long paramLong) {
    this.maxVirtualDiskCapacity = paramLong;
  }
  
  public Long getMaxPhysicalRDMFileSize() {
    return this.maxPhysicalRDMFileSize;
  }
  
  public void setMaxPhysicalRDMFileSize(Long paramLong) {
    this.maxPhysicalRDMFileSize = paramLong;
  }
  
  public Long getMaxVirtualRDMFileSize() {
    return this.maxVirtualRDMFileSize;
  }
  
  public void setMaxVirtualRDMFileSize(Long paramLong) {
    this.maxVirtualRDMFileSize = paramLong;
  }
  
  public String getMode() {
    return this.mode;
  }
  
  public void setMode(String paramString) {
    this.mode = paramString;
  }
  
  public String getVStorageSupport() {
    return this.vStorageSupport;
  }
  
  public void setVStorageSupport(String paramString) {
    this.vStorageSupport = paramString;
  }
}
