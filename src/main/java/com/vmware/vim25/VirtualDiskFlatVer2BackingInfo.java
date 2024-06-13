package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskFlatVer2BackingInfo", propOrder = {"diskMode", "split", "writeThrough", "thinProvisioned", "eagerlyScrub", "uuid", "contentId", "changeId", "parent", "deltaDiskFormat", "digestEnabled", "deltaGrainSize", "deltaDiskFormatVariant", "sharing", "keyId"})
public class VirtualDiskFlatVer2BackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected Boolean split;
  
  protected Boolean writeThrough;
  
  protected Boolean thinProvisioned;
  
  protected Boolean eagerlyScrub;
  
  protected String uuid;
  
  protected String contentId;
  
  protected String changeId;
  
  protected VirtualDiskFlatVer2BackingInfo parent;
  
  protected String deltaDiskFormat;
  
  protected Boolean digestEnabled;
  
  protected Integer deltaGrainSize;
  
  protected String deltaDiskFormatVariant;
  
  protected String sharing;
  
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
  
  public Boolean isThinProvisioned() {
    return this.thinProvisioned;
  }
  
  public void setThinProvisioned(Boolean paramBoolean) {
    this.thinProvisioned = paramBoolean;
  }
  
  public Boolean isEagerlyScrub() {
    return this.eagerlyScrub;
  }
  
  public void setEagerlyScrub(Boolean paramBoolean) {
    this.eagerlyScrub = paramBoolean;
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
  
  public VirtualDiskFlatVer2BackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskFlatVer2BackingInfo paramVirtualDiskFlatVer2BackingInfo) {
    this.parent = paramVirtualDiskFlatVer2BackingInfo;
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
  
  public Integer getDeltaGrainSize() {
    return this.deltaGrainSize;
  }
  
  public void setDeltaGrainSize(Integer paramInteger) {
    this.deltaGrainSize = paramInteger;
  }
  
  public String getDeltaDiskFormatVariant() {
    return this.deltaDiskFormatVariant;
  }
  
  public void setDeltaDiskFormatVariant(String paramString) {
    this.deltaDiskFormatVariant = paramString;
  }
  
  public String getSharing() {
    return this.sharing;
  }
  
  public void setSharing(String paramString) {
    this.sharing = paramString;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
}
