package com.vmware.vim25;

import com.vmware.vim25.IpPool;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateIpPoolRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpPoolRequestType", propOrder = {"_this", "dc", "pool"})
public class UpdateIpPoolRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference dc;
  
  @XmlElement(required = true)
  protected IpPool pool;
  
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
  
  public IpPool getPool() {
    return this.pool;
  }
  
  public void setPool(IpPool paramIpPool) {
    this.pool = paramIpPool;
  }
}
