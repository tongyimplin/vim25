package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipServerCertInfo;
import com.vmware.vim25.RetrieveKmipServerCertResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveKmipServerCertResponse")
public class RetrieveKmipServerCertResponse {
  @XmlElement(required = true)
  protected CryptoManagerKmipServerCertInfo returnval;
  
  public CryptoManagerKmipServerCertInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(CryptoManagerKmipServerCertInfo paramCryptoManagerKmipServerCertInfo) {
    this.returnval = paramCryptoManagerKmipServerCertInfo;
  }
}
