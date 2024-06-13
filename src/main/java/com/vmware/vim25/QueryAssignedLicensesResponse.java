package com.vmware.vim25;

import com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment;
import com.vmware.vim25.QueryAssignedLicensesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAssignedLicensesResponse")
public class QueryAssignedLicensesResponse {
  protected List<LicenseAssignmentManagerLicenseAssignment> returnval;
  
  public List<LicenseAssignmentManagerLicenseAssignment> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
