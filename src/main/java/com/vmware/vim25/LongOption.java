package com.vmware.vim25;

import com.vmware.vim25.LongOption;
import com.vmware.vim25.OptionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongOption", propOrder = {"min", "max", "defaultValue"})
public class LongOption extends OptionType {
  protected long min;
  
  protected long max;
  
  protected long defaultValue;
  
  public long getMin() {
    return this.min;
  }
  
  public void setMin(long paramLong) {
    this.min = paramLong;
  }
  
  public long getMax() {
    return this.max;
  }
  
  public void setMax(long paramLong) {
    this.max = paramLong;
  }
  
  public long getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(long paramLong) {
    this.defaultValue = paramLong;
  }
}
