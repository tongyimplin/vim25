package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmNamespaceCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmNamespaceCreateSpec", propOrder = {"friendlyName", "blockSize", "blockCount", "type", "locationID"})
public class NvdimmNamespaceCreateSpec extends DynamicData {
  protected String friendlyName;
  
  protected long blockSize;
  
  protected long blockCount;
  
  @XmlElement(required = true)
  protected String type;
  
  protected int locationID;
  
  public String getFriendlyName() {
    return this.friendlyName;
  }
  
  public void setFriendlyName(String paramString) {
    this.friendlyName = paramString;
  }
  
  public long getBlockSize() {
    return this.blockSize;
  }
  
  public void setBlockSize(long paramLong) {
    this.blockSize = paramLong;
  }
  
  public long getBlockCount() {
    return this.blockCount;
  }
  
  public void setBlockCount(long paramLong) {
    this.blockCount = paramLong;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public int getLocationID() {
    return this.locationID;
  }
  
  public void setLocationID(int paramInt) {
    this.locationID = paramInt;
  }
}
