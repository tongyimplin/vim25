package com.vmware.vim25;

import com.vmware.vim25.GetVchaClusterHealthResponse;
import com.vmware.vim25.VchaClusterHealth;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GetVchaClusterHealthResponse")
public class GetVchaClusterHealthResponse {
  @XmlElement(required = true)
  protected VchaClusterHealth returnval;
  
  public VchaClusterHealth getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VchaClusterHealth paramVchaClusterHealth) {
    this.returnval = paramVchaClusterHealth;
  }
}
