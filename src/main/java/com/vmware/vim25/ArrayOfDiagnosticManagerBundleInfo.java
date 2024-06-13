package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDiagnosticManagerBundleInfo;
import com.vmware.vim25.DiagnosticManagerBundleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticManagerBundleInfo", propOrder = {"diagnosticManagerBundleInfo"})
public class ArrayOfDiagnosticManagerBundleInfo {
  @XmlElement(name = "DiagnosticManagerBundleInfo")
  protected List<DiagnosticManagerBundleInfo> diagnosticManagerBundleInfo;
  
  public List<DiagnosticManagerBundleInfo> getDiagnosticManagerBundleInfo() {
    if (this.diagnosticManagerBundleInfo == null)
      this.diagnosticManagerBundleInfo = new ArrayList<>(); 
    return this.diagnosticManagerBundleInfo;
  }
}
