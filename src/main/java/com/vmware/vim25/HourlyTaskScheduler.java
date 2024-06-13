package com.vmware.vim25;

import com.vmware.vim25.DailyTaskScheduler;
import com.vmware.vim25.HourlyTaskScheduler;
import com.vmware.vim25.RecurrentTaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyTaskScheduler", propOrder = {"minute"})
@XmlSeeAlso({DailyTaskScheduler.class})
public class HourlyTaskScheduler extends RecurrentTaskScheduler {
  protected int minute;
  
  public int getMinute() {
    return this.minute;
  }
  
  public void setMinute(int paramInt) {
    this.minute = paramInt;
  }
}
