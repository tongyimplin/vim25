package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.SnapshotFault;
import com.vmware.vim25.SnapshotIncompatibleDeviceInVm;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotIncompatibleDeviceInVm", propOrder = {"fault"})
public class SnapshotIncompatibleDeviceInVm extends SnapshotFault {
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
