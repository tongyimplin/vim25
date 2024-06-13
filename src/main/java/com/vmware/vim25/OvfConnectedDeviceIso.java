package com.vmware.vim25;

import com.vmware.vim25.OvfConnectedDevice;
import com.vmware.vim25.OvfConnectedDeviceIso;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConnectedDeviceIso", propOrder = {"filename"})
public class OvfConnectedDeviceIso extends OvfConnectedDevice {
  @XmlElement(required = true)
  protected String filename;
  
  public String getFilename() {
    return this.filename;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
}
