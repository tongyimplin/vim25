package com.vmware.vim25;

import com.vmware.vim25.ArrayOfScheduledTaskDetail;
import com.vmware.vim25.ScheduledTaskDetail;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScheduledTaskDetail", propOrder = {"scheduledTaskDetail"})
public class ArrayOfScheduledTaskDetail {
  @XmlElement(name = "ScheduledTaskDetail")
  protected List<ScheduledTaskDetail> scheduledTaskDetail;
  
  public List<ScheduledTaskDetail> getScheduledTaskDetail() {
    if (this.scheduledTaskDetail == null)
      this.scheduledTaskDetail = new ArrayList<>(); 
    return this.scheduledTaskDetail;
  }
}
