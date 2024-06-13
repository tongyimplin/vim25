package com.vmware.vim25;

import com.vmware.vim25.OvfValidateHostResult;
import com.vmware.vim25.ValidateHostResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ValidateHostResponse")
public class ValidateHostResponse {
  @XmlElement(required = true)
  protected OvfValidateHostResult returnval;
  
  public OvfValidateHostResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(OvfValidateHostResult paramOvfValidateHostResult) {
    this.returnval = paramOvfValidateHostResult;
  }
}
