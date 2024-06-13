package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanPolicySatisfiability;
import com.vmware.vim25.VsanPolicySatisfiability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanPolicySatisfiability", propOrder = {"vsanPolicySatisfiability"})
public class ArrayOfVsanPolicySatisfiability {
  @XmlElement(name = "VsanPolicySatisfiability")
  protected List<VsanPolicySatisfiability> vsanPolicySatisfiability;
  
  public List<VsanPolicySatisfiability> getVsanPolicySatisfiability() {
    if (this.vsanPolicySatisfiability == null)
      this.vsanPolicySatisfiability = new ArrayList<>(); 
    return this.vsanPolicySatisfiability;
  }
}
