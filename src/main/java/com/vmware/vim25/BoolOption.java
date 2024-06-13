package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.OptionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoolOption", propOrder = {"supported", "defaultValue"})
public class BoolOption extends OptionType {
  protected boolean supported;
  
  protected boolean defaultValue;
  
  public boolean isSupported() {
    return this.supported;
  }
  
  public void setSupported(boolean paramBoolean) {
    this.supported = paramBoolean;
  }
  
  public boolean isDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(boolean paramBoolean) {
    this.defaultValue = paramBoolean;
  }
}
