package com.vmware.vim25;

import com.vmware.vim25.IpPoolManagerIpAllocation;
import com.vmware.vim25.QueryIPAllocationsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryIPAllocationsResponse")
public class QueryIPAllocationsResponse {
  @XmlElement(required = true)
  protected List<IpPoolManagerIpAllocation> returnval;
  
  public List<IpPoolManagerIpAllocation> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
