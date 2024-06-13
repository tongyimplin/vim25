package com.vmware.vim25;

import com.vmware.vim25.HourlyTaskScheduler;
import com.vmware.vim25.RecurrentTaskScheduler;
import com.vmware.vim25.TaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrentTaskScheduler", propOrder = {"interval"})
@XmlSeeAlso({HourlyTaskScheduler.class})
public class RecurrentTaskScheduler extends TaskScheduler {
  protected int interval;
  
  public int getInterval() {
    return this.interval;
  }
  
  public void setInterval(int paramInt) {
    this.interval = paramInt;
  }
}
