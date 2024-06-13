package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventAlarmExpressionComparison;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAlarmExpressionComparison", propOrder = {"attributeName", "operator", "value"})
public class EventAlarmExpressionComparison extends DynamicData {
  @XmlElement(required = true)
  protected String attributeName;
  
  @XmlElement(required = true)
  protected String operator;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getAttributeName() {
    return this.attributeName;
  }
  
  public void setAttributeName(String paramString) {
    this.attributeName = paramString;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
