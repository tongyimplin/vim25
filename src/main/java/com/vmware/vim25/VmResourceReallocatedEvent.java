package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmResourceReallocatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmResourceReallocatedEvent", propOrder = {"configChanges"})
public class VmResourceReallocatedEvent extends VmEvent {
  protected ChangesInfoEventArgument configChanges;
  
  public ChangesInfoEventArgument getConfigChanges() {
    return this.configChanges;
  }
  
  public void setConfigChanges(ChangesInfoEventArgument paramChangesInfoEventArgument) {
    this.configChanges = paramChangesInfoEventArgument;
  }
}
