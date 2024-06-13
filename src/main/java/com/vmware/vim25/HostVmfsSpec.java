package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostVmfsSpec;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVmfsSpec", propOrder = {"extent", "blockSizeMb", "majorVersion", "volumeName", "blockSize", "unmapGranularity", "unmapPriority", "unmapBandwidthSpec"})
public class HostVmfsSpec extends DynamicData {
  @XmlElement(required = true)
  protected HostScsiDiskPartition extent;
  
  protected Integer blockSizeMb;
  
  protected int majorVersion;
  
  @XmlElement(required = true)
  protected String volumeName;
  
  protected Integer blockSize;
  
  protected Integer unmapGranularity;
  
  protected String unmapPriority;
  
  protected VmfsUnmapBandwidthSpec unmapBandwidthSpec;
  
  public HostScsiDiskPartition getExtent() {
    return this.extent;
  }
  
  public void setExtent(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.extent = paramHostScsiDiskPartition;
  }
  
  public Integer getBlockSizeMb() {
    return this.blockSizeMb;
  }
  
  public void setBlockSizeMb(Integer paramInteger) {
    this.blockSizeMb = paramInteger;
  }
  
  public int getMajorVersion() {
    return this.majorVersion;
  }
  
  public void setMajorVersion(int paramInt) {
    this.majorVersion = paramInt;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public void setVolumeName(String paramString) {
    this.volumeName = paramString;
  }
  
  public Integer getBlockSize() {
    return this.blockSize;
  }
  
  public void setBlockSize(Integer paramInteger) {
    this.blockSize = paramInteger;
  }
  
  public Integer getUnmapGranularity() {
    return this.unmapGranularity;
  }
  
  public void setUnmapGranularity(Integer paramInteger) {
    this.unmapGranularity = paramInteger;
  }
  
  public String getUnmapPriority() {
    return this.unmapPriority;
  }
  
  public void setUnmapPriority(String paramString) {
    this.unmapPriority = paramString;
  }
  
  public VmfsUnmapBandwidthSpec getUnmapBandwidthSpec() {
    return this.unmapBandwidthSpec;
  }
  
  public void setUnmapBandwidthSpec(VmfsUnmapBandwidthSpec paramVmfsUnmapBandwidthSpec) {
    this.unmapBandwidthSpec = paramVmfsUnmapBandwidthSpec;
  }
}
