package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer2BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSparseVer2BackingInfo", propOrder = {"diskMode", "split", "writeThrough", "spaceUsedInKB", "uuid", "contentId", "changeId", "parent", "keyId"})
public class VirtualDiskSparseVer2BackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected Boolean split;
  
  protected Boolean writeThrough;
  
  protected Long spaceUsedInKB;
  
  protected String uuid;
  
  protected String contentId;
  
  protected String changeId;
  
  protected VirtualDiskSparseVer2BackingInfo parent;
  
  protected CryptoKeyId keyId;
  
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
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getContentId() {
    return this.contentId;
  }
  
  public void setContentId(String paramString) {
    this.contentId = paramString;
  }
  
  public String getChangeId() {
    return this.changeId;
  }
  
  public void setChangeId(String paramString) {
    this.changeId = paramString;
  }
  
  public VirtualDiskSparseVer2BackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskSparseVer2BackingInfo paramVirtualDiskSparseVer2BackingInfo) {
    this.parent = paramVirtualDiskSparseVer2BackingInfo;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
}
