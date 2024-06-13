package com.vmware.vim25;

import com.vmware.vim25.HostImageConfigGetProfileResponse;
import com.vmware.vim25.HostImageProfileSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HostImageConfigGetProfileResponse")
public class HostImageConfigGetProfileResponse {
  @XmlElement(required = true)
  protected HostImageProfileSummary returnval;
  
  public HostImageProfileSummary getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostImageProfileSummary paramHostImageProfileSummary) {
    this.returnval = paramHostImageProfileSummary;
  }
}
