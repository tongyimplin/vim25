package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualIDEControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualIDEControllerOption", propOrder = {"numIDEDisks", "numIDECdroms"})
public class VirtualIDEControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numIDEDisks;
  
  @XmlElement(required = true)
  protected IntOption numIDECdroms;
  
  public IntOption getNumIDEDisks() {
    return this.numIDEDisks;
  }
  
  public void setNumIDEDisks(IntOption paramIntOption) {
    this.numIDEDisks = paramIntOption;
  }
  
  public IntOption getNumIDECdroms() {
    return this.numIDECdroms;
  }
  
  public void setNumIDECdroms(IntOption paramIntOption) {
    this.numIDECdroms = paramIntOption;
  }
}
