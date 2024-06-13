package com.vmware.vim25;

import com.vmware.vim25.FloatOption;
import com.vmware.vim25.OptionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatOption", propOrder = {"min", "max", "defaultValue"})
public class FloatOption extends OptionType {
  protected float min;
  
  protected float max;
  
  protected float defaultValue;
  
  public float getMin() {
    return this.min;
  }
  
  public void setMin(float paramFloat) {
    this.min = paramFloat;
  }
  
  public float getMax() {
    return this.max;
  }
  
  public void setMax(float paramFloat) {
    this.max = paramFloat;
  }
  
  public float getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(float paramFloat) {
    this.defaultValue = paramFloat;
  }
}
