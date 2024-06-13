package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventFilterSpec;
import com.vmware.vim25.EventFilterSpecByEntity;
import com.vmware.vim25.EventFilterSpecByTime;
import com.vmware.vim25.EventFilterSpecByUsername;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterSpec", propOrder = {"entity", "time", "userName", "eventChainId", "alarm", "scheduledTask", "disableFullMessage", "category", "type", "tag", "eventTypeId", "maxCount"})
public class EventFilterSpec extends DynamicData {
  protected EventFilterSpecByEntity entity;
  
  protected EventFilterSpecByTime time;
  
  protected EventFilterSpecByUsername userName;
  
  protected Integer eventChainId;
  
  protected ManagedObjectReference alarm;
  
  protected ManagedObjectReference scheduledTask;
  
  protected Boolean disableFullMessage;
  
  protected List<String> category;
  
  protected List<String> type;
  
  protected List<String> tag;
  
  protected List<String> eventTypeId;
  
  protected Integer maxCount;
  
  public EventFilterSpecByEntity getEntity() {
    return this.entity;
  }
  
  public void setEntity(EventFilterSpecByEntity paramEventFilterSpecByEntity) {
    this.entity = paramEventFilterSpecByEntity;
  }
  
  public EventFilterSpecByTime getTime() {
    return this.time;
  }
  
  public void setTime(EventFilterSpecByTime paramEventFilterSpecByTime) {
    this.time = paramEventFilterSpecByTime;
  }
  
  public EventFilterSpecByUsername getUserName() {
    return this.userName;
  }
  
  public void setUserName(EventFilterSpecByUsername paramEventFilterSpecByUsername) {
    this.userName = paramEventFilterSpecByUsername;
  }
  
  public Integer getEventChainId() {
    return this.eventChainId;
  }
  
  public void setEventChainId(Integer paramInteger) {
    this.eventChainId = paramInteger;
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
  
  public Boolean isDisableFullMessage() {
    return this.disableFullMessage;
  }
  
  public void setDisableFullMessage(Boolean paramBoolean) {
    this.disableFullMessage = paramBoolean;
  }
  
  public List<String> getCategory() {
    if (this.category == null)
      this.category = new ArrayList<>(); 
    return this.category;
  }
  
  public List<String> getType() {
    if (this.type == null)
      this.type = new ArrayList<>(); 
    return this.type;
  }
  
  public List<String> getTag() {
    if (this.tag == null)
      this.tag = new ArrayList<>(); 
    return this.tag;
  }
  
  public List<String> getEventTypeId() {
    if (this.eventTypeId == null)
      this.eventTypeId = new ArrayList<>(); 
    return this.eventTypeId;
  }
  
  public Integer getMaxCount() {
    return this.maxCount;
  }
  
  public void setMaxCount(Integer paramInteger) {
    this.maxCount = paramInteger;
  }
}
