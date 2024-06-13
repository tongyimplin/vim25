package com.vmware.vim25;

import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.QueryConnectionInfoResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryConnectionInfoResponse")
public class QueryConnectionInfoResponse {
  @XmlElement(required = true)
  protected HostConnectInfo returnval;
  
  public HostConnectInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostConnectInfo paramHostConnectInfo) {
    this.returnval = paramHostConnectInfo;
  }
}
