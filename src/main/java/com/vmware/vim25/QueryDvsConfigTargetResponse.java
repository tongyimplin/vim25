package com.vmware.vim25;

import com.vmware.vim25.DVSManagerDvsConfigTarget;
import com.vmware.vim25.QueryDvsConfigTargetResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDvsConfigTargetResponse")
public class QueryDvsConfigTargetResponse {
  @XmlElement(required = true)
  protected DVSManagerDvsConfigTarget returnval;
  
  public DVSManagerDvsConfigTarget getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(DVSManagerDvsConfigTarget paramDVSManagerDvsConfigTarget) {
    this.returnval = paramDVSManagerDvsConfigTarget;
  }
}
