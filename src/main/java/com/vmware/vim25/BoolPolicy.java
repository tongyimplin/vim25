package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.InheritablePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoolPolicy", propOrder = {"value"})
public class BoolPolicy extends InheritablePolicy {
  protected Boolean value;
  
  public Boolean isValue() {
    return this.value;
  }
  
  public void setValue(Boolean paramBoolean) {
    this.value = paramBoolean;
  }
}
