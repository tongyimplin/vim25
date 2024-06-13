package com.vmware.vim25;

import com.vmware.vim25.QueryHostStatusResponse;
import com.vmware.vim25.VsanHostClusterStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryHostStatusResponse")
public class QueryHostStatusResponse {
  @XmlElement(required = true)
  protected VsanHostClusterStatus returnval;
  
  public VsanHostClusterStatus getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VsanHostClusterStatus paramVsanHostClusterStatus) {
    this.returnval = paramVsanHostClusterStatus;
  }
}
