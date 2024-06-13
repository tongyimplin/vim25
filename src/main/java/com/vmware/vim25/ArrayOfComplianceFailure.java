package com.vmware.vim25;

import com.vmware.vim25.ArrayOfComplianceFailure;
import com.vmware.vim25.ComplianceFailure;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComplianceFailure", propOrder = {"complianceFailure"})
public class ArrayOfComplianceFailure {
  @XmlElement(name = "ComplianceFailure")
  protected List<ComplianceFailure> complianceFailure;
  
  public List<ComplianceFailure> getComplianceFailure() {
    if (this.complianceFailure == null)
      this.complianceFailure = new ArrayList<>(); 
    return this.complianceFailure;
  }
}
