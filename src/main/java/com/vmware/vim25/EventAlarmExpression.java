package com.vmware.vim25;

import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.EventAlarmExpression;
import com.vmware.vim25.EventAlarmExpressionComparison;
import com.vmware.vim25.ManagedEntityStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAlarmExpression", propOrder = {"comparisons", "eventType", "eventTypeId", "objectType", "status"})
public class EventAlarmExpression extends AlarmExpression {
  protected List<EventAlarmExpressionComparison> comparisons;
  
  @XmlElement(required = true)
  protected String eventType;
  
  protected String eventTypeId;
  
  protected String objectType;
  
  protected ManagedEntityStatus status;
  
  public List<EventAlarmExpressionComparison> getComparisons() {
    if (this.comparisons == null)
      this.comparisons = new ArrayList<>(); 
    return this.comparisons;
  }
  
  public String getEventType() {
    return this.eventType;
  }
  
  public void setEventType(String paramString) {
    this.eventType = paramString;
  }
  
  public String getEventTypeId() {
    return this.eventTypeId;
  }
  
  public void setEventTypeId(String paramString) {
    this.eventTypeId = paramString;
  }
  
  public String getObjectType() {
    return this.objectType;
  }
  
  public void setObjectType(String paramString) {
    this.objectType = paramString;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
}
