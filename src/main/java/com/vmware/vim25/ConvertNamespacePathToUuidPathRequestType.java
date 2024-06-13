package com.vmware.vim25;

import com.vmware.vim25.ConvertNamespacePathToUuidPathRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertNamespacePathToUuidPathRequestType", propOrder = {"_this", "datacenter", "namespaceUrl"})
public class ConvertNamespacePathToUuidPathRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String namespaceUrl;
  
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
  
  public String getNamespaceUrl() {
    return this.namespaceUrl;
  }
  
  public void setNamespaceUrl(String paramString) {
    this.namespaceUrl = paramString;
  }
}
