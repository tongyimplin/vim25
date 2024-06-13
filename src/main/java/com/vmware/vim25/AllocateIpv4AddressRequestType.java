package com.vmware.vim25;

import com.vmware.vim25.AllocateIpv4AddressRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocateIpv4AddressRequestType", propOrder = {"_this", "dc", "poolId", "allocationId"})
public class AllocateIpv4AddressRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference dc;
  
  protected int poolId;
  
  @XmlElement(required = true)
  protected String allocationId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDc() {
    return this.dc;
  }
  
  public void setDc(ManagedObjectReference paramManagedObjectReference) {
    this.dc = paramManagedObjectReference;
  }
  
  public int getPoolId() {
    return this.poolId;
  }
  
  public void setPoolId(int paramInt) {
    this.poolId = paramInt;
  }
  
  public String getAllocationId() {
    return this.allocationId;
  }
  
  public void setAllocationId(String paramString) {
    this.allocationId = paramString;
  }
}
