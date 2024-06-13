package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualPS2ControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPS2ControllerOption", propOrder = {"numKeyboards", "numPointingDevices"})
public class VirtualPS2ControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numKeyboards;
  
  @XmlElement(required = true)
  protected IntOption numPointingDevices;
  
  public IntOption getNumKeyboards() {
    return this.numKeyboards;
  }
  
  public void setNumKeyboards(IntOption paramIntOption) {
    this.numKeyboards = paramIntOption;
  }
  
  public IntOption getNumPointingDevices() {
    return this.numPointingDevices;
  }
  
  public void setNumPointingDevices(IntOption paramIntOption) {
    this.numPointingDevices = paramIntOption;
  }
}
