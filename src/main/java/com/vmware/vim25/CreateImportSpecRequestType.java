package com.vmware.vim25;

import com.vmware.vim25.CreateImportSpecRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfCreateImportSpecParams;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateImportSpecRequestType", propOrder = {"_this", "ovfDescriptor", "resourcePool", "datastore", "cisp"})
public class CreateImportSpecRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String ovfDescriptor;
  
  @XmlElement(required = true)
  protected ManagedObjectReference resourcePool;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected OvfCreateImportSpecParams cisp;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getOvfDescriptor() {
    return this.ovfDescriptor;
  }
  
  public void setOvfDescriptor(String paramString) {
    this.ovfDescriptor = paramString;
  }
  
  public ManagedObjectReference getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ManagedObjectReference paramManagedObjectReference) {
    this.resourcePool = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public OvfCreateImportSpecParams getCisp() {
    return this.cisp;
  }
  
  public void setCisp(OvfCreateImportSpecParams paramOvfCreateImportSpecParams) {
    this.cisp = paramOvfCreateImportSpecParams;
  }
}
