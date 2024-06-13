package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OvfFileItem;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfFileItem", propOrder = {"deviceId", "path", "compressionMethod", "chunkSize", "size", "cimType", "create"})
public class OvfFileItem extends DynamicData {
  @XmlElement(required = true)
  protected String deviceId;
  
  @XmlElement(required = true)
  protected String path;
  
  protected String compressionMethod;
  
  protected Long chunkSize;
  
  protected Long size;
  
  protected int cimType;
  
  protected boolean create;
  
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
  
  public Long getSize() {
    return this.size;
  }
  
  public void setSize(Long paramLong) {
    this.size = paramLong;
  }
  
  public int getCimType() {
    return this.cimType;
  }
  
  public void setCimType(int paramInt) {
    this.cimType = paramInt;
  }
  
  public boolean isCreate() {
    return this.create;
  }
  
  public void setCreate(boolean paramBoolean) {
    this.create = paramBoolean;
  }
}
