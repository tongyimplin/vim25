package com.vmware.vim25;

import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.QueryConnectionInfoViaSpecResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryConnectionInfoViaSpecResponse")
public class QueryConnectionInfoViaSpecResponse {
  @XmlElement(required = true)
  protected HostConnectInfo returnval;
  
  public HostConnectInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostConnectInfo paramHostConnectInfo) {
    this.returnval = paramHostConnectInfo;
  }
}
