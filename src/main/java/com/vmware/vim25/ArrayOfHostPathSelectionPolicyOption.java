package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPathSelectionPolicyOption;
import com.vmware.vim25.HostPathSelectionPolicyOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPathSelectionPolicyOption", propOrder = {"hostPathSelectionPolicyOption"})
public class ArrayOfHostPathSelectionPolicyOption {
  @XmlElement(name = "HostPathSelectionPolicyOption")
  protected List<HostPathSelectionPolicyOption> hostPathSelectionPolicyOption;
  
  public List<HostPathSelectionPolicyOption> getHostPathSelectionPolicyOption() {
    if (this.hostPathSelectionPolicyOption == null)
      this.hostPathSelectionPolicyOption = new ArrayList<>(); 
    return this.hostPathSelectionPolicyOption;
  }
}
