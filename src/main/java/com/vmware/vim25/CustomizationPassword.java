package com.vmware.vim25;

import com.vmware.vim25.CustomizationPassword;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationPassword", propOrder = {"value", "plainText"})
public class CustomizationPassword extends DynamicData {
  @XmlElement(required = true)
  protected String value;
  
  protected boolean plainText;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
  
  public boolean isPlainText() {
    return this.plainText;
  }
  
  public void setPlainText(boolean paramBoolean) {
    this.plainText = paramBoolean;
  }
}
