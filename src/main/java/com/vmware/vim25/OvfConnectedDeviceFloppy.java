package com.vmware.vim25;

import com.vmware.vim25.OvfConnectedDevice;
import com.vmware.vim25.OvfConnectedDeviceFloppy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConnectedDeviceFloppy", propOrder = {"filename"})
public class OvfConnectedDeviceFloppy extends OvfConnectedDevice {
  @XmlElement(required = true)
  protected String filename;
  
  public String getFilename() {
    return this.filename;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
}
