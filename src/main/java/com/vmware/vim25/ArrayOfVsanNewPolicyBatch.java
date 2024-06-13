package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanNewPolicyBatch;
import com.vmware.vim25.VsanNewPolicyBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanNewPolicyBatch", propOrder = {"vsanNewPolicyBatch"})
public class ArrayOfVsanNewPolicyBatch {
  @XmlElement(name = "VsanNewPolicyBatch")
  protected List<VsanNewPolicyBatch> vsanNewPolicyBatch;
  
  public List<VsanNewPolicyBatch> getVsanNewPolicyBatch() {
    if (this.vsanNewPolicyBatch == null)
      this.vsanNewPolicyBatch = new ArrayList<>(); 
    return this.vsanNewPolicyBatch;
  }
}
