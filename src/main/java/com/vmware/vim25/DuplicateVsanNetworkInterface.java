package com.vmware.vim25;

import com.vmware.vim25.DuplicateVsanNetworkInterface;
import com.vmware.vim25.VsanFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateVsanNetworkInterface", propOrder = {"device"})
public class DuplicateVsanNetworkInterface extends VsanFault {
  @XmlElement(required = true)
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
