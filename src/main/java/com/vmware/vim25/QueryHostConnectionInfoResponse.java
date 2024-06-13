package com.vmware.vim25;

import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.QueryHostConnectionInfoResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryHostConnectionInfoResponse")
public class QueryHostConnectionInfoResponse {
  @XmlElement(required = true)
  protected HostConnectInfo returnval;
  
  public HostConnectInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostConnectInfo paramHostConnectInfo) {
    this.returnval = paramHostConnectInfo;
  }
}
