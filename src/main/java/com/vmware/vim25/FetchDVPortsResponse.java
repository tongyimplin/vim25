package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPort;
import com.vmware.vim25.FetchDVPortsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FetchDVPortsResponse")
public class FetchDVPortsResponse {
  protected List<DistributedVirtualPort> returnval;
  
  public List<DistributedVirtualPort> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
