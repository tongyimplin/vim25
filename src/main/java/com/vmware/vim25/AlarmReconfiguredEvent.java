package com.vmware.vim25;

import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AlarmReconfiguredEvent;
import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmReconfiguredEvent", propOrder = {"entity", "configChanges"})
public class AlarmReconfiguredEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  protected ChangesInfoEventArgument configChanges;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public ChangesInfoEventArgument getConfigChanges() {
    return this.configChanges;
  }
  
  public void setConfigChanges(ChangesInfoEventArgument paramChangesInfoEventArgument) {
    this.configChanges = paramChangesInfoEventArgument;
  }
}
