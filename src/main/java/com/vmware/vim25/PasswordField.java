package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PasswordField;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordField", propOrder = {"value"})
public class PasswordField extends DynamicData {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
