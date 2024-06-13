package com.vmware.vim25;

import com.vmware.vim25.CreateTaskRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTaskRequestType", propOrder = {"_this", "obj", "taskTypeId", "initiatedBy", "cancelable", "parentTaskKey", "activationId"})
public class CreateTaskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  @XmlElement(required = true)
  protected String taskTypeId;
  
  protected String initiatedBy;
  
  protected boolean cancelable;
  
  protected String parentTaskKey;
  
  protected String activationId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
  
  public String getTaskTypeId() {
    return this.taskTypeId;
  }
  
  public void setTaskTypeId(String paramString) {
    this.taskTypeId = paramString;
  }
  
  public String getInitiatedBy() {
    return this.initiatedBy;
  }
  
  public void setInitiatedBy(String paramString) {
    this.initiatedBy = paramString;
  }
  
  public boolean isCancelable() {
    return this.cancelable;
  }
  
  public void setCancelable(boolean paramBoolean) {
    this.cancelable = paramBoolean;
  }
  
  public String getParentTaskKey() {
    return this.parentTaskKey;
  }
  
  public void setParentTaskKey(String paramString) {
    this.parentTaskKey = paramString;
  }
  
  public String getActivationId() {
    return this.activationId;
  }
  
  public void setActivationId(String paramString) {
    this.activationId = paramString;
  }
}
