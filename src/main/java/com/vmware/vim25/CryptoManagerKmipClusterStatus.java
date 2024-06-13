package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCertificateInfo;
import com.vmware.vim25.CryptoManagerKmipClusterStatus;
import com.vmware.vim25.CryptoManagerKmipServerStatus;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedEntityStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipClusterStatus", propOrder = {"clusterId", "overallStatus", "managementType", "servers", "clientCertInfo"})
public class CryptoManagerKmipClusterStatus extends DynamicData {
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  protected ManagedEntityStatus overallStatus;
  
  protected String managementType;
  
  @XmlElement(required = true)
  protected List<CryptoManagerKmipServerStatus> servers;
  
  protected CryptoManagerKmipCertificateInfo clientCertInfo;
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
  
  public String getManagementType() {
    return this.managementType;
  }
  
  public void setManagementType(String paramString) {
    this.managementType = paramString;
  }
  
  public List<CryptoManagerKmipServerStatus> getServers() {
    if (this.servers == null)
      this.servers = new ArrayList<>(); 
    return this.servers;
  }
  
  public CryptoManagerKmipCertificateInfo getClientCertInfo() {
    return this.clientCertInfo;
  }
  
  public void setClientCertInfo(CryptoManagerKmipCertificateInfo paramCryptoManagerKmipCertificateInfo) {
    this.clientCertInfo = paramCryptoManagerKmipCertificateInfo;
  }
}
