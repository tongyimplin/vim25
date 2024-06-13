package com.vmware.vim25;

import com.vmware.vim25.ComplianceResult;
import com.vmware.vim25.QueryComplianceStatusResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryComplianceStatusResponse")
public class QueryComplianceStatusResponse {
  protected List<ComplianceResult> returnval;
  
  public List<ComplianceResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
