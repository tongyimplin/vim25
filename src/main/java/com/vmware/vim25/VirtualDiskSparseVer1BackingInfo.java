package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer1BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSparseVer1BackingInfo", propOrder = {"diskMode", "split", "writeThrough", "spaceUsedInKB", "contentId", "parent"})
public class VirtualDiskSparseVer1BackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected Boolean split;
  
  protected Boolean writeThrough;
  
  protected Long spaceUsedInKB;
  
  protected String contentId;
  
  protected VirtualDiskSparseVer1BackingInfo parent;
  
  public String getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(String paramString) {
    this.diskMode = paramString;
  }
  
  public Boolean isSplit() {
    return this.split;
  }
  
  public void setSplit(Boolean paramBoolean) {
    this.split = paramBoolean;
  }
  
  public Boolean isWriteThrough() {
    return this.writeThrough;
  }
  
  public void setWriteThrough(Boolean paramBoolean) {
    this.writeThrough = paramBoolean;
  }
  
  public Long getSpaceUsedInKB() {
    return this.spaceUsedInKB;
  }
  
  public void setSpaceUsedInKB(Long paramLong) {
    this.spaceUsedInKB = paramLong;
  }
  
  public String getContentId() {
    return this.contentId;
  }
  
  public void setContentId(String paramString) {
    this.contentId = paramString;
  }
  
  public VirtualDiskSparseVer1BackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskSparseVer1BackingInfo paramVirtualDiskSparseVer1BackingInfo) {
    this.parent = paramVirtualDiskSparseVer1BackingInfo;
  }
}
