package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDiagnosticManagerLogDescriptor;
import com.vmware.vim25.DiagnosticManagerLogDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticManagerLogDescriptor", propOrder = {"diagnosticManagerLogDescriptor"})
public class ArrayOfDiagnosticManagerLogDescriptor {
  @XmlElement(name = "DiagnosticManagerLogDescriptor")
  protected List<DiagnosticManagerLogDescriptor> diagnosticManagerLogDescriptor;
  
  public List<DiagnosticManagerLogDescriptor> getDiagnosticManagerLogDescriptor() {
    if (this.diagnosticManagerLogDescriptor == null)
      this.diagnosticManagerLogDescriptor = new ArrayList<>(); 
    return this.diagnosticManagerLogDescriptor;
  }
}
