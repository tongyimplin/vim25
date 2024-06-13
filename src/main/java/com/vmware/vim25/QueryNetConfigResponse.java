package com.vmware.vim25;

import com.vmware.vim25.QueryNetConfigResponse;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryNetConfigResponse")
public class QueryNetConfigResponse {
  protected VirtualNicManagerNetConfig returnval;
  
  public VirtualNicManagerNetConfig getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VirtualNicManagerNetConfig paramVirtualNicManagerNetConfig) {
    this.returnval = paramVirtualNicManagerNetConfig;
  }
}
