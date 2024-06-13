package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCertificateInfo;
import com.vmware.vim25.CryptoManagerKmipServerCertInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipServerCertInfo", propOrder = {"certificate", "certInfo", "clientTrustServer"})
public class CryptoManagerKmipServerCertInfo extends DynamicData {
  @XmlElement(required = true)
  protected String certificate;
  
  protected CryptoManagerKmipCertificateInfo certInfo;
  
  protected Boolean clientTrustServer;
  
  public String getCertificate() {
    return this.certificate;
  }
  
  public void setCertificate(String paramString) {
    this.certificate = paramString;
  }
  
  public CryptoManagerKmipCertificateInfo getCertInfo() {
    return this.certInfo;
  }
  
  public void setCertInfo(CryptoManagerKmipCertificateInfo paramCryptoManagerKmipCertificateInfo) {
    this.certInfo = paramCryptoManagerKmipCertificateInfo;
  }
  
  public Boolean isClientTrustServer() {
    return this.clientTrustServer;
  }
  
  public void setClientTrustServer(Boolean paramBoolean) {
    this.clientTrustServer = paramBoolean;
  }
}
