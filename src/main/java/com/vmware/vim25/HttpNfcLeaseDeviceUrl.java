package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseDeviceUrl;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseDeviceUrl", propOrder = {"key", "importKey", "url", "sslThumbprint", "disk", "targetId", "datastoreKey", "fileSize"})
public class HttpNfcLeaseDeviceUrl extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String importKey;
  
  @XmlElement(required = true)
  protected String url;
  
  @XmlElement(required = true)
  protected String sslThumbprint;
  
  protected Boolean disk;
  
  protected String targetId;
  
  protected String datastoreKey;
  
  protected Long fileSize;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getImportKey() {
    return this.importKey;
  }
  
  public void setImportKey(String paramString) {
    this.importKey = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
  
  public Boolean isDisk() {
    return this.disk;
  }
  
  public void setDisk(Boolean paramBoolean) {
    this.disk = paramBoolean;
  }
  
  public String getTargetId() {
    return this.targetId;
  }
  
  public void setTargetId(String paramString) {
    this.targetId = paramString;
  }
  
  public String getDatastoreKey() {
    return this.datastoreKey;
  }
  
  public void setDatastoreKey(String paramString) {
    this.datastoreKey = paramString;
  }
  
  public Long getFileSize() {
    return this.fileSize;
  }
  
  public void setFileSize(Long paramLong) {
    this.fileSize = paramLong;
  }
}
