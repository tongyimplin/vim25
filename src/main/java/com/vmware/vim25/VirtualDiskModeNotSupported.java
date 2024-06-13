package com.vmware.vim25;

import com.vmware.vim25.DeviceNotSupported;
import com.vmware.vim25.VirtualDiskModeNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskModeNotSupported", propOrder = {"mode"})
public class VirtualDiskModeNotSupported extends DeviceNotSupported {
  @XmlElement(required = true)
  protected String mode;
  
  public String getMode() {
    return this.mode;
  }
  
  public void setMode(String paramString) {
    this.mode = paramString;
  }
}
