package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualNVDIMMControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMControllerOption", propOrder = {"numNVDIMMControllers"})
public class VirtualNVDIMMControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numNVDIMMControllers;
  
  public IntOption getNumNVDIMMControllers() {
    return this.numNVDIMMControllers;
  }
  
  public void setNumNVDIMMControllers(IntOption paramIntOption) {
    this.numNVDIMMControllers = paramIntOption;
  }
}
