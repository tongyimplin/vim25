package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ScheduledTaskInfo;
import com.vmware.vim25.ScheduledTaskSpec;
import com.vmware.vim25.TaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskSpec", propOrder = {"name", "description", "enabled", "scheduler", "action", "notification"})
@XmlSeeAlso({ScheduledTaskInfo.class})
public class ScheduledTaskSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String description;
  
  protected boolean enabled;
  
  @XmlElement(required = true)
  protected TaskScheduler scheduler;
  
  @XmlElement(required = true)
  protected Action action;
  
  protected String notification;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public TaskScheduler getScheduler() {
    return this.scheduler;
  }
  
  public void setScheduler(TaskScheduler paramTaskScheduler) {
    this.scheduler = paramTaskScheduler;
  }
  
  public Action getAction() {
    return this.action;
  }
  
  public void setAction(Action paramAction) {
    this.action = paramAction;
  }
  
  public String getNotification() {
    return this.notification;
  }
  
  public void setNotification(String paramString) {
    this.notification = paramString;
  }
}
