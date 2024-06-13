package com.vmware.vim25;

import com.vmware.vim25.CreateImportSpecResponse;
import com.vmware.vim25.OvfCreateImportSpecResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CreateImportSpecResponse")
public class CreateImportSpecResponse {
  @XmlElement(required = true)
  protected OvfCreateImportSpecResult returnval;
  
  public OvfCreateImportSpecResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(OvfCreateImportSpecResult paramOvfCreateImportSpecResult) {
    this.returnval = paramOvfCreateImportSpecResult;
  }
}
