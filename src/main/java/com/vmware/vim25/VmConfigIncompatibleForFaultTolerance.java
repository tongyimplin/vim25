package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmConfigFault;
import com.vmware.vim25.VmConfigIncompatibleForFaultTolerance;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigIncompatibleForFaultTolerance", propOrder = {"fault"})
public class VmConfigIncompatibleForFaultTolerance extends VmConfigFault {
  protected LocalizedMethodFault fault;
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
