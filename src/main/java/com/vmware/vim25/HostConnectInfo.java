package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCapability;
import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.HostConnectInfoNetworkInfo;
import com.vmware.vim25.HostDatastoreConnectInfo;
import com.vmware.vim25.HostLicenseConnectInfo;
import com.vmware.vim25.HostListSummary;
import com.vmware.vim25.VirtualMachineSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectInfo", propOrder = {"serverIp", "inDasCluster", "host", "vm", "vimAccountNameRequired", "clusterSupported", "network", "datastore", "license", "capability"})
public class HostConnectInfo extends DynamicData {
  protected String serverIp;
  
  protected Boolean inDasCluster;
  
  @XmlElement(required = true)
  protected HostListSummary host;
  
  protected List<VirtualMachineSummary> vm;
  
  protected Boolean vimAccountNameRequired;
  
  protected Boolean clusterSupported;
  
  protected List<HostConnectInfoNetworkInfo> network;
  
  protected List<HostDatastoreConnectInfo> datastore;
  
  protected HostLicenseConnectInfo license;
  
  protected HostCapability capability;
  
  public String getServerIp() {
    return this.serverIp;
  }
  
  public void setServerIp(String paramString) {
    this.serverIp = paramString;
  }
  
  public Boolean isInDasCluster() {
    return this.inDasCluster;
  }
  
  public void setInDasCluster(Boolean paramBoolean) {
    this.inDasCluster = paramBoolean;
  }
  
  public HostListSummary getHost() {
    return this.host;
  }
  
  public void setHost(HostListSummary paramHostListSummary) {
    this.host = paramHostListSummary;
  }
  
  public List<VirtualMachineSummary> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
  
  public Boolean isVimAccountNameRequired() {
    return this.vimAccountNameRequired;
  }
  
  public void setVimAccountNameRequired(Boolean paramBoolean) {
    this.vimAccountNameRequired = paramBoolean;
  }
  
  public Boolean isClusterSupported() {
    return this.clusterSupported;
  }
  
  public void setClusterSupported(Boolean paramBoolean) {
    this.clusterSupported = paramBoolean;
  }
  
  public List<HostConnectInfoNetworkInfo> getNetwork() {
    if (this.network == null)
      this.network = new ArrayList<>(); 
    return this.network;
  }
  
  public List<HostDatastoreConnectInfo> getDatastore() {
    if (this.datastore == null)
      this.datastore = new ArrayList<>(); 
    return this.datastore;
  }
  
  public HostLicenseConnectInfo getLicense() {
    return this.license;
  }
  
  public void setLicense(HostLicenseConnectInfo paramHostLicenseConnectInfo) {
    this.license = paramHostLicenseConnectInfo;
  }
  
  public HostCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(HostCapability paramHostCapability) {
    this.capability = paramHostCapability;
  }
}
