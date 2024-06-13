package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.MigrationErrorEvent;
import com.vmware.vim25.MigrationEvent;
import com.vmware.vim25.MigrationHostErrorEvent;
import com.vmware.vim25.MigrationHostWarningEvent;
import com.vmware.vim25.MigrationResourceErrorEvent;
import com.vmware.vim25.MigrationResourceWarningEvent;
import com.vmware.vim25.MigrationWarningEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationEvent", propOrder = {"fault"})
@XmlSeeAlso({MigrationErrorEvent.class, MigrationHostErrorEvent.class, MigrationResourceWarningEvent.class, MigrationResourceErrorEvent.class, MigrationHostWarningEvent.class, MigrationWarningEvent.class})
public class MigrationEvent extends VmEvent {
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
