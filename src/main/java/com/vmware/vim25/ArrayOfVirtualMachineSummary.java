package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineSummary;
import com.vmware.vim25.VirtualMachineSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSummary", propOrder = {"virtualMachineSummary"})
public class ArrayOfVirtualMachineSummary {
  @XmlElement(name = "VirtualMachineSummary")
  protected List<VirtualMachineSummary> virtualMachineSummary;
  
  public List<VirtualMachineSummary> getVirtualMachineSummary() {
    if (this.virtualMachineSummary == null)
      this.virtualMachineSummary = new ArrayList<>(); 
    return this.virtualMachineSummary;
  }
}
