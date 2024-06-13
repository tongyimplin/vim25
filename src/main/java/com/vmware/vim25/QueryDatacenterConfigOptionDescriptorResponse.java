package com.vmware.vim25;

import com.vmware.vim25.QueryDatacenterConfigOptionDescriptorResponse;
import com.vmware.vim25.VirtualMachineConfigOptionDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "queryDatacenterConfigOptionDescriptorResponse")
public class QueryDatacenterConfigOptionDescriptorResponse {
  protected List<VirtualMachineConfigOptionDescriptor> returnval;
  
  public List<VirtualMachineConfigOptionDescriptor> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
