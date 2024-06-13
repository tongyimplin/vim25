package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfMetricId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfMetricId", propOrder = {"counterId", "instance"})
public class PerfMetricId extends DynamicData {
  protected int counterId;
  
  @XmlElement(required = true)
  protected String instance;
  
  public int getCounterId() {
    return this.counterId;
  }
  
  public void setCounterId(int paramInt) {
    this.counterId = paramInt;
  }
  
  public String getInstance() {
    return this.instance;
  }
  
  public void setInstance(String paramString) {
    this.instance = paramString;
  }
}
