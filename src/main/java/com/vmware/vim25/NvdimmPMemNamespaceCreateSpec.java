package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmPMemNamespaceCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmPMemNamespaceCreateSpec", propOrder = {"friendlyName", "size", "interleavesetID"})
public class NvdimmPMemNamespaceCreateSpec extends DynamicData {
  protected String friendlyName;
  
  protected long size;
  
  protected int interleavesetID;
  
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
  
  public int getInterleavesetID() {
    return this.interleavesetID;
  }
  
  public void setInterleavesetID(int paramInt) {
    this.interleavesetID = paramInt;
  }
}
