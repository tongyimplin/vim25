package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmFaultToleranceIssue;
import com.vmware.vim25.VmFaultToleranceOpIssuesList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceOpIssuesList", propOrder = {"errors", "warnings"})
public class VmFaultToleranceOpIssuesList extends VmFaultToleranceIssue {
  protected List<LocalizedMethodFault> errors;
  
  protected List<LocalizedMethodFault> warnings;
  
  public List<LocalizedMethodFault> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
  
  public List<LocalizedMethodFault> getWarnings() {
    if (this.warnings == null)
      this.warnings = new ArrayList<>(); 
    return this.warnings;
  }
}
