package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.MethodActionArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodActionArgument", propOrder = {"value"})
public class MethodActionArgument extends DynamicData {
  protected Object value;
  
  public Object getValue() {
    return this.value;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
  }
}
