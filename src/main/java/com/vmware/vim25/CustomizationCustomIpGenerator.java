package com.vmware.vim25;

import com.vmware.vim25.CustomizationCustomIpGenerator;
import com.vmware.vim25.CustomizationIpGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationCustomIpGenerator", propOrder = {"argument"})
public class CustomizationCustomIpGenerator extends CustomizationIpGenerator {
  protected String argument;
  
  public String getArgument() {
    return this.argument;
  }
  
  public void setArgument(String paramString) {
    this.argument = paramString;
  }
}
