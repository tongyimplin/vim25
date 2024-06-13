package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualAHCIControllerOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualSATAControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSATAControllerOption", propOrder = {"numSATADisks", "numSATACdroms"})
@XmlSeeAlso({VirtualAHCIControllerOption.class})
public class VirtualSATAControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numSATADisks;
  
  @XmlElement(required = true)
  protected IntOption numSATACdroms;
  
  public IntOption getNumSATADisks() {
    return this.numSATADisks;
  }
  
  public void setNumSATADisks(IntOption paramIntOption) {
    this.numSATADisks = paramIntOption;
  }
  
  public IntOption getNumSATACdroms() {
    return this.numSATACdroms;
  }
  
  public void setNumSATACdroms(IntOption paramIntOption) {
    this.numSATACdroms = paramIntOption;
  }
}
