package com.vmware.vim25;

import com.vmware.vim25.SsdDiskNotAvailable;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsdDiskNotAvailable", propOrder = {"devicePath"})
public class SsdDiskNotAvailable extends VimFault {
  @XmlElement(required = true)
  protected String devicePath;
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
}
