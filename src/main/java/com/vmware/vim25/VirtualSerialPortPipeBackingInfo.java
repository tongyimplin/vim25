package com.vmware.vim25;

import com.vmware.vim25.VirtualDevicePipeBackingInfo;
import com.vmware.vim25.VirtualSerialPortPipeBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPortPipeBackingInfo", propOrder = {"endpoint", "noRxLoss"})
public class VirtualSerialPortPipeBackingInfo extends VirtualDevicePipeBackingInfo {
  @XmlElement(required = true)
  protected String endpoint;
  
  protected Boolean noRxLoss;
  
  public String getEndpoint() {
    return this.endpoint;
  }
  
  public void setEndpoint(String paramString) {
    this.endpoint = paramString;
  }
  
  public Boolean isNoRxLoss() {
    return this.noRxLoss;
  }
  
  public void setNoRxLoss(Boolean paramBoolean) {
    this.noRxLoss = paramBoolean;
  }
}
