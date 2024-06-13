package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmNamespaceInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmNamespaceInfo", propOrder = {"uuid", "friendlyName", "blockSize", "blockCount", "type", "namespaceHealthStatus", "locationID", "state"})
public class NvdimmNamespaceInfo extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String friendlyName;
  
  protected long blockSize;
  
  protected long blockCount;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String namespaceHealthStatus;
  
  protected int locationID;
  
  @XmlElement(required = true)
  protected String state;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
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
  
  public String getNamespaceHealthStatus() {
    return this.namespaceHealthStatus;
  }
  
  public void setNamespaceHealthStatus(String paramString) {
    this.namespaceHealthStatus = paramString;
  }
  
  public int getLocationID() {
    return this.locationID;
  }
  
  public void setLocationID(int paramInt) {
    this.locationID = paramInt;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
}
