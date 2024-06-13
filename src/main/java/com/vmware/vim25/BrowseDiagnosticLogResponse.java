package com.vmware.vim25;

import com.vmware.vim25.BrowseDiagnosticLogResponse;
import com.vmware.vim25.DiagnosticManagerLogHeader;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "BrowseDiagnosticLogResponse")
public class BrowseDiagnosticLogResponse {
  @XmlElement(required = true)
  protected DiagnosticManagerLogHeader returnval;
  
  public DiagnosticManagerLogHeader getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(DiagnosticManagerLogHeader paramDiagnosticManagerLogHeader) {
    this.returnval = paramDiagnosticManagerLogHeader;
  }
}
