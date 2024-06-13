package com.vmware.vim25;

import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.StateAlarmExpression;
import com.vmware.vim25.StateAlarmOperator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateAlarmExpression", propOrder = {"operator", "type", "statePath", "yellow", "red"})
public class StateAlarmExpression extends AlarmExpression {
  @XmlElement(required = true)
  protected StateAlarmOperator operator;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String statePath;
  
  protected String yellow;
  
  protected String red;
  
  public StateAlarmOperator getOperator() {
    return this.operator;
  }
  
  public void setOperator(StateAlarmOperator paramStateAlarmOperator) {
    this.operator = paramStateAlarmOperator;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getStatePath() {
    return this.statePath;
  }
  
  public void setStatePath(String paramString) {
    this.statePath = paramString;
  }
  
  public String getYellow() {
    return this.yellow;
  }
  
  public void setYellow(String paramString) {
    this.yellow = paramString;
  }
  
  public String getRed() {
    return this.red;
  }
  
  public void setRed(String paramString) {
    this.red = paramString;
  }
}
