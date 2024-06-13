package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ScheduledTaskInfo;
import com.vmware.vim25.ScheduledTaskSpec;
import com.vmware.vim25.TaskInfoState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskInfo", propOrder = {"scheduledTask", "entity", "lastModifiedTime", "lastModifiedUser", "nextRunTime", "prevRunTime", "state", "error", "result", "progress", "activeTask", "taskObject"})
public class ScheduledTaskInfo extends ScheduledTaskSpec {
  @XmlElement(required = true)
  protected ManagedObjectReference scheduledTask;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastModifiedTime;
  
  @XmlElement(required = true)
  protected String lastModifiedUser;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar nextRunTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar prevRunTime;
  
  @XmlElement(required = true)
  protected TaskInfoState state;
  
  protected LocalizedMethodFault error;
  
  protected Object result;
  
  protected Integer progress;
  
  protected ManagedObjectReference activeTask;
  
  protected ManagedObjectReference taskObject;
  
  public ManagedObjectReference getScheduledTask() {
    return this.scheduledTask;
  }
  
  public void setScheduledTask(ManagedObjectReference paramManagedObjectReference) {
    this.scheduledTask = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public XMLGregorianCalendar getLastModifiedTime() {
    return this.lastModifiedTime;
  }
  
  public void setLastModifiedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastModifiedTime = paramXMLGregorianCalendar;
  }
  
  public String getLastModifiedUser() {
    return this.lastModifiedUser;
  }
  
  public void setLastModifiedUser(String paramString) {
    this.lastModifiedUser = paramString;
  }
  
  public XMLGregorianCalendar getNextRunTime() {
    return this.nextRunTime;
  }
  
  public void setNextRunTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.nextRunTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getPrevRunTime() {
    return this.prevRunTime;
  }
  
  public void setPrevRunTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.prevRunTime = paramXMLGregorianCalendar;
  }
  
  public TaskInfoState getState() {
    return this.state;
  }
  
  public void setState(TaskInfoState paramTaskInfoState) {
    this.state = paramTaskInfoState;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
  
  public Object getResult() {
    return this.result;
  }
  
  public void setResult(Object paramObject) {
    this.result = paramObject;
  }
  
  public Integer getProgress() {
    return this.progress;
  }
  
  public void setProgress(Integer paramInteger) {
    this.progress = paramInteger;
  }
  
  public ManagedObjectReference getActiveTask() {
    return this.activeTask;
  }
  
  public void setActiveTask(ManagedObjectReference paramManagedObjectReference) {
    this.activeTask = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getTaskObject() {
    return this.taskObject;
  }
  
  public void setTaskObject(ManagedObjectReference paramManagedObjectReference) {
    this.taskObject = paramManagedObjectReference;
  }
}
