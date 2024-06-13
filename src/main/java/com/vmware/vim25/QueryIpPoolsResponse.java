package com.vmware.vim25;

import com.vmware.vim25.IpPool;
import com.vmware.vim25.QueryIpPoolsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryIpPoolsResponse")
public class QueryIpPoolsResponse {
  protected List<IpPool> returnval;
  
  public List<IpPool> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
