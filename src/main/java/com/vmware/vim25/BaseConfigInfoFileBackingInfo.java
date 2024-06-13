package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfoBackingInfo;
import com.vmware.vim25.BaseConfigInfoDiskFileBackingInfo;
import com.vmware.vim25.BaseConfigInfoFileBackingInfo;
import com.vmware.vim25.BaseConfigInfoRawDiskMappingBackingInfo;
import com.vmware.vim25.CryptoKeyId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfoFileBackingInfo", propOrder = {"filePath", "backingObjectId", "parent", "deltaSizeInMB", "keyId"})
@XmlSeeAlso({BaseConfigInfoDiskFileBackingInfo.class, BaseConfigInfoRawDiskMappingBackingInfo.class})
public class BaseConfigInfoFileBackingInfo extends BaseConfigInfoBackingInfo {
  @XmlElement(required = true)
  protected String filePath;
  
  protected String backingObjectId;
  
  protected BaseConfigInfoFileBackingInfo parent;
  
  protected Long deltaSizeInMB;
  
  protected CryptoKeyId keyId;
  
  public String getFilePath() {
    return this.filePath;
  }
  
  public void setFilePath(String paramString) {
    this.filePath = paramString;
  }
  
  public String getBackingObjectId() {
    return this.backingObjectId;
  }
  
  public void setBackingObjectId(String paramString) {
    this.backingObjectId = paramString;
  }
  
  public BaseConfigInfoFileBackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(BaseConfigInfoFileBackingInfo paramBaseConfigInfoFileBackingInfo) {
    this.parent = paramBaseConfigInfoFileBackingInfo;
  }
  
  public Long getDeltaSizeInMB() {
    return this.deltaSizeInMB;
  }
  
  public void setDeltaSizeInMB(Long paramLong) {
    this.deltaSizeInMB = paramLong;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
}
