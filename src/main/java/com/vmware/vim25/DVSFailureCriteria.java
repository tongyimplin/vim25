package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVSFailureCriteria;
import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.IntPolicy;
import com.vmware.vim25.StringPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFailureCriteria", propOrder = {"checkSpeed", "speed", "checkDuplex", "fullDuplex", "checkErrorPercent", "percentage", "checkBeacon"})
public class DVSFailureCriteria extends InheritablePolicy {
  protected StringPolicy checkSpeed;
  
  protected IntPolicy speed;
  
  protected BoolPolicy checkDuplex;
  
  protected BoolPolicy fullDuplex;
  
  protected BoolPolicy checkErrorPercent;
  
  protected IntPolicy percentage;
  
  protected BoolPolicy checkBeacon;
  
  public StringPolicy getCheckSpeed() {
    return this.checkSpeed;
  }
  
  public void setCheckSpeed(StringPolicy paramStringPolicy) {
    this.checkSpeed = paramStringPolicy;
  }
  
  public IntPolicy getSpeed() {
    return this.speed;
  }
  
  public void setSpeed(IntPolicy paramIntPolicy) {
    this.speed = paramIntPolicy;
  }
  
  public BoolPolicy getCheckDuplex() {
    return this.checkDuplex;
  }
  
  public void setCheckDuplex(BoolPolicy paramBoolPolicy) {
    this.checkDuplex = paramBoolPolicy;
  }
  
  public BoolPolicy getFullDuplex() {
    return this.fullDuplex;
  }
  
  public void setFullDuplex(BoolPolicy paramBoolPolicy) {
    this.fullDuplex = paramBoolPolicy;
  }
  
  public BoolPolicy getCheckErrorPercent() {
    return this.checkErrorPercent;
  }
  
  public void setCheckErrorPercent(BoolPolicy paramBoolPolicy) {
    this.checkErrorPercent = paramBoolPolicy;
  }
  
  public IntPolicy getPercentage() {
    return this.percentage;
  }
  
  public void setPercentage(IntPolicy paramIntPolicy) {
    this.percentage = paramIntPolicy;
  }
  
  public BoolPolicy getCheckBeacon() {
    return this.checkBeacon;
  }
  
  public void setCheckBeacon(BoolPolicy paramBoolPolicy) {
    this.checkBeacon = paramBoolPolicy;
  }
}
