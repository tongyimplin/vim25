package com.vmware.vim25;

import com.vmware.vim25.AlarmEventArgument;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEventArgument", propOrder = {"alarm"})
public class AlarmEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference alarm;
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
}
