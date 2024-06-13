package com.vmware.vim25;

import com.vmware.vim25.ArrayOfComplianceLocator;
import com.vmware.vim25.ComplianceLocator;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComplianceLocator", propOrder = {"complianceLocator"})
public class ArrayOfComplianceLocator {
  @XmlElement(name = "ComplianceLocator")
  protected List<ComplianceLocator> complianceLocator;
  
  public List<ComplianceLocator> getComplianceLocator() {
    if (this.complianceLocator == null)
      this.complianceLocator = new ArrayList<>(); 
    return this.complianceLocator;
  }
}
