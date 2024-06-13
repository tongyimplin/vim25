package com.vmware.vim25;

import com.vmware.vim25.CustomizationIdentitySettings;
import com.vmware.vim25.CustomizationSysprepText;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSysprepText", propOrder = {"value"})
public class CustomizationSysprepText extends CustomizationIdentitySettings {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
