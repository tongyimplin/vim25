package com.vmware.vim25;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConfigSummary;
import com.vmware.vim25.HostFeatureVersionInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigSummary", propOrder = {"name", "port", "sslThumbprint", "product", "vmotionEnabled", "faultToleranceEnabled", "featureVersion", "agentVmDatastore", "agentVmNetwork"})
public class HostConfigSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected int port;
  
  protected String sslThumbprint;
  
  protected AboutInfo product;
  
  protected boolean vmotionEnabled;
  
  protected Boolean faultToleranceEnabled;
  
  protected List<HostFeatureVersionInfo> featureVersion;
  
  protected ManagedObjectReference agentVmDatastore;
  
  protected ManagedObjectReference agentVmNetwork;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
  
  public AboutInfo getProduct() {
    return this.product;
  }
  
  public void setProduct(AboutInfo paramAboutInfo) {
    this.product = paramAboutInfo;
  }
  
  public boolean isVmotionEnabled() {
    return this.vmotionEnabled;
  }
  
  public void setVmotionEnabled(boolean paramBoolean) {
    this.vmotionEnabled = paramBoolean;
  }
  
  public Boolean isFaultToleranceEnabled() {
    return this.faultToleranceEnabled;
  }
  
  public void setFaultToleranceEnabled(Boolean paramBoolean) {
    this.faultToleranceEnabled = paramBoolean;
  }
  
  public List<HostFeatureVersionInfo> getFeatureVersion() {
    if (this.featureVersion == null)
      this.featureVersion = new ArrayList<>(); 
    return this.featureVersion;
  }
  
  public ManagedObjectReference getAgentVmDatastore() {
    return this.agentVmDatastore;
  }
  
  public void setAgentVmDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.agentVmDatastore = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAgentVmNetwork() {
    return this.agentVmNetwork;
  }
  
  public void setAgentVmNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.agentVmNetwork = paramManagedObjectReference;
  }
}
