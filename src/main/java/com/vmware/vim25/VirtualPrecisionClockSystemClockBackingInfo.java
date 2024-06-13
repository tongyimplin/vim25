package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualPrecisionClockSystemClockBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPrecisionClockSystemClockBackingInfo", propOrder = {"protocol"})
public class VirtualPrecisionClockSystemClockBackingInfo extends VirtualDeviceBackingInfo {
  protected String protocol;
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(String paramString) {
    this.protocol = paramString;
  }
}
