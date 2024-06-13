package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NetworkSummary;
import com.vmware.vim25.OpaqueNetworkSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSummary", propOrder = {"network", "name", "accessible", "ipPoolName", "ipPoolId"})
@XmlSeeAlso({OpaqueNetworkSummary.class})
public class NetworkSummary extends DynamicData {
  protected ManagedObjectReference network;
  
  @XmlElement(required = true)
  protected String name;
  
  protected boolean accessible;
  
  protected String ipPoolName;
  
  protected Integer ipPoolId;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public boolean isAccessible() {
    return this.accessible;
  }
  
  public void setAccessible(boolean paramBoolean) {
    this.accessible = paramBoolean;
  }
  
  public String getIpPoolName() {
    return this.ipPoolName;
  }
  
  public void setIpPoolName(String paramString) {
    this.ipPoolName = paramString;
  }
  
  public Integer getIpPoolId() {
    return this.ipPoolId;
  }
  
  public void setIpPoolId(Integer paramInteger) {
    this.ipPoolId = paramInteger;
  }
}
