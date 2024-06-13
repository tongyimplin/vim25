package com.vmware.vim25;

import com.vmware.vim25.SSPIChallenge;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPIChallenge", propOrder = {"base64Token"})
public class SSPIChallenge extends VimFault {
  @XmlElement(required = true)
  protected String base64Token;
  
  public String getBase64Token() {
    return this.base64Token;
  }
  
  public void setBase64Token(String paramString) {
    this.base64Token = paramString;
  }
}
