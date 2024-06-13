package com.vmware.vim25;

import com.vmware.vim25.ContinueRetrievePropertiesExResponse;
import com.vmware.vim25.RetrieveResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ContinueRetrievePropertiesExResponse")
public class ContinueRetrievePropertiesExResponse {
  @XmlElement(required = true)
  protected RetrieveResult returnval;
  
  public RetrieveResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(RetrieveResult paramRetrieveResult) {
    this.returnval = paramRetrieveResult;
  }
}
