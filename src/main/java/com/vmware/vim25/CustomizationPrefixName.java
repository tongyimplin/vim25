package com.vmware.vim25;

import com.vmware.vim25.CustomizationName;
import com.vmware.vim25.CustomizationPrefixName;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationPrefixName", propOrder = {"base"})
public class CustomizationPrefixName extends CustomizationName {
  @XmlElement(required = true)
  protected String base;
  
  public String getBase() {
    return this.base;
  }
  
  public void setBase(String paramString) {
    this.base = paramString;
  }
}
