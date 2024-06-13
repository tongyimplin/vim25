package com.vmware.vim25;

import com.vmware.vim25.MonthlyByDayTaskScheduler;
import com.vmware.vim25.MonthlyTaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyByDayTaskScheduler", propOrder = {"day"})
public class MonthlyByDayTaskScheduler extends MonthlyTaskScheduler {
  protected int day;
  
  public int getDay() {
    return this.day;
  }
  
  public void setDay(int paramInt) {
    this.day = paramInt;
  }
}
