package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.OptionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntOption", propOrder = {"min", "max", "defaultValue"})
public class IntOption extends OptionType {
  protected int min;
  
  protected int max;
  
  protected int defaultValue;
  
  public int getMin() {
    return this.min;
  }
  
  public void setMin(int paramInt) {
    this.min = paramInt;
  }
  
  public int getMax() {
    return this.max;
  }
  
  public void setMax(int paramInt) {
    this.max = paramInt;
  }
  
  public int getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(int paramInt) {
    this.defaultValue = paramInt;
  }
}
