package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCertificateInfo;
import com.vmware.vim25.CryptoManagerKmipServerStatus;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipServerStatus", propOrder = {"name", "status", "connectionStatus", "certInfo", "clientTrustServer", "serverTrustClient"})
public class CryptoManagerKmipServerStatus extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus status;
  
  @XmlElement(required = true)
  protected String connectionStatus;
  
  protected CryptoManagerKmipCertificateInfo certInfo;
  
  protected Boolean clientTrustServer;
  
  protected Boolean serverTrustClient;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
  
  public String getConnectionStatus() {
    return this.connectionStatus;
  }
  
  public void setConnectionStatus(String paramString) {
    this.connectionStatus = paramString;
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
  
  public Boolean isServerTrustClient() {
    return this.serverTrustClient;
  }
  
  public void setServerTrustClient(Boolean paramBoolean) {
    this.serverTrustClient = paramBoolean;
  }
}
