package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualNVMEControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVMEControllerOption", propOrder = {"numNVMEDisks"})
public class VirtualNVMEControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numNVMEDisks;
  
  public IntOption getNumNVMEDisks() {
    return this.numNVMEDisks;
  }
  
  public void setNumNVMEDisks(IntOption paramIntOption) {
    this.numNVMEDisks = paramIntOption;
  }
}
