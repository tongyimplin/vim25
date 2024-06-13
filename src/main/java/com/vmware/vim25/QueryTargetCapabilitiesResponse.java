package com.vmware.vim25;

import com.vmware.vim25.HostCapability;
import com.vmware.vim25.QueryTargetCapabilitiesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryTargetCapabilitiesResponse")
public class QueryTargetCapabilitiesResponse {
  protected HostCapability returnval;
  
  public HostCapability getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostCapability paramHostCapability) {
    this.returnval = paramHostCapability;
  }
}
