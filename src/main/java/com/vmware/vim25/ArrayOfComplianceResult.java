package com.vmware.vim25;

import com.vmware.vim25.ArrayOfComplianceResult;
import com.vmware.vim25.ComplianceResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComplianceResult", propOrder = {"complianceResult"})
public class ArrayOfComplianceResult {
  @XmlElement(name = "ComplianceResult")
  protected List<ComplianceResult> complianceResult;
  
  public List<ComplianceResult> getComplianceResult() {
    if (this.complianceResult == null)
      this.complianceResult = new ArrayList<>(); 
    return this.complianceResult;
  }
}
