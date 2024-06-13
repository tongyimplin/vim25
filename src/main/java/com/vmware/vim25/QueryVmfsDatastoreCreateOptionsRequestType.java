package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryVmfsDatastoreCreateOptionsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryVmfsDatastoreCreateOptionsRequestType", propOrder = {"_this", "devicePath", "vmfsMajorVersion"})
public class QueryVmfsDatastoreCreateOptionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String devicePath;
  
  protected Integer vmfsMajorVersion;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public Integer getVmfsMajorVersion() {
    return this.vmfsMajorVersion;
  }
  
  public void setVmfsMajorVersion(Integer paramInteger) {
    this.vmfsMajorVersion = paramInteger;
  }
}
