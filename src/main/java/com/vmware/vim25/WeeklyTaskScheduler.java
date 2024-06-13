package com.vmware.vim25;

import com.vmware.vim25.DailyTaskScheduler;
import com.vmware.vim25.WeeklyTaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyTaskScheduler", propOrder = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"})
public class WeeklyTaskScheduler extends DailyTaskScheduler {
  protected boolean sunday;
  
  protected boolean monday;
  
  protected boolean tuesday;
  
  protected boolean wednesday;
  
  protected boolean thursday;
  
  protected boolean friday;
  
  protected boolean saturday;
  
  public boolean isSunday() {
    return this.sunday;
  }
  
  public void setSunday(boolean paramBoolean) {
    this.sunday = paramBoolean;
  }
  
  public boolean isMonday() {
    return this.monday;
  }
  
  public void setMonday(boolean paramBoolean) {
    this.monday = paramBoolean;
  }
  
  public boolean isTuesday() {
    return this.tuesday;
  }
  
  public void setTuesday(boolean paramBoolean) {
    this.tuesday = paramBoolean;
  }
  
  public boolean isWednesday() {
    return this.wednesday;
  }
  
  public void setWednesday(boolean paramBoolean) {
    this.wednesday = paramBoolean;
  }
  
  public boolean isThursday() {
    return this.thursday;
  }
  
  public void setThursday(boolean paramBoolean) {
    this.thursday = paramBoolean;
  }
  
  public boolean isFriday() {
    return this.friday;
  }
  
  public void setFriday(boolean paramBoolean) {
    this.friday = paramBoolean;
  }
  
  public boolean isSaturday() {
    return this.saturday;
  }
  
  public void setSaturday(boolean paramBoolean) {
    this.saturday = paramBoolean;
  }
}
