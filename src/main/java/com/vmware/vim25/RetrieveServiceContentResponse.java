package com.vmware.vim25;

import com.vmware.vim25.RetrieveServiceContentResponse;
import com.vmware.vim25.ServiceContent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveServiceContentResponse")
public class RetrieveServiceContentResponse {
  @XmlElement(required = true)
  protected ServiceContent returnval;
  
  public ServiceContent getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ServiceContent paramServiceContent) {
    this.returnval = paramServiceContent;
  }
}
