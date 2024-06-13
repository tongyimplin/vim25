package com.vmware.vim25;

import com.vmware.vim25.AfterStartupTaskScheduler;
import com.vmware.vim25.TaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AfterStartupTaskScheduler", propOrder = {"minute"})
public class AfterStartupTaskScheduler extends TaskScheduler {
  protected int minute;
  
  public int getMinute() {
    return this.minute;
  }
  
  public void setMinute(int paramInt) {
    this.minute = paramInt;
  }
}
