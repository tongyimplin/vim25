package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualTPMOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualTPMOption", propOrder = {"supportedFirmware"})
public class VirtualTPMOption extends VirtualDeviceOption {
  protected List<String> supportedFirmware;
  
  public List<String> getSupportedFirmware() {
    if (this.supportedFirmware == null)
      this.supportedFirmware = new ArrayList<>(); 
    return this.supportedFirmware;
  }
}
