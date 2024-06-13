package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.QueryDvsCompatibleHostSpecResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDvsCompatibleHostSpecResponse")
public class QueryDvsCompatibleHostSpecResponse {
  protected List<DistributedVirtualSwitchHostProductSpec> returnval;
  
  public List<DistributedVirtualSwitchHostProductSpec> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
