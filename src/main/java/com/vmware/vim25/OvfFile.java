package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OvfFile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfFile", propOrder = {"deviceId", "path", "compressionMethod", "chunkSize", "size", "capacity", "populatedSize"})
public class OvfFile extends DynamicData {
  @XmlElement(required = true)
  protected String deviceId;
  
  @XmlElement(required = true)
  protected String path;
  
  protected String compressionMethod;
  
  protected Long chunkSize;
  
  protected long size;
  
  protected Long capacity;
  
  protected Long populatedSize;
  
  public String getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(String paramString) {
    this.deviceId = paramString;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getCompressionMethod() {
    return this.compressionMethod;
  }
  
  public void setCompressionMethod(String paramString) {
    this.compressionMethod = paramString;
  }
  
  public Long getChunkSize() {
    return this.chunkSize;
  }
  
  public void setChunkSize(Long paramLong) {
    this.chunkSize = paramLong;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
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
