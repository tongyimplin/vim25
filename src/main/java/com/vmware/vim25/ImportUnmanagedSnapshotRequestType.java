package com.vmware.vim25;

import com.vmware.vim25.ImportUnmanagedSnapshotRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportUnmanagedSnapshotRequestType", propOrder = {"_this", "vdisk", "datacenter", "vvolId"})
public class ImportUnmanagedSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vdisk;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String vvolId;
  
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
  
  public String getVvolId() {
    return this.vvolId;
  }
  
  public void setVvolId(String paramString) {
    this.vvolId = paramString;
  }
}
