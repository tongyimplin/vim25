package com.vmware.vim25;

import com.vmware.vim25.ExecuteHostProfileResponse;
import com.vmware.vim25.ProfileExecuteResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ExecuteHostProfileResponse")
public class ExecuteHostProfileResponse {
  @XmlElement(required = true)
  protected ProfileExecuteResult returnval;
  
  public ProfileExecuteResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ProfileExecuteResult paramProfileExecuteResult) {
    this.returnval = paramProfileExecuteResult;
  }
}
