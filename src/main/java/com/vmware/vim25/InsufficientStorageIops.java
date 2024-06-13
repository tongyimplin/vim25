package com.vmware.vim25;

import com.vmware.vim25.InsufficientStorageIops;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientStorageIops", propOrder = {"unreservedIops", "requestedIops", "datastoreName"})
public class InsufficientStorageIops extends VimFault {
  protected long unreservedIops;
  
  protected long requestedIops;
  
  @XmlElement(required = true)
  protected String datastoreName;
  
  public long getUnreservedIops() {
    return this.unreservedIops;
  }
  
  public void setUnreservedIops(long paramLong) {
    this.unreservedIops = paramLong;
  }
  
  public long getRequestedIops() {
    return this.requestedIops;
  }
  
  public void setRequestedIops(long paramLong) {
    this.requestedIops = paramLong;
  }
  
  public String getDatastoreName() {
    return this.datastoreName;
  }
  
  public void setDatastoreName(String paramString) {
    this.datastoreName = paramString;
  }
}
