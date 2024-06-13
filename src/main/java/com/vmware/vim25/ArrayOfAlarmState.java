package com.vmware.vim25;

import com.vmware.vim25.AlarmState;
import com.vmware.vim25.ArrayOfAlarmState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmState", propOrder = {"alarmState"})
public class ArrayOfAlarmState {
  @XmlElement(name = "AlarmState")
  protected List<AlarmState> alarmState;
  
  public List<AlarmState> getAlarmState() {
    if (this.alarmState == null)
      this.alarmState = new ArrayList<>(); 
    return this.alarmState;
  }
}
