package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPolicyOption;
import com.vmware.vim25.PolicyOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPolicyOption", propOrder = {"policyOption"})
public class ArrayOfPolicyOption {
  @XmlElement(name = "PolicyOption")
  protected List<PolicyOption> policyOption;
  
  public List<PolicyOption> getPolicyOption() {
    if (this.policyOption == null)
      this.policyOption = new ArrayList<>(); 
    return this.policyOption;
  }
}
