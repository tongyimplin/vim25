package com.vmware.vim25;

import com.vmware.vim25.CloneSessionResponse;
import com.vmware.vim25.UserSession;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CloneSessionResponse")
public class CloneSessionResponse {
  @XmlElement(required = true)
  protected UserSession returnval;
  
  public UserSession getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(UserSession paramUserSession) {
    this.returnval = paramUserSession;
  }
}
