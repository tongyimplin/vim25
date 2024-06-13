package com.vmware.vim25;

import com.vmware.vim25.DVPortStatus;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortBlockedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortBlockedEvent", propOrder = {"portKey", "statusDetail", "runtimeInfo", "prevBlockState"})
public class DvsPortBlockedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String portKey;
  
  protected String statusDetail;
  
  protected DVPortStatus runtimeInfo;
  
  protected String prevBlockState;
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public String getStatusDetail() {
    return this.statusDetail;
  }
  
  public void setStatusDetail(String paramString) {
    this.statusDetail = paramString;
  }
  
  public DVPortStatus getRuntimeInfo() {
    return this.runtimeInfo;
  }
  
  public void setRuntimeInfo(DVPortStatus paramDVPortStatus) {
    this.runtimeInfo = paramDVPortStatus;
  }
  
  public String getPrevBlockState() {
    return this.prevBlockState;
  }
  
  public void setPrevBlockState(String paramString) {
    this.prevBlockState = paramString;
  }
}
