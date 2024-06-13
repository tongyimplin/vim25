package com.vmware.vim25;

import com.vmware.vim25.CustomizationCustomName;
import com.vmware.vim25.CustomizationName;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationCustomName", propOrder = {"argument"})
public class CustomizationCustomName extends CustomizationName {
  protected String argument;
  
  public String getArgument() {
    return this.argument;
  }
  
  public void setArgument(String paramString) {
    this.argument = paramString;
  }
}
