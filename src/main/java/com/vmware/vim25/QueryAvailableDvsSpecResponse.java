package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.QueryAvailableDvsSpecResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAvailableDvsSpecResponse")
public class QueryAvailableDvsSpecResponse {
  protected List<DistributedVirtualSwitchProductSpec> returnval;
  
  public List<DistributedVirtualSwitchProductSpec> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
