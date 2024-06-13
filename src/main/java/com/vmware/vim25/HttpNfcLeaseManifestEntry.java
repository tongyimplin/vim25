package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseManifestEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseManifestEntry", propOrder = {"key", "sha1", "checksum", "checksumType", "size", "disk", "capacity", "populatedSize"})
public class HttpNfcLeaseManifestEntry extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String sha1;
  
  protected String checksum;
  
  protected String checksumType;
  
  protected long size;
  
  protected boolean disk;
  
  protected Long capacity;
  
  protected Long populatedSize;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getSha1() {
    return this.sha1;
  }
  
  public void setSha1(String paramString) {
    this.sha1 = paramString;
  }
  
  public String getChecksum() {
    return this.checksum;
  }
  
  public void setChecksum(String paramString) {
    this.checksum = paramString;
  }
  
  public String getChecksumType() {
    return this.checksumType;
  }
  
  public void setChecksumType(String paramString) {
    this.checksumType = paramString;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public boolean isDisk() {
    return this.disk;
  }
  
  public void setDisk(boolean paramBoolean) {
    this.disk = paramBoolean;
  }
  
  public Long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(Long paramLong) {
    this.capacity = paramLong;
  }
  
  public Long getPopulatedSize() {
    return this.populatedSize;
  }
  
  public void setPopulatedSize(Long paramLong) {
    this.populatedSize = paramLong;
  }
}
