package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.VmfsDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreInfo", propOrder = {"maxPhysicalRDMFileSize", "maxVirtualRDMFileSize", "vmfs"})
public class VmfsDatastoreInfo extends DatastoreInfo {
  protected Long maxPhysicalRDMFileSize;
  
  protected Long maxVirtualRDMFileSize;
  
  protected HostVmfsVolume vmfs;
  
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
  
  public HostVmfsVolume getVmfs() {
    return this.vmfs;
  }
  
  public void setVmfs(HostVmfsVolume paramHostVmfsVolume) {
    this.vmfs = paramHostVmfsVolume;
  }
}
