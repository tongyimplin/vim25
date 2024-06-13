package com.vmware.vim25;

import com.vmware.vim25.GatewayToHostConnectFault;
import com.vmware.vim25.GatewayToHostTrustVerifyFault;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayToHostTrustVerifyFault", propOrder = {"verificationToken", "propertiesToVerify"})
public class GatewayToHostTrustVerifyFault extends GatewayToHostConnectFault {
  @XmlElement(required = true)
  protected String verificationToken;
  
  @XmlElement(required = true)
  protected List<KeyValue> propertiesToVerify;
  
  public String getVerificationToken() {
    return this.verificationToken;
  }
  
  public void setVerificationToken(String paramString) {
    this.verificationToken = paramString;
  }
  
  public List<KeyValue> getPropertiesToVerify() {
    if (this.propertiesToVerify == null)
      this.propertiesToVerify = new ArrayList<>(); 
    return this.propertiesToVerify;
  }
}
