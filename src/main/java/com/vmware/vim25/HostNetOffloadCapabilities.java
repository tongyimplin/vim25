package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetOffloadCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetOffloadCapabilities", propOrder = {"csumOffload", "tcpSegmentation", "zeroCopyXmit"})
public class HostNetOffloadCapabilities extends DynamicData {
  protected Boolean csumOffload;
  
  protected Boolean tcpSegmentation;
  
  protected Boolean zeroCopyXmit;
  
  public Boolean isCsumOffload() {
    return this.csumOffload;
  }
  
  public void setCsumOffload(Boolean paramBoolean) {
    this.csumOffload = paramBoolean;
  }
  
  public Boolean isTcpSegmentation() {
    return this.tcpSegmentation;
  }
  
  public void setTcpSegmentation(Boolean paramBoolean) {
    this.tcpSegmentation = paramBoolean;
  }
  
  public Boolean isZeroCopyXmit() {
    return this.zeroCopyXmit;
  }
  
  public void setZeroCopyXmit(Boolean paramBoolean) {
    this.zeroCopyXmit = paramBoolean;
  }
}
