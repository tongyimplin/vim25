package com.vmware.vim25;

import com.vmware.vim25.Extension;
import com.vmware.vim25.FindExtensionResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FindExtensionResponse")
public class FindExtensionResponse {
  protected Extension returnval;
  
  public Extension getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(Extension paramExtension) {
    this.returnval = paramExtension;
  }
}
