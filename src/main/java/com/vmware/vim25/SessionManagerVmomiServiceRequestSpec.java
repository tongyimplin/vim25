package com.vmware.vim25;

import com.vmware.vim25.SessionManagerServiceRequestSpec;
import com.vmware.vim25.SessionManagerVmomiServiceRequestSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagerVmomiServiceRequestSpec", propOrder = {"method"})
public class SessionManagerVmomiServiceRequestSpec extends SessionManagerServiceRequestSpec {
  @XmlElement(required = true)
  protected String method;
  
  public String getMethod() {
    return this.method;
  }
  
  public void setMethod(String paramString) {
    this.method = paramString;
  }
}
