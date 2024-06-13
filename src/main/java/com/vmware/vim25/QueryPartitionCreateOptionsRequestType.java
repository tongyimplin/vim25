package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryPartitionCreateOptionsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPartitionCreateOptionsRequestType", propOrder = {"_this", "storageType", "diagnosticType"})
public class QueryPartitionCreateOptionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String storageType;
  
  @XmlElement(required = true)
  protected String diagnosticType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getStorageType() {
    return this.storageType;
  }
  
  public void setStorageType(String paramString) {
    this.storageType = paramString;
  }
  
  public String getDiagnosticType() {
    return this.diagnosticType;
  }
  
  public void setDiagnosticType(String paramString) {
    this.diagnosticType = paramString;
  }
}
