package com.vmware.vim25;

import com.vmware.vim25.AlarmTriggeringActionTransitionSpec;
import com.vmware.vim25.ArrayOfAlarmTriggeringActionTransitionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmTriggeringActionTransitionSpec", propOrder = {"alarmTriggeringActionTransitionSpec"})
public class ArrayOfAlarmTriggeringActionTransitionSpec {
  @XmlElement(name = "AlarmTriggeringActionTransitionSpec")
  protected List<AlarmTriggeringActionTransitionSpec> alarmTriggeringActionTransitionSpec;
  
  public List<AlarmTriggeringActionTransitionSpec> getAlarmTriggeringActionTransitionSpec() {
    if (this.alarmTriggeringActionTransitionSpec == null)
      this.alarmTriggeringActionTransitionSpec = new ArrayList<>(); 
    return this.alarmTriggeringActionTransitionSpec;
  }
}
