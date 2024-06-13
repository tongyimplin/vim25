package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerformanceManagerCounterLevelMapping;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceManagerCounterLevelMapping", propOrder = {"counterId", "aggregateLevel", "perDeviceLevel"})
public class PerformanceManagerCounterLevelMapping extends DynamicData {
  protected int counterId;
  
  protected Integer aggregateLevel;
  
  protected Integer perDeviceLevel;
  
  public int getCounterId() {
    return this.counterId;
  }
  
  public void setCounterId(int paramInt) {
    this.counterId = paramInt;
  }
  
  public Integer getAggregateLevel() {
    return this.aggregateLevel;
  }
  
  public void setAggregateLevel(Integer paramInteger) {
    this.aggregateLevel = paramInteger;
  }
  
  public Integer getPerDeviceLevel() {
    return this.perDeviceLevel;
  }
  
  public void setPerDeviceLevel(Integer paramInteger) {
    this.perDeviceLevel = paramInteger;
  }
}
