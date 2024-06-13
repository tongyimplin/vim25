package com.vmware.vim25;

import com.vmware.vim25.CustomizationCustomIpV6Generator;
import com.vmware.vim25.CustomizationIpV6Generator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationCustomIpV6Generator", propOrder = {"argument"})
public class CustomizationCustomIpV6Generator extends CustomizationIpV6Generator {
  protected String argument;
  
  public String getArgument() {
    return this.argument;
  }
  
  public void setArgument(String paramString) {
    this.argument = paramString;
  }
}
