package com.vmware.vim25;

import com.vmware.vim25.QueryVmfsConfigOptionResponse;
import com.vmware.vim25.VmfsConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVmfsConfigOptionResponse")
public class QueryVmfsConfigOptionResponse {
  protected List<VmfsConfigOption> returnval;
  
  public List<VmfsConfigOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
