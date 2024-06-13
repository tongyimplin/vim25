package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualSIOControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSIOControllerOption", propOrder = {"numFloppyDrives", "numSerialPorts", "numParallelPorts"})
public class VirtualSIOControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numFloppyDrives;
  
  @XmlElement(required = true)
  protected IntOption numSerialPorts;
  
  @XmlElement(required = true)
  protected IntOption numParallelPorts;
  
  public IntOption getNumFloppyDrives() {
    return this.numFloppyDrives;
  }
  
  public void setNumFloppyDrives(IntOption paramIntOption) {
    this.numFloppyDrives = paramIntOption;
  }
  
  public IntOption getNumSerialPorts() {
    return this.numSerialPorts;
  }
  
  public void setNumSerialPorts(IntOption paramIntOption) {
    this.numSerialPorts = paramIntOption;
  }
  
  public IntOption getNumParallelPorts() {
    return this.numParallelPorts;
  }
  
  public void setNumParallelPorts(IntOption paramIntOption) {
    this.numParallelPorts = paramIntOption;
  }
}
