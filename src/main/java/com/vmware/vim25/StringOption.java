package com.vmware.vim25;

import com.vmware.vim25.OptionType;
import com.vmware.vim25.StringOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringOption", propOrder = {"defaultValue", "validCharacters"})
public class StringOption extends OptionType {
  @XmlElement(required = true)
  protected String defaultValue;
  
  protected String validCharacters;
  
  public String getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(String paramString) {
    this.defaultValue = paramString;
  }
  
  public String getValidCharacters() {
    return this.validCharacters;
  }
  
  public void setValidCharacters(String paramString) {
    this.validCharacters = paramString;
  }
}
