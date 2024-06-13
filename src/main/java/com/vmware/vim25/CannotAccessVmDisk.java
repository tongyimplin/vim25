package com.vmware.vim25;

import com.vmware.vim25.CannotAccessVmDevice;
import com.vmware.vim25.CannotAccessVmDisk;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.RDMPointsToInaccessibleDisk;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotAccessVmDisk", propOrder = {"fault"})
@XmlSeeAlso({RDMPointsToInaccessibleDisk.class})
public class CannotAccessVmDisk extends CannotAccessVmDevice {
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
