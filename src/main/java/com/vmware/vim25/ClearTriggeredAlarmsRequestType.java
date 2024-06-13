package com.vmware.vim25;

import com.vmware.vim25.AlarmFilterSpec;
import com.vmware.vim25.ClearTriggeredAlarmsRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearTriggeredAlarmsRequestType", propOrder = {"_this", "filter"})
public class ClearTriggeredAlarmsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected AlarmFilterSpec filter;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public AlarmFilterSpec getFilter() {
    return this.filter;
  }
  
  public void setFilter(AlarmFilterSpec paramAlarmFilterSpec) {
    this.filter = paramAlarmFilterSpec;
  }
}
