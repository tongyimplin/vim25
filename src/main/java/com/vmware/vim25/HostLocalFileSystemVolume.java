package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostLocalFileSystemVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLocalFileSystemVolume", propOrder = {"device"})
public class HostLocalFileSystemVolume extends HostFileSystemVolume {
  @XmlElement(required = true)
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
