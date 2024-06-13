package com.vmware.vim25;

import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.LongPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongPolicy", propOrder = {"value"})
public class LongPolicy extends InheritablePolicy {
  protected Long value;
  
  public Long getValue() {
    return this.value;
  }
  
  public void setValue(Long paramLong) {
    this.value = paramLong;
  }
}
