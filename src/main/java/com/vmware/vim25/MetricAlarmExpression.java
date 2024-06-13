package com.vmware.vim25;

import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.MetricAlarmExpression;
import com.vmware.vim25.MetricAlarmOperator;
import com.vmware.vim25.PerfMetricId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricAlarmExpression", propOrder = {"operator", "type", "metric", "yellow", "yellowInterval", "red", "redInterval"})
public class MetricAlarmExpression extends AlarmExpression {
  @XmlElement(required = true)
  protected MetricAlarmOperator operator;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected PerfMetricId metric;
  
  protected Integer yellow;
  
  protected Integer yellowInterval;
  
  protected Integer red;
  
  protected Integer redInterval;
  
  public MetricAlarmOperator getOperator() {
    return this.operator;
  }
  
  public void setOperator(MetricAlarmOperator paramMetricAlarmOperator) {
    this.operator = paramMetricAlarmOperator;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public PerfMetricId getMetric() {
    return this.metric;
  }
  
  public void setMetric(PerfMetricId paramPerfMetricId) {
    this.metric = paramPerfMetricId;
  }
  
  public Integer getYellow() {
    return this.yellow;
  }
  
  public void setYellow(Integer paramInteger) {
    this.yellow = paramInteger;
  }
  
  public Integer getYellowInterval() {
    return this.yellowInterval;
  }
  
  public void setYellowInterval(Integer paramInteger) {
    this.yellowInterval = paramInteger;
  }
  
  public Integer getRed() {
    return this.red;
  }
  
  public void setRed(Integer paramInteger) {
    this.red = paramInteger;
  }
  
  public Integer getRedInterval() {
    return this.redInterval;
  }
  
  public void setRedInterval(Integer paramInteger) {
    this.redInterval = paramInteger;
  }
}
