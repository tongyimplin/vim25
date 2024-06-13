package com.vmware.vim25;

import com.vmware.vim25.ArrayOfComplianceFailureComplianceFailureValues;
import com.vmware.vim25.ComplianceFailureComplianceFailureValues;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComplianceFailureComplianceFailureValues", propOrder = {"complianceFailureComplianceFailureValues"})
public class ArrayOfComplianceFailureComplianceFailureValues {
  @XmlElement(name = "ComplianceFailureComplianceFailureValues")
  protected List<ComplianceFailureComplianceFailureValues> complianceFailureComplianceFailureValues;
  
  public List<ComplianceFailureComplianceFailureValues> getComplianceFailureComplianceFailureValues() {
    if (this.complianceFailureComplianceFailureValues == null)
      this.complianceFailureComplianceFailureValues = new ArrayList<>(); 
    return this.complianceFailureComplianceFailureValues;
  }
}
