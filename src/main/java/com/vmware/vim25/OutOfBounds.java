package com.vmware.vim25;

import com.vmware.vim25.OutOfBounds;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfBounds", propOrder = {"argumentName"})
public class OutOfBounds extends VimFault {
  @XmlElement(required = true)
  protected String argumentName;
  
  public String getArgumentName() {
    return this.argumentName;
  }
  
  public void setArgumentName(String paramString) {
    this.argumentName = paramString;
  }
}
