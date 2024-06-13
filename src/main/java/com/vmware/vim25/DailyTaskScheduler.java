package com.vmware.vim25;

import com.vmware.vim25.DailyTaskScheduler;
import com.vmware.vim25.HourlyTaskScheduler;
import com.vmware.vim25.MonthlyTaskScheduler;
import com.vmware.vim25.WeeklyTaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyTaskScheduler", propOrder = {"hour"})
@XmlSeeAlso({MonthlyTaskScheduler.class, WeeklyTaskScheduler.class})
public class DailyTaskScheduler extends HourlyTaskScheduler {
  protected int hour;
  
  public int getHour() {
    return this.hour;
  }
  
  public void setHour(int paramInt) {
    this.hour = paramInt;
  }
}
