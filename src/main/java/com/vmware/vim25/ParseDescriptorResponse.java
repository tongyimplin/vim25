package com.vmware.vim25;

import com.vmware.vim25.OvfParseDescriptorResult;
import com.vmware.vim25.ParseDescriptorResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ParseDescriptorResponse")
public class ParseDescriptorResponse {
  @XmlElement(required = true)
  protected OvfParseDescriptorResult returnval;
  
  public OvfParseDescriptorResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(OvfParseDescriptorResult paramOvfParseDescriptorResult) {
    this.returnval = paramOvfParseDescriptorResult;
  }
}
