package com.vmware.vim25;

import com.vmware.vim25.HostNetworkConfigResult;
import com.vmware.vim25.UpdateNetworkConfigResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "UpdateNetworkConfigResponse")
public class UpdateNetworkConfigResponse {
  @XmlElement(required = true)
  protected HostNetworkConfigResult returnval;
  
  public HostNetworkConfigResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostNetworkConfigResult paramHostNetworkConfigResult) {
    this.returnval = paramHostNetworkConfigResult;
  }
}
