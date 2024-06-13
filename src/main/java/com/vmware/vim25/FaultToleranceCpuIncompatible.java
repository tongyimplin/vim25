package com.vmware.vim25;

import com.vmware.vim25.CpuIncompatible;
import com.vmware.vim25.FaultToleranceCpuIncompatible;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceCpuIncompatible", propOrder = {"model", "family", "stepping"})
public class FaultToleranceCpuIncompatible extends CpuIncompatible {
  protected boolean model;
  
  protected boolean family;
  
  protected boolean stepping;
  
  public boolean isModel() {
    return this.model;
  }
  
  public void setModel(boolean paramBoolean) {
    this.model = paramBoolean;
  }
  
  public boolean isFamily() {
    return this.family;
  }
  
  public void setFamily(boolean paramBoolean) {
    this.family = paramBoolean;
  }
  
  public boolean isStepping() {
    return this.stepping;
  }
  
  public void setStepping(boolean paramBoolean) {
    this.stepping = paramBoolean;
  }
}
