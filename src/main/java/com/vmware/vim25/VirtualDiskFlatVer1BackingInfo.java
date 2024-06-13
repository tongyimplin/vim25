package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer1BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskFlatVer1BackingInfo", propOrder = {"diskMode", "split", "writeThrough", "contentId", "parent"})
public class VirtualDiskFlatVer1BackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected Boolean split;
  
  protected Boolean writeThrough;
  
  protected String contentId;
  
  protected VirtualDiskFlatVer1BackingInfo parent;
  
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
  
  public String getContentId() {
    return this.contentId;
  }
  
  public void setContentId(String paramString) {
    this.contentId = paramString;
  }
  
  public VirtualDiskFlatVer1BackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskFlatVer1BackingInfo paramVirtualDiskFlatVer1BackingInfo) {
    this.parent = paramVirtualDiskFlatVer1BackingInfo;
  }
}
