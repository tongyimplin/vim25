package com.vmware.vim25;

import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.StringPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringPolicy", propOrder = {"value"})
public class StringPolicy extends InheritablePolicy {
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
