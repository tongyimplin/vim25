package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IpPoolAssociation;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPoolAssociation", propOrder = {"network", "networkName"})
public class IpPoolAssociation extends DynamicData {
  protected ManagedObjectReference network;
  
  @XmlElement(required = true)
  protected String networkName;
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
  
  public String getNetworkName() {
    return this.networkName;
  }
  
  public void setNetworkName(String paramString) {
    this.networkName = paramString;
  }
}
