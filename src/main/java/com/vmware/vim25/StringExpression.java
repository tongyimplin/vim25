package com.vmware.vim25;

import com.vmware.vim25.NegatableExpression;
import com.vmware.vim25.StringExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringExpression", propOrder = {"value"})
public class StringExpression extends NegatableExpression {
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
