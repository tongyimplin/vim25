package com.vmware.vim25;

import com.vmware.vim25.CreateDescriptorResponse;
import com.vmware.vim25.OvfCreateDescriptorResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CreateDescriptorResponse")
public class CreateDescriptorResponse {
  @XmlElement(required = true)
  protected OvfCreateDescriptorResult returnval;
  
  public OvfCreateDescriptorResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(OvfCreateDescriptorResult paramOvfCreateDescriptorResult) {
    this.returnval = paramOvfCreateDescriptorResult;
  }
}
