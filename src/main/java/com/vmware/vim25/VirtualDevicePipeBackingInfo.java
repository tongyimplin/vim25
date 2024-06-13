package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDevicePipeBackingInfo;
import com.vmware.vim25.VirtualSerialPortPipeBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevicePipeBackingInfo", propOrder = {"pipeName"})
@XmlSeeAlso({VirtualSerialPortPipeBackingInfo.class})
public class VirtualDevicePipeBackingInfo extends VirtualDeviceBackingInfo {
  @XmlElement(required = true)
  protected String pipeName;
  
  public String getPipeName() {
    return this.pipeName;
  }
  
  public void setPipeName(String paramString) {
    this.pipeName = paramString;
  }
}
