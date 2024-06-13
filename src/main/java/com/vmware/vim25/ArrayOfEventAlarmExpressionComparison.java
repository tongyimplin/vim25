package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEventAlarmExpressionComparison;
import com.vmware.vim25.EventAlarmExpressionComparison;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventAlarmExpressionComparison", propOrder = {"eventAlarmExpressionComparison"})
public class ArrayOfEventAlarmExpressionComparison {
  @XmlElement(name = "EventAlarmExpressionComparison")
  protected List<EventAlarmExpressionComparison> eventAlarmExpressionComparison;
  
  public List<EventAlarmExpressionComparison> getEventAlarmExpressionComparison() {
    if (this.eventAlarmExpressionComparison == null)
      this.eventAlarmExpressionComparison = new ArrayList<>(); 
    return this.eventAlarmExpressionComparison;
  }
}
