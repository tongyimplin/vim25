package com.vmware.vim25;

import com.vmware.vim25.InvalidRequest;
import com.vmware.vim25.InvalidType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidType", propOrder = {"argument"})
public class InvalidType extends InvalidRequest {
  protected String argument;
  
  public String getArgument() {
    return this.argument;
  }
  
  public void setArgument(String paramString) {
    this.argument = paramString;
  }
}
