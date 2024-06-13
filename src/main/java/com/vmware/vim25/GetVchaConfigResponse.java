package com.vmware.vim25;

import com.vmware.vim25.GetVchaConfigResponse;
import com.vmware.vim25.VchaClusterConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "getVchaConfigResponse")
public class GetVchaConfigResponse {
  @XmlElement(required = true)
  protected VchaClusterConfigInfo returnval;
  
  public VchaClusterConfigInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VchaClusterConfigInfo paramVchaClusterConfigInfo) {
    this.returnval = paramVchaClusterConfigInfo;
  }
}
