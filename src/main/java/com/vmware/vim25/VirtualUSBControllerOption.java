package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualUSBControllerOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBControllerOption", propOrder = {"autoConnectDevices", "ehciSupported", "supportedSpeeds"})
public class VirtualUSBControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected BoolOption autoConnectDevices;
  
  @XmlElement(required = true)
  protected BoolOption ehciSupported;
  
  protected List<String> supportedSpeeds;
  
  public BoolOption getAutoConnectDevices() {
    return this.autoConnectDevices;
  }
  
  public void setAutoConnectDevices(BoolOption paramBoolOption) {
    this.autoConnectDevices = paramBoolOption;
  }
  
  public BoolOption getEhciSupported() {
    return this.ehciSupported;
  }
  
  public void setEhciSupported(BoolOption paramBoolOption) {
    this.ehciSupported = paramBoolOption;
  }
  
  public List<String> getSupportedSpeeds() {
    if (this.supportedSpeeds == null)
      this.supportedSpeeds = new ArrayList<>(); 
    return this.supportedSpeeds;
  }
}
