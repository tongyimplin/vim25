package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReleaseManagedSnapshotRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseManagedSnapshotRequestType", propOrder = {"_this", "vdisk", "datacenter"})
public class ReleaseManagedSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vdisk;
  
  protected ManagedObjectReference datacenter;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVdisk() {
    return this.vdisk;
  }
  
  public void setVdisk(String paramString) {
    this.vdisk = paramString;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
}
