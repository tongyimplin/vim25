package com.vmware.vim25;

import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.IntPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntPolicy", propOrder = {"value"})
public class IntPolicy extends InheritablePolicy {
  protected Integer value;
  
  public Integer getValue() {
    return this.value;
  }
  
  public void setValue(Integer paramInteger) {
    this.value = paramInteger;
  }
}
