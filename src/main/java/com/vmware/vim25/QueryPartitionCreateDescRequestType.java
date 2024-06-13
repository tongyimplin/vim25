package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryPartitionCreateDescRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPartitionCreateDescRequestType", propOrder = {"_this", "diskUuid", "diagnosticType"})
public class QueryPartitionCreateDescRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String diskUuid;
  
  @XmlElement(required = true)
  protected String diagnosticType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDiskUuid() {
    return this.diskUuid;
  }
  
  public void setDiskUuid(String paramString) {
    this.diskUuid = paramString;
  }
  
  public String getDiagnosticType() {
    return this.diagnosticType;
  }
  
  public void setDiagnosticType(String paramString) {
    this.diagnosticType = paramString;
  }
}
