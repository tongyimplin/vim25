package com.vmware.vim25;

import com.vmware.vim25.DisallowedMigrationDeviceAttached;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.MigrationFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisallowedMigrationDeviceAttached", propOrder = {"fault"})
public class DisallowedMigrationDeviceAttached extends MigrationFault {
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
