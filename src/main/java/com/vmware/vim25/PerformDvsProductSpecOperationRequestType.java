package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerformDvsProductSpecOperationRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformDvsProductSpecOperationRequestType", propOrder = {"_this", "operation", "productSpec"})
public class PerformDvsProductSpecOperationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String operation;
  
  protected DistributedVirtualSwitchProductSpec productSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
  
  public DistributedVirtualSwitchProductSpec getProductSpec() {
    return this.productSpec;
  }
  
  public void setProductSpec(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productSpec = paramDistributedVirtualSwitchProductSpec;
  }
}
