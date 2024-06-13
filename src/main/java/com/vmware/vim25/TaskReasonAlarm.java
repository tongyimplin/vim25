package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskReason;
import com.vmware.vim25.TaskReasonAlarm;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskReasonAlarm", propOrder = {"alarmName", "alarm", "entityName", "entity"})
public class TaskReasonAlarm extends TaskReason {
  @XmlElement(required = true)
  protected String alarmName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference alarm;
  
  @XmlElement(required = true)
  protected String entityName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  public String getAlarmName() {
    return this.alarmName;
  }
  
  public void setAlarmName(String paramString) {
    this.alarmName = paramString;
  }
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
