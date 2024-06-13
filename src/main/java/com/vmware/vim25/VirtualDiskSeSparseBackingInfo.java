package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskSeSparseBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSeSparseBackingInfo", propOrder = {"diskMode", "writeThrough", "uuid", "contentId", "changeId", "parent", "deltaDiskFormat", "digestEnabled", "grainSize", "keyId"})
public class VirtualDiskSeSparseBackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected Boolean writeThrough;
  
  protected String uuid;
  
  protected String contentId;
  
  protected String changeId;
  
  protected VirtualDiskSeSparseBackingInfo parent;
  
  protected String deltaDiskFormat;
  
  protected Boolean digestEnabled;
  
  protected Integer grainSize;
  
  protected CryptoKeyId keyId;
  
  public String getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(String paramString) {
    this.diskMode = paramString;
  }
  
  public Boolean isWriteThrough() {
    return this.writeThrough;
  }
  
  public void setWriteThrough(Boolean paramBoolean) {
    this.writeThrough = paramBoolean;
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
  
  public VirtualDiskSeSparseBackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskSeSparseBackingInfo paramVirtualDiskSeSparseBackingInfo) {
    this.parent = paramVirtualDiskSeSparseBackingInfo;
  }
  
  public String getDeltaDiskFormat() {
    return this.deltaDiskFormat;
  }
  
  public void setDeltaDiskFormat(String paramString) {
    this.deltaDiskFormat = paramString;
  }
  
  public Boolean isDigestEnabled() {
    return this.digestEnabled;
  }
  
  public void setDigestEnabled(Boolean paramBoolean) {
    this.digestEnabled = paramBoolean;
  }
  
  public Integer getGrainSize() {
    return this.grainSize;
  }
  
  public void setGrainSize(Integer paramInteger) {
    this.grainSize = paramInteger;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
}
