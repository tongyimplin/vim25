package com.vmware.vim25;

import com.vmware.vim25.AlarmSetting;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmSetting", propOrder = {"toleranceRange", "reportingFrequency"})
public class AlarmSetting extends DynamicData {
  protected int toleranceRange;
  
  protected int reportingFrequency;
  
  public int getToleranceRange() {
    return this.toleranceRange;
  }
  
  public void setToleranceRange(int paramInt) {
    this.toleranceRange = paramInt;
  }
  
  public int getReportingFrequency() {
    return this.reportingFrequency;
  }
  
  public void setReportingFrequency(int paramInt) {
    this.reportingFrequency = paramInt;
  }
}
