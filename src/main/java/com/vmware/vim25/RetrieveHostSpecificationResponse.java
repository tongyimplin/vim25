package com.vmware.vim25;

import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.RetrieveHostSpecificationResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveHostSpecificationResponse")
public class RetrieveHostSpecificationResponse {
  @XmlElement(required = true)
  protected HostSpecification returnval;
  
  public HostSpecification getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostSpecification paramHostSpecification) {
    this.returnval = paramHostSpecification;
  }
}
