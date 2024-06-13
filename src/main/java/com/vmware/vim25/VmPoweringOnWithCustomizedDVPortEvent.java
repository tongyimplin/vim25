package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmPoweringOnWithCustomizedDVPortEvent;
import com.vmware.vim25.VnicPortArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPoweringOnWithCustomizedDVPortEvent", propOrder = {"vnic"})
public class VmPoweringOnWithCustomizedDVPortEvent extends VmEvent {
  @XmlElement(required = true)
  protected List<VnicPortArgument> vnic;
  
  public List<VnicPortArgument> getVnic() {
    if (this.vnic == null)
      this.vnic = new ArrayList<>(); 
    return this.vnic;
  }
}
