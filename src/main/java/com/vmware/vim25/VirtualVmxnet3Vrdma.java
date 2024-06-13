package com.vmware.vim25;

import com.vmware.vim25.VirtualVmxnet3;
import com.vmware.vim25.VirtualVmxnet3Vrdma;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3Vrdma", propOrder = {"deviceProtocol"})
public class VirtualVmxnet3Vrdma extends VirtualVmxnet3 {
  protected String deviceProtocol;
  
  public String getDeviceProtocol() {
    return this.deviceProtocol;
  }
  
  public void setDeviceProtocol(String paramString) {
    this.deviceProtocol = paramString;
  }
}
