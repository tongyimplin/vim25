package com.vmware.vim25;

import com.vmware.vim25.CanProvisionObjectsResponse;
import com.vmware.vim25.VsanPolicySatisfiability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CanProvisionObjectsResponse")
public class CanProvisionObjectsResponse {
  @XmlElement(required = true)
  protected List<VsanPolicySatisfiability> returnval;
  
  public List<VsanPolicySatisfiability> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
