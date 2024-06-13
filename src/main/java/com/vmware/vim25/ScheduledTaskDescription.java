package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.ScheduledTaskDescription;
import com.vmware.vim25.ScheduledTaskDetail;
import com.vmware.vim25.TypeDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskDescription", propOrder = {"action", "schedulerInfo", "state", "dayOfWeek", "weekOfMonth"})
public class ScheduledTaskDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<TypeDescription> action;
  
  @XmlElement(required = true)
  protected List<ScheduledTaskDetail> schedulerInfo;
  
  @XmlElement(required = true)
  protected List<ElementDescription> state;
  
  @XmlElement(required = true)
  protected List<ElementDescription> dayOfWeek;
  
  @XmlElement(required = true)
  protected List<ElementDescription> weekOfMonth;
  
  public List<TypeDescription> getAction() {
    if (this.action == null)
      this.action = new ArrayList<>(); 
    return this.action;
  }
  
  public List<ScheduledTaskDetail> getSchedulerInfo() {
    if (this.schedulerInfo == null)
      this.schedulerInfo = new ArrayList<>(); 
    return this.schedulerInfo;
  }
  
  public List<ElementDescription> getState() {
    if (this.state == null)
      this.state = new ArrayList<>(); 
    return this.state;
  }
  
  public List<ElementDescription> getDayOfWeek() {
    if (this.dayOfWeek == null)
      this.dayOfWeek = new ArrayList<>(); 
    return this.dayOfWeek;
  }
  
  public List<ElementDescription> getWeekOfMonth() {
    if (this.weekOfMonth == null)
      this.weekOfMonth = new ArrayList<>(); 
    return this.weekOfMonth;
  }
}
