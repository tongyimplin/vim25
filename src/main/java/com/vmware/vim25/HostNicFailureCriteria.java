package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNicFailureCriteria;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicFailureCriteria", propOrder = {"checkSpeed", "speed", "checkDuplex", "fullDuplex", "checkErrorPercent", "percentage", "checkBeacon"})
public class HostNicFailureCriteria extends DynamicData {
  protected String checkSpeed;
  
  protected Integer speed;
  
  protected Boolean checkDuplex;
  
  protected Boolean fullDuplex;
  
  protected Boolean checkErrorPercent;
  
  protected Integer percentage;
  
  protected Boolean checkBeacon;
  
  public String getCheckSpeed() {
    return this.checkSpeed;
  }
  
  public void setCheckSpeed(String paramString) {
    this.checkSpeed = paramString;
  }
  
  public Integer getSpeed() {
    return this.speed;
  }
  
  public void setSpeed(Integer paramInteger) {
    this.speed = paramInteger;
  }
  
  public Boolean isCheckDuplex() {
    return this.checkDuplex;
  }
  
  public void setCheckDuplex(Boolean paramBoolean) {
    this.checkDuplex = paramBoolean;
  }
  
  public Boolean isFullDuplex() {
    return this.fullDuplex;
  }
  
  public void setFullDuplex(Boolean paramBoolean) {
    this.fullDuplex = paramBoolean;
  }
  
  public Boolean isCheckErrorPercent() {
    return this.checkErrorPercent;
  }
  
  public void setCheckErrorPercent(Boolean paramBoolean) {
    this.checkErrorPercent = paramBoolean;
  }
  
  public Integer getPercentage() {
    return this.percentage;
  }
  
  public void setPercentage(Integer paramInteger) {
    this.percentage = paramInteger;
  }
  
  public Boolean isCheckBeacon() {
    return this.checkBeacon;
  }
  
  public void setCheckBeacon(Boolean paramBoolean) {
    this.checkBeacon = paramBoolean;
  }
}
