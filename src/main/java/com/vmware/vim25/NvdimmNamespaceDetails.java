package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmNamespaceDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmNamespaceDetails", propOrder = {"uuid", "friendlyName", "size", "type", "namespaceHealthStatus", "interleavesetID", "state"})
public class NvdimmNamespaceDetails extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String friendlyName;
  
  protected long size;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String namespaceHealthStatus;
  
  protected int interleavesetID;
  
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
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
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
  
  public int getInterleavesetID() {
    return this.interleavesetID;
  }
  
  public void setInterleavesetID(int paramInt) {
    this.interleavesetID = paramInt;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
}
