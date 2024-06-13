package com.vmware.vim25;

import com.vmware.vim25.ProfileDescription;
import com.vmware.vim25.RetrieveDescriptionResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveDescriptionResponse")
public class RetrieveDescriptionResponse {
  protected ProfileDescription returnval;
  
  public ProfileDescription getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ProfileDescription paramProfileDescription) {
    this.returnval = paramProfileDescription;
  }
}
