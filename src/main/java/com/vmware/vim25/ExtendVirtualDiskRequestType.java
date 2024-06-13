package com.vmware.vim25;

import com.vmware.vim25.ExtendVirtualDiskRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendVirtualDiskRequestType", propOrder = {"_this", "name", "datacenter", "newCapacityKb", "eagerZero"})
public class ExtendVirtualDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected ManagedObjectReference datacenter;
  
  protected long newCapacityKb;
  
  protected Boolean eagerZero;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public long getNewCapacityKb() {
    return this.newCapacityKb;
  }
  
  public void setNewCapacityKb(long paramLong) {
    this.newCapacityKb = paramLong;
  }
  
  public Boolean isEagerZero() {
    return this.eagerZero;
  }
  
  public void setEagerZero(Boolean paramBoolean) {
    this.eagerZero = paramBoolean;
  }
}
