package com.vmware.vim25;

import com.vmware.vim25.QueryConfigOptionResponse;
import com.vmware.vim25.VirtualMachineConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryConfigOptionResponse")
public class QueryConfigOptionResponse {
  protected VirtualMachineConfigOption returnval;
  
  public VirtualMachineConfigOption getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VirtualMachineConfigOption paramVirtualMachineConfigOption) {
    this.returnval = paramVirtualMachineConfigOption;
  }
}
