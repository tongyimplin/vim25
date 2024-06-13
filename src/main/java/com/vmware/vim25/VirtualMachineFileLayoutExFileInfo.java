package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayoutExFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutExFileInfo", propOrder = {"key", "name", "type", "size", "uniqueSize", "backingObjectId", "accessible"})
public class VirtualMachineFileLayoutExFileInfo extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String type;
  
  protected long size;
  
  protected Long uniqueSize;
  
  protected String backingObjectId;
  
  protected Boolean accessible;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public Long getUniqueSize() {
    return this.uniqueSize;
  }
  
  public void setUniqueSize(Long paramLong) {
    this.uniqueSize = paramLong;
  }
  
  public String getBackingObjectId() {
    return this.backingObjectId;
  }
  
  public void setBackingObjectId(String paramString) {
    this.backingObjectId = paramString;
  }
  
  public Boolean isAccessible() {
    return this.accessible;
  }
  
  public void setAccessible(Boolean paramBoolean) {
    this.accessible = paramBoolean;
  }
}
