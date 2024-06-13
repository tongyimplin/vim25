package com.vmware.vim25;

import com.vmware.vim25.IntExpression;
import com.vmware.vim25.NegatableExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntExpression", propOrder = {"value"})
public class IntExpression extends NegatableExpression {
  protected Integer value;
  
  public Integer getValue() {
    return this.value;
  }
  
  public void setValue(Integer paramInteger) {
    this.value = paramInteger;
  }
}
