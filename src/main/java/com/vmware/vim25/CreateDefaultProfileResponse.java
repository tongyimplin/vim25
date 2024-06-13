package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.CreateDefaultProfileResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CreateDefaultProfileResponse")
public class CreateDefaultProfileResponse {
  @XmlElement(required = true)
  protected ApplyProfile returnval;
  
  public ApplyProfile getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ApplyProfile paramApplyProfile) {
    this.returnval = paramApplyProfile;
  }
}
