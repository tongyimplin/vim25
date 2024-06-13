package com.vmware.vim25;

import com.vmware.vim25.AlarmAction;
import com.vmware.vim25.ArrayOfAlarmAction;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmAction", propOrder = {"alarmAction"})
public class ArrayOfAlarmAction {
  @XmlElement(name = "AlarmAction")
  protected List<AlarmAction> alarmAction;
  
  public List<AlarmAction> getAlarmAction() {
    if (this.alarmAction == null)
      this.alarmAction = new ArrayList<>(); 
    return this.alarmAction;
  }
}
