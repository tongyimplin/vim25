package com.vmware.vim25;

import com.vmware.vim25.HostRdmaDeviceBacking;
import com.vmware.vim25.HostRdmaDevicePnicBacking;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDevicePnicBacking", propOrder = {"pairedUplink"})
public class HostRdmaDevicePnicBacking extends HostRdmaDeviceBacking {
  @XmlElement(required = true)
  protected String pairedUplink;
  
  public String getPairedUplink() {
    return this.pairedUplink;
  }
  
  public void setPairedUplink(String paramString) {
    this.pairedUplink = paramString;
  }
}
