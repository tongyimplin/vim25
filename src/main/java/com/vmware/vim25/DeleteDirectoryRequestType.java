package com.vmware.vim25;

import com.vmware.vim25.DeleteDirectoryRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteDirectoryRequestType", propOrder = {"_this", "datacenter", "datastorePath"})
public class DeleteDirectoryRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String datastorePath;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public String getDatastorePath() {
    return this.datastorePath;
  }
  
  public void setDatastorePath(String paramString) {
    this.datastorePath = paramString;
  }
}
