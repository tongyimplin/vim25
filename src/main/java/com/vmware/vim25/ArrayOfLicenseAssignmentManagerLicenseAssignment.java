package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLicenseAssignmentManagerLicenseAssignment;
import com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseAssignmentManagerLicenseAssignment", propOrder = {"licenseAssignmentManagerLicenseAssignment"})
public class ArrayOfLicenseAssignmentManagerLicenseAssignment {
  @XmlElement(name = "LicenseAssignmentManagerLicenseAssignment")
  protected List<LicenseAssignmentManagerLicenseAssignment> licenseAssignmentManagerLicenseAssignment;
  
  public List<LicenseAssignmentManagerLicenseAssignment> getLicenseAssignmentManagerLicenseAssignment() {
    if (this.licenseAssignmentManagerLicenseAssignment == null)
      this.licenseAssignmentManagerLicenseAssignment = new ArrayList<>(); 
    return this.licenseAssignmentManagerLicenseAssignment;
  }
}
