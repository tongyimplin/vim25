package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskFilterSpec;
import com.vmware.vim25.TaskFilterSpecByEntity;
import com.vmware.vim25.TaskFilterSpecByTime;
import com.vmware.vim25.TaskFilterSpecByUsername;
import com.vmware.vim25.TaskInfoState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpec", propOrder = {"entity", "time", "userName", "activationId", "state", "alarm", "scheduledTask", "eventChainId", "tag", "parentTaskKey", "rootTaskKey"})
public class TaskFilterSpec extends DynamicData {
  protected TaskFilterSpecByEntity entity;
  
  protected TaskFilterSpecByTime time;
  
  protected TaskFilterSpecByUsername userName;
  
  protected List<String> activationId;
  
  protected List<TaskInfoState> state;
  
  protected ManagedObjectReference alarm;
  
  protected ManagedObjectReference scheduledTask;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> eventChainId;
  
  protected List<String> tag;
  
  protected List<String> parentTaskKey;
  
  protected List<String> rootTaskKey;
  
  public TaskFilterSpecByEntity getEntity() {
    return this.entity;
  }
  
  public void setEntity(TaskFilterSpecByEntity paramTaskFilterSpecByEntity) {
    this.entity = paramTaskFilterSpecByEntity;
  }
  
  public TaskFilterSpecByTime getTime() {
    return this.time;
  }
  
  public void setTime(TaskFilterSpecByTime paramTaskFilterSpecByTime) {
    this.time = paramTaskFilterSpecByTime;
  }
  
  public TaskFilterSpecByUsername getUserName() {
    return this.userName;
  }
  
  public void setUserName(TaskFilterSpecByUsername paramTaskFilterSpecByUsername) {
    this.userName = paramTaskFilterSpecByUsername;
  }
  
  public List<String> getActivationId() {
    if (this.activationId == null)
      this.activationId = new ArrayList<>(); 
    return this.activationId;
  }
  
  public List<TaskInfoState> getState() {
    if (this.state == null)
      this.state = new ArrayList<>(); 
    return this.state;
  }
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getScheduledTask() {
    return this.scheduledTask;
  }
  
  public void setScheduledTask(ManagedObjectReference paramManagedObjectReference) {
    this.scheduledTask = paramManagedObjectReference;
  }
  
  public List<Integer> getEventChainId() {
    if (this.eventChainId == null)
      this.eventChainId = new ArrayList<>(); 
    return this.eventChainId;
  }
  
  public List<String> getTag() {
    if (this.tag == null)
      this.tag = new ArrayList<>(); 
    return this.tag;
  }
  
  public List<String> getParentTaskKey() {
    if (this.parentTaskKey == null)
      this.parentTaskKey = new ArrayList<>(); 
    return this.parentTaskKey;
  }
  
  public List<String> getRootTaskKey() {
    if (this.rootTaskKey == null)
      this.rootTaskKey = new ArrayList<>(); 
    return this.rootTaskKey;
  }
}
