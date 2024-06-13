package com.vmware.vim25;

import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.ArrayOfAlarmExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmExpression", propOrder = {"alarmExpression"})
public class ArrayOfAlarmExpression {
  @XmlElement(name = "AlarmExpression")
  protected List<AlarmExpression> alarmExpression;
  
  public List<AlarmExpression> getAlarmExpression() {
    if (this.alarmExpression == null)
      this.alarmExpression = new ArrayList<>(); 
    return this.alarmExpression;
  }
}
