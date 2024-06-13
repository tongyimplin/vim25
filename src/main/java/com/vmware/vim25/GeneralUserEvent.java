package com.vmware.vim25;

import com.vmware.vim25.GeneralEvent;
import com.vmware.vim25.GeneralUserEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralUserEvent", propOrder = {"entity"})
public class GeneralUserEvent extends GeneralEvent {
  protected ManagedEntityEventArgument entity;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
}
