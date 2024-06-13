package com.vmware.vim25;

import com.vmware.vim25.DayOfWeek;
import com.vmware.vim25.MonthlyByWeekdayTaskScheduler;
import com.vmware.vim25.MonthlyTaskScheduler;
import com.vmware.vim25.WeekOfMonth;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyByWeekdayTaskScheduler", propOrder = {"offset", "weekday"})
public class MonthlyByWeekdayTaskScheduler extends MonthlyTaskScheduler {
  @XmlElement(required = true)
  protected WeekOfMonth offset;
  
  @XmlElement(required = true)
  protected DayOfWeek weekday;
  
  public WeekOfMonth getOffset() {
    return this.offset;
  }
  
  public void setOffset(WeekOfMonth paramWeekOfMonth) {
    this.offset = paramWeekOfMonth;
  }
  
  public DayOfWeek getWeekday() {
    return this.weekday;
  }
  
  public void setWeekday(DayOfWeek paramDayOfWeek) {
    this.weekday = paramDayOfWeek;
  }
}
