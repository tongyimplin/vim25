package com.vmware.vim25;

import com.vmware.vim25.DeviceControllerNotSupported;
import com.vmware.vim25.DeviceNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceControllerNotSupported", propOrder = {"controller"})
public class DeviceControllerNotSupported extends DeviceNotSupported {
  @XmlElement(required = true)
  protected String controller;
  
  public String getController() {
    return this.controller;
  }
  
  public void setController(String paramString) {
    this.controller = paramString;
  }
}
