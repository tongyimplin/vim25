package com.vmware.vim25;

import com.vmware.vim25.CheckCompatibilityRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCompatibilityRequestType", propOrder = {"_this", "vm", "host", "pool", "testType"})
public class CheckCompatibilityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference host;
  
  protected ManagedObjectReference pool;
  
  protected List<String> testType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPool() {
    return this.pool;
  }
  
  public void setPool(ManagedObjectReference paramManagedObjectReference) {
    this.pool = paramManagedObjectReference;
  }
  
  public List<String> getTestType() {
    if (this.testType == null)
      this.testType = new ArrayList<>(); 
    return this.testType;
  }
}
