package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanPolicyChangeBatch;
import com.vmware.vim25.VsanPolicyChangeBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanPolicyChangeBatch", propOrder = {"vsanPolicyChangeBatch"})
public class ArrayOfVsanPolicyChangeBatch {
  @XmlElement(name = "VsanPolicyChangeBatch")
  protected List<VsanPolicyChangeBatch> vsanPolicyChangeBatch;
  
  public List<VsanPolicyChangeBatch> getVsanPolicyChangeBatch() {
    if (this.vsanPolicyChangeBatch == null)
      this.vsanPolicyChangeBatch = new ArrayList<>(); 
    return this.vsanPolicyChangeBatch;
  }
}
