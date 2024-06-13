package com.vmware.vim25;

import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.SSLVerifyFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSLVerifyFault", propOrder = {"selfSigned", "thumbprint"})
public class SSLVerifyFault extends HostConnectFault {
  protected boolean selfSigned;
  
  @XmlElement(required = true)
  protected String thumbprint;
  
  public boolean isSelfSigned() {
    return this.selfSigned;
  }
  
  public void setSelfSigned(boolean paramBoolean) {
    this.selfSigned = paramBoolean;
  }
  
  public String getThumbprint() {
    return this.thumbprint;
  }
  
  public void setThumbprint(String paramString) {
    this.thumbprint = paramString;
  }
}
