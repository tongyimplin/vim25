package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostForceMountedInfo;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVmfsVolume", propOrder = {"blockSizeMb", "blockSize", "unmapGranularity", "unmapPriority", "unmapBandwidthSpec", "maxBlocks", "majorVersion", "version", "uuid", "extent", "vmfsUpgradable", "forceMountedInfo", "ssd", "local", "scsiDiskType"})
public class HostVmfsVolume extends HostFileSystemVolume {
  protected int blockSizeMb;
  
  protected Integer blockSize;
  
  protected Integer unmapGranularity;
  
  protected String unmapPriority;
  
  protected VmfsUnmapBandwidthSpec unmapBandwidthSpec;
  
  protected int maxBlocks;
  
  protected int majorVersion;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected List<HostScsiDiskPartition> extent;
  
  protected boolean vmfsUpgradable;
  
  protected HostForceMountedInfo forceMountedInfo;
  
  protected Boolean ssd;
  
  protected Boolean local;
  
  protected String scsiDiskType;
  
  public int getBlockSizeMb() {
    return this.blockSizeMb;
  }
  
  public void setBlockSizeMb(int paramInt) {
    this.blockSizeMb = paramInt;
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
  
  public int getMaxBlocks() {
    return this.maxBlocks;
  }
  
  public void setMaxBlocks(int paramInt) {
    this.maxBlocks = paramInt;
  }
  
  public int getMajorVersion() {
    return this.majorVersion;
  }
  
  public void setMajorVersion(int paramInt) {
    this.majorVersion = paramInt;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<HostScsiDiskPartition> getExtent() {
    if (this.extent == null)
      this.extent = new ArrayList<>(); 
    return this.extent;
  }
  
  public boolean isVmfsUpgradable() {
    return this.vmfsUpgradable;
  }
  
  public void setVmfsUpgradable(boolean paramBoolean) {
    this.vmfsUpgradable = paramBoolean;
  }
  
  public HostForceMountedInfo getForceMountedInfo() {
    return this.forceMountedInfo;
  }
  
  public void setForceMountedInfo(HostForceMountedInfo paramHostForceMountedInfo) {
    this.forceMountedInfo = paramHostForceMountedInfo;
  }
  
  public Boolean isSsd() {
    return this.ssd;
  }
  
  public void setSsd(Boolean paramBoolean) {
    this.ssd = paramBoolean;
  }
  
  public Boolean isLocal() {
    return this.local;
  }
  
  public void setLocal(Boolean paramBoolean) {
    this.local = paramBoolean;
  }
  
  public String getScsiDiskType() {
    return this.scsiDiskType;
  }
  
  public void setScsiDiskType(String paramString) {
    this.scsiDiskType = paramString;
  }
}
